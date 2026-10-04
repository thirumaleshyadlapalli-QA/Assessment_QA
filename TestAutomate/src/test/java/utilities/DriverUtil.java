package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

/**
 * This DriverUtil class refer to browsers, os details, browser versions and
 * will close all browsers
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DriverUtil {

    /**
     * The constant capabilities.
     */
    public static DesiredCapabilities capabilities = new DesiredCapabilities();




    /**
     * Invoke local SwagLabs mobile app android driver.
     *
     * @param exeEnv        the exe env
     * @param deviceDetails the device details
     * @return the android driver
     */


    public static void  invokeSwagLabMobileApp(String exeEnv, String deviceDetails) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        String deviceName = deviceDetails.split("_")[0];
        String osVersion = deviceDetails.split("_")[1];

        LogUtil.infoLog(DriverUtil.class, deviceName);
        LogUtil.infoLog(DriverUtil.class, osVersion);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Punkt MC03");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

//        capabilities.setCapability("newCommandTimeout", 300);
//
//        capabilities.setCapability("adbExecTimeout", 120000);
//        capabilities.setCapability("uiautomator2ServerInstallTimeout", 120000);
//        capabilities.setCapability("uiautomator2ServerLaunchTimeout", 120000);

//        capabilities.setCapability("disableWindowAnimation", true);
//        capabilities.setCapability("ignoreHiddenApiPolicyError", true);
//        capabilities.setCapability("autoGrantPermissions", true);


        capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");


        try {
//            GlobalUtil.mdriver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/"), capabilities);
            GlobalUtil.mdriver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            LogUtil.infoLog(DriverUtil.class, e.getMessage());
            e.printStackTrace();
        }
        GlobalUtil.mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        RunCukesTest.logger.log(LogStatus.INFO,
//                "<font color=white>Test Performed on \n " + deviceName + " Version \n"+osVersion+"</font>");
//        return GlobalUtil.
    }

}