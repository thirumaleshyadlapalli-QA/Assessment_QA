package utilities;

import io.appium.java_client.android.AndroidDriver;
import lombok.Getter;
import lombok.Setter;

/**
 * This CommonSetting class help in generate results
 */
@Getter
@Setter
public class CommonSettings {

    @SuppressWarnings("rawtypes")
    private static AndroidDriver mdriver;
    private String appType;
    private String appEnviornment;
    private String projectName;
    private String emailOutput;
    private String emailId;
    private String htmlReport;
    private String xlsReport;
    private String testLogs;
    private String executionEnv;
    private String cloudProvider;
    private String hostName;
    private String key;
    private String remoteOS;
    private String BuildNumber;
    private String Browser;
    private String Url;
    private String ManageToolName;
    private String testlinkTool;
    private String testLinkHostName;
    private String testlinkAPIKey;
    private String testlinkProjectName;
    private String testlinkPlanName;
    private String jiraTestManagement;
    private String jiraCycleID;
    private String jiraProjectID;
    private String bugToolName;
    private String bugTool;
    private String bugToolHostName;
    private String bugToolUserName;
    private String bugToolPassword;
    private String bugToolProjectName;
    private String restURL;
    private String restAccessToken;
    private Double androidVersion;
    private String androidName;
    private String androidID;
    private String androidBrowser;
    private String jiraTestCycleVersionName;

	/**
     * Instantiates a new Common settings.
     */
    public CommonSettings() {
        super();
    }
}
