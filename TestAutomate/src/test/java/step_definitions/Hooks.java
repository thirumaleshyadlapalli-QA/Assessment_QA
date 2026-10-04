package step_definitions;

import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.apache.commons.compress.utils.IOUtils;
import testlink.api.java.client.TestLinkAPIResults;
import utilities.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Base64;

public class Hooks {

    private static final String BSTACK_PASSED = "passed";
    private static final String BSTACK_FAILED = "failed";

    static String testCaseDescription;
    String imagePath;
    String pathForLogger;

    @Before("@SwagLabs")
    public void beforeMobileTestMethod(Scenario scenario)  {

        if (scenario.getName().contains("_"))
            testCaseDescription = scenario.getName().split("_")[1].trim();
        else
            testCaseDescription = scenario.getName();

        RunCukesTest.logger = RunCukesTest.extent.startTest(testCaseDescription);
        RunCukesTest.tagName = scenario.getSourceTagNames().toString().replace("[@", "").replace("]", "").trim();

        LogUtil.infoLog(getClass(),
                "\n+----------------------------------------------------------------------------------------------------------------------------+");
        LogUtil.infoLog(getClass(), "Mobile Tests Started: " + scenario.getName());

        LogUtil.infoLog(Hooks.class,
                "Mobile Test is executed in OS: " + GlobalUtil.getCommonSettings().getAndroidName());
    }

    @After("@SwagLabs")
    public void afterMobileTestMethod(Scenario scenario) {
        String testName;

        if (scenario.getName().contains("_"))
            testName = scenario.getName().split("_")[0].trim();
        else
            testName = scenario.getName();

        if (scenario.isFailed()) {
            try {
                String scFileName = "ScreenShot_" + System.currentTimeMillis();
                String screenshotFilePath = ConfigReader.getValue("screenshotPath") + "\\" + scFileName + ".png";

                imagePath = HTMLReportUtil.testFailMobileTakeScreenshot(screenshotFilePath);

                InputStream is = new FileInputStream(imagePath);
                byte[] imageBytes = IOUtils.toByteArray(is);
                Thread.sleep(2000);
                String base64 = Base64.getEncoder().encodeToString(imageBytes);
                pathForLogger = RunCukesTest.logger.addBase64ScreenShot("data:image/png;base64," + base64);
                RunCukesTest.logger.log(LogStatus.FAIL,
                        HTMLReportUtil.failStringRedColor("Failed at point: " + pathForLogger) + GlobalUtil.e);

                byte[] screenshot = KeywordUtil.takeMobileScreenshot(imagePath);
                scenario.attach(screenshot, "image/png", "Failed Screenshot");

                // report the bug
                String bugID = "Please check the Bug tool Configuration";

//                 updating the results in Testmangement tool
                if (GlobalUtil.getCommonSettings().getManageToolName().equalsIgnoreCase("TestLink")) {
                    GlobalUtil.testlinkapi
                            .updateTestLinkResult(
                                    testName, "Please find the BUGID in "
                                            + GlobalUtil.getCommonSettings().getBugToolName() + " : " ,
                                    TestLinkAPIResults.TEST_PASSED);
                }
                if (GlobalUtil.getCommonSettings().getExecutionEnv().equalsIgnoreCase("Remote"))
                    KeywordUtil.markTestAsPassedInBrowserStackMobile(BSTACK_FAILED);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {

            LogUtil.infoLog(Hooks.class,
                    "Test has ended closing Application: " + GlobalUtil.getCommonSettings().getAndroidName());
            // updating the results in Testmangement tool
            if (GlobalUtil.getCommonSettings().getManageToolName().equalsIgnoreCase("TestLink")) {
                GlobalUtil.testlinkapi.updateTestLinkResult(testName, "This test is passed",
                        TestLinkAPIResults.TEST_PASSED);
            }
            if (GlobalUtil.getCommonSettings().getExecutionEnv().equalsIgnoreCase("Remote"))
                KeywordUtil.markTestAsPassedInBrowserStackMobile(BSTACK_PASSED);
        }

        // close the browsers

        GlobalUtil.getMDriver().quit();
        RunCukesTest.extent.endTest(RunCukesTest.logger);
    }

}