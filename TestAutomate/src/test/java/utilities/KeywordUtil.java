package utilities;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import step_definitions.RunCukesTest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * The type Keyword util.
 *
 * @author TX
 */
public class KeywordUtil extends GlobalUtil {
	/**
	 * The constant cucumberTagName.
	 */
	public static String cucumberTagName;
	private static final int DEFAULT_WAIT_SECONDS = 30;
	/**
	 * The constant FAIL.
	 */
	protected static final int FAIL = 0;
	/**
	 * The Web element.
	 */
	static WebElement webElement;
	/**
	 * The constant url.
	 */
	protected static String url = "";
	private static final String userDir = "user.dir";
	@SuppressWarnings("unused")
	private static final String text = "";
	/**
	 * The constant VALUE.
	 */
	public static final String VALUE = "value";
	/**
	 * The constant lastAction.
	 */
	public static String lastAction = "";

	/**
	 * The Result folder name.
	 */
	static String result_FolderName = System.getProperty("user.dir") + "\\ExecutionReports\\HTMLReports";
	/**
	 * The Rt.
	 */
	static Runtime rt = Runtime.getRuntime();

	/**
	 * On execution finish.
	 */
	public static void onExecutionFinish() {

		// Send Mail functionality if
		LogUtil.infoLog(KeywordUtil.class, "Test process has ended");

		if (GlobalUtil.getCommonSettings().getEmailOutput().equalsIgnoreCase("Y")) {
			LogUtil.infoLog(KeywordUtil.class, "Email Flag Set To: " + GlobalUtil.getCommonSettings().getEmailOutput());
			try {
				sendMail.sendEmailToClient(
						"Hi All, \n\nPlease find the attached Execution Report.\n\n\nThanks & Regards\nQA",
						true, false);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			LogUtil.infoLog(KeywordUtil.class, "Email Flag Set To: " + GlobalUtil.getCommonSettings().getEmailOutput());
		}

		String htmlReportFile = System.getProperty("user.dir") + "\\" + ConfigReader.getValue("HtmlReportFullPath");
		LogUtil.infoLog(KeywordUtil.class, "cucumber path is" + htmlReportFile);
		File f = new File(htmlReportFile);
		if (f.exists()) {
			try {
				rt.exec("rundll32 url.dll,FileProtocolHandler " + htmlReportFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String htmlExtentReportFile = System.getProperty("user.dir") + File.separator + "ExecutionReports"
				+ File.separator + "HTMLReportsBackup" + File.separator + RunCukesTest.tagName + ".html";
		LogUtil.infoLog(KeywordUtil.class, "Extent Report File path is  " + htmlExtentReportFile);
		File extentReport = new File(htmlExtentReportFile);
		if (extentReport.exists()) {

			try {
				rt.exec("rundll32 url.dll,FileProtocolHandler " + htmlExtentReportFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	/**
	 * Take mobile screenshot byte [ ].
	 *
	 * @param screenshotFilePath the screenshot file path
	 * @return the byte [ ]
	 */
	public static byte[] takeMobileScreenshot(String screenshotFilePath) {
		try {
			byte[] screenshot = ((TakesScreenshot) GlobalUtil.getMDriver()).getScreenshotAs(OutputType.BYTES);
			FileOutputStream fileOuputStream = new FileOutputStream(screenshotFilePath);
			fileOuputStream.write(screenshot);
			fileOuputStream.close();
			return screenshot;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Gets current date time.
	 *
	 * @return the current date time
	 */
	public static String getCurrentDateTime() {

		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMddHHmmss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		LogUtil.infoLog(KeywordUtil.class, strDate);
		return strDate;
	}


	/**
	 * Gets current url.
	 *
	 * @return the current url
	 */
	public static String getCurrentUrl() {
		return getDriver().getCurrentUrl();
	}

	/**
	 * Wait for clickable web element.
	 *
	 * @param locator the locator
	 * @return the web element
	 */
	public static WebElement waitForClickable(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_SECONDS);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(WebDriverException.class);

		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * Wait for clickable mobile web element.
	 *
	 * @param locator the locator
	 * @return the web element
	 */

	public static WebElement waitForClickableMobile(By locator) {
		WebDriverWait wait = new WebDriverWait(getMDriver(), DEFAULT_WAIT_SECONDS);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(WebDriverException.class);

		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * Accept alert boolean.
	 *
	 * @return the boolean
	 */
	public static boolean acceptAlert() {

		Alert alert = GlobalUtil.getDriver().switchTo().alert();
		alert.accept();
		return true;

	}

	/**
	 * Mark The Test Has Pass in Browser Stack
	 *
	 * @param
	 * @return
	 */
		public static void markTestAsPassedInBrowserStackMobile(String testStatus) {
		JavascriptExecutor jse = GlobalUtil.getMDriver();
		jse.executeScript(String.format(
				"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"%s\", \"reason\": \"<reason>\"}}",
				testStatus));

	}

	/**
	 * Scrolldown.
	 *
	 * @param Element the element
	 */
	public static void scrolldown(WebElement Element) {
		JavascriptExecutor js = (JavascriptExecutor) GlobalUtil.getDriver();
		js.executeScript("window.scrollBy(0,600);", Element);
	}

}
