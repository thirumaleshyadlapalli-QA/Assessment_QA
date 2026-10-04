package mobileutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.time.Duration;
import java.util.*;
import java.awt.*;
import java.util.NoSuchElementException;

import Pages.SwagLabs;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import step_definitions.RunCukesTest;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import static pageobjects.BaseClass.driver;
import static utilities.GlobalUtil.mdriver;
import  io.appium.java_client.android.AndroidDriver;
import  io.appium.java_client.AppiumDriver;
import  io.appium.java_client.MobileElement;

public class MobileKeywords {
	public static Class<MobileKeywords> thisClass = MobileKeywords.class;
	public static DesiredCapabilities capabilities = new DesiredCapabilities();

	public static String GetValue(String key) {
		File file = new File(System.getProperty("user.dir") + "/src/main/resources/Config/config.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		try {
			prop.load(fileInput);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String strbaseURL = prop.getProperty(key);
		return strbaseURL;
	}

	public static int GetIntValue(String key) {
		File file = new File(System.getProperty("user.dir") + "/src/main/resources/Config/config.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		try {
			prop.load(fileInput);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String strbaseURL = prop.getProperty(key);
		return Integer.parseInt(strbaseURL);
	}

	public static By locatortype(String type, String value) {

		By locName = null;
		if (type.equalsIgnoreCase("xpath")) {
			locName = By.xpath(value);
		} else if (type.equalsIgnoreCase("id")) {
			locName = By.id(value);
		} else if (type.equalsIgnoreCase("linkText")) {
			locName = By.linkText(value);
		} else if (type.equalsIgnoreCase("classname")) {
			locName = By.className(value);
		} else if (type.equalsIgnoreCase("name")) {
			locName = By.name(value);
		} else
			locName = By.partialLinkText(value);
		return locName;

	}

	public static boolean isWebElementPresent(String path, String type) {
		Boolean flag = false;

		if (GlobalUtil.getMDriver().findElements(MobileBy.xpath(path)).size() > 0) {
			flag = true;
		}
		return flag;
	}


	public static WebElement explicitWaitForElement(String path, String type) {
		WebDriverWait wait = new WebDriverWait(GlobalUtil.getMDriver(), GetIntValue("explicit_timeout"));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locatortype(type, path)));

		return element;

	}

	public static WebElement explicitWaitForElement1(By locator) {
		WebDriverWait wait = new WebDriverWait(GlobalUtil.getMDriver(), GetIntValue("explicit_timeout"));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable((locator)));

		return element;

	}

	public static void verifyTextExists(String text) {

		By locator = By.xpath(
				"//android.widget.TextView[@text='" + text + "']"
		);

		MobileElement element =
				(MobileElement) mdriver.findElement(locator);

		Assert.assertTrue(
				element.isDisplayed(),
				text + " is not displayed"
		);

		logs2(text + " is displayed");
	}

	public static void addProductToCart(String productName) {

		By addToCartButton = By.xpath(
				"//android.widget.TextView[@text='Sauce Labs Backpack']/../../.." +
						"//android.view.ViewGroup[@content-desc='test-ADD TO CART']"
		);

		mdriver.findElement(addToCartButton).click();

		logs2(productName + " added to cart successfully");
	}

	public static void verifyCartCount(String expectedCount) {

		String actualCount =
				mdriver.findElement(SwagLabs.cartBadge).getText();

		Assert.assertEquals(
				actualCount,
				expectedCount,
				"Cart Count Mismatch"
		);

		logs2("Cart Count Verified : " + actualCount);
	}


	public static void verifyProductInCart(String productName) {

		By locator = By.xpath(
				"//android.widget.TextView[@text='" + productName + "']"
		);

		Assert.assertTrue(
				mdriver.findElement(locator).isDisplayed(),
				productName + " is not present in cart"
		);

		logs2(productName + " displayed in cart");
	}

	public static boolean click(By locator, String logStep) {

		WebDriverWait wait = new WebDriverWait(GlobalUtil.getMDriver(), 20);
		WebElement elm = wait.until(ExpectedConditions.elementToBeClickable(locator));

		KeywordUtil.lastAction = "Click: " + locator.toString();
		LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
		if (elm == null) {
			return false;
		} else {
			elm.click();
			RunCukesTest.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));

			return true;
		}
	}

	public static boolean click1(By locator) {

		WebDriverWait wait = new WebDriverWait(GlobalUtil.getMDriver(), 20);
		WebElement elm = wait.until(ExpectedConditions.elementToBeClickable(locator));

		KeywordUtil.lastAction = "Click: " + locator.toString();
		LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
		if (elm == null) {
			return false;
		} else {
			elm.click();
//			RunCukesTest.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));

			return true;
		}
	}


	public static boolean logs(By locator, String logStep) {

		WebDriverWait wait = new WebDriverWait(GlobalUtil.getMDriver(), 20);
		WebElement elm = wait.until(ExpectedConditions.elementToBeClickable(locator));
		if (elm == null) {
			return false;
		} else {
			RunCukesTest.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
			return true;
		}
	}


	public static boolean logsFail(By locator, String logStep) {

		WebDriverWait wait = new WebDriverWait(GlobalUtil.getMDriver(), 20);
		WebElement elm = wait.until(ExpectedConditions.elementToBeClickable(locator));
		if (elm == null) {
			return false;
		} else {
			RunCukesTest.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor(logStep));
			return true;
		}
	}

	public static boolean logs1(By locator, String value) {

		WebDriverWait wait = new WebDriverWait(GlobalUtil.getMDriver(), 20);
		WebElement elm = wait.until(ExpectedConditions.elementToBeClickable(locator));
		if (elm == null) {
			return false;
		} else {
			RunCukesTest.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(value));
			return true;
		}
	}

	public static boolean logs2(String value) {

		RunCukesTest.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(value));
		return true;

	}


	public static boolean jsClick(By locator) {
		((JavascriptExecutor) mdriver).executeScript("arguments[0].click();", locator);
		return true;
	}

	public void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static boolean logsPrint(String logStep) {

		RunCukesTest.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
		return true;

	}

	public static boolean logsPrintFail(String logStep) {

		RunCukesTest.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor(logStep));
		return true;

	}




	public static MobileElement scrollToElementByText(AndroidDriver<MobileElement> driver, String visibleText) {

			try {
				MobileElement element = driver.findElement(
						MobileBy.AndroidUIAutomator(
								"new UiScrollable(new UiSelector().scrollable(true))" +
										".scrollIntoView(new UiSelector().text(\"" + visibleText + "\"));"
						)
				);

				if (element != null && element.isDisplayed()) {
//					MobileKeywords.logsPrint("Element found and displayed: " );
					return element;
				} else {
					MobileKeywords.logsPrintFail("Element found but not displayed: ");
					return null;
				}

			} catch (NoSuchElementException e) {
				MobileKeywords.logsPrintFail("Element not found: " + visibleText);
				GlobalUtil.ErrorMsg = e.getMessage();
				Assert.fail("Element not found: " + visibleText);
				return null;
			} catch (Exception e) {
				MobileKeywords.logsPrintFail("Unexpected error while locating element: " + visibleText);
				GlobalUtil.ErrorMsg = e.getMessage();
				Assert.fail(e.getMessage());
				return null;
			}
		}

		public static MobileElement scrollToElementByTexts(AppiumDriver<MobileElement> driver, String... texts) {
		for (String text : texts) {
			try {
				MobileElement element = driver.findElement(
						MobileBy.AndroidUIAutomator(
								"new UiScrollable(new UiSelector().scrollable(true))"
								+ ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"
						)
					);

				return element; // return the first match
			} catch (Exception e) {
				logsPrintFail("Feature /Element Not Found :");
			}
		}
		throw new NoSuchElementException("None of the texts were found: " + Arrays.toString(texts));
	}









   public static void scrollToElementAndClick(AppiumDriver driver, By locator, int maxScrolls){
//		long millis = Duration.ofSeconds(5).toMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5).getSeconds());
	   for (int i=0; i < maxScrolls; i++){
		   try{
			   WebElement element = driver.findElement(locator);
			   if(element.isDisplayed()){
				   wait.until(ExpectedConditions.elementToBeClickable(locator));
				   element.click();
				   return;
			   }
		   }catch (NoSuchElementException exception){

		   }

		   Map<String, Object>params = new HashMap<>();
		   params.put("left",100);
		   params.put("top",100);
		   params.put("width",driver.manage().window().getSize().width - 200);
		   params.put("height",driver.manage().window().getSize().height - 200);
		   params.put("direction", "down");
		   params.put("percent",0.8);

		   driver.executeScript("Mobile: scrollGesture",params);

	   }
	   throw new NoSuchElementException(
			   "Element not found after " + maxScrolls + "scroll attempts");
   }


   public static void swipeUntilVisible(AndroidDriver driver, By locator){


		int maxSwipes = 5;
		while (driver.findElements(locator).isEmpty() && maxSwipes > 0){
			Dimension size = driver.manage().window().getSize();

			int startX = size.width / 2;
			int startY = (int) (size.height * 0.8);
			int endY = (int) (size.height * 0.2);

			new TouchAction<>(driver)
					.press(PointOption.point(startX, startY))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
					.release()
					.perform();

			maxSwipes--;

		}
   }




	public static void scrollInMobileDown() throws IOException, InterruptedException {

		Dimension dim = GlobalUtil.getMDriver().manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width / 2;
		int top_y = (int) (height * 0.20);
		int bottom_y = (int) (height * 0.80);
		LogUtil.infoLog(thisClass, "coordinates :" + x + "  " + top_y + " " + bottom_y);
		TouchAction ts = new TouchAction(mdriver);
		ts.longPress(PointOption.point(x, top_y)).moveTo(PointOption.point(x, bottom_y)).release().perform();

		Runtime.getRuntime().exec("adb shell input swipe 50 500 1000 500");
		Runtime.getRuntime().exec("adb shell input swipe 50 500 1000 500");
		Runtime.getRuntime().exec("adb shell input swipe 50 500 1000 500");
		Runtime.getRuntime().exec("adb shell input swipe 50 500 1000 500");
	}

	public static void scrollInMobileDown1() throws IOException, InterruptedException {

		Dimension dim = GlobalUtil.getMDriver().manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width / 2;
		int top_y = (int) (height * 0.20);
		int bottom_y = (int) (height * 0.80);
		LogUtil.infoLog(thisClass, "coordinates :" + x + "  " + top_y + " " + bottom_y);
		TouchAction ts = new TouchAction(mdriver);
		ts.longPress(PointOption.point(x, top_y)).moveTo(PointOption.point(x, bottom_y)).release().perform();

		Runtime.getRuntime().exec("adb shell input swipe 50 500 1000 500");
		Runtime.getRuntime().exec("adb shell input swipe 50 500 1000 500");
		Runtime.getRuntime().exec("adb shell input swipe 50 500 1000 500");
		Runtime.getRuntime().exec("adb shell input swipe 50 500 1000 500");
	}

	public static boolean scrollingToElement(By locator) throws InterruptedException {
		boolean flag = false;
		try {
			Thread.sleep(5000);
			WebElement element = GlobalUtil.getDriver().findElement(locator);
			((JavascriptExecutor) GlobalUtil.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
//			RunCukesTest.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
			flag = true;
		} catch (InterruptedException e) {
			LogUtil.errorLog(KeywordUtil.class, e.getMessage());
			e.printStackTrace();
			flag = false;
		}

		return flag;
	}
	public static String Gettext(String path, String type) throws InterruptedException {
		Thread.sleep(1500);
		WebElement element = GlobalUtil.getMDriver().findElement(locatortype(type, path));
		String s = element.getText();
		LogUtil.infoLog(thisClass, "Text has copyed in clipboard");
		return s;
	}

	public static String Gettext1(By locator) throws InterruptedException {
		Thread.sleep(1500);
		WebElement element = GlobalUtil.getMDriver().findElement(locator);
		String s = element.getText();
		LogUtil.infoLog(thisClass, "Text has copyed in clipboard");
		return s;
	}


	public static void verticalSwipeDown() {
		int duration = 750;
		double startPercentage = 0.60;
		double finalPercentage = 0.20;
		swipeVertical(startPercentage, finalPercentage, duration);
	}
	public static void verticalSwipeUp() {
		int duration = 750;
		double startPercentage = 0.20;
		double finalPercentage = 0.60;
		swipeHorizontal(startPercentage, finalPercentage, duration);
	}

	@SuppressWarnings("rawtypes")
	public static void swipeVertical(double startPercentage, double finalPercentage, int duration) {
		Dimension size = GlobalUtil.mdriver.manage().window().getSize();
		int anchor = (int) (size.width * 0.5);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * finalPercentage);
		new TouchAction(GlobalUtil.mdriver).press(PointOption.point(anchor, startPoint))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
				.moveTo(PointOption.point(anchor, endPoint)).release().perform();
	}



	public static void swipeHorizontal(double startPercentage, double finalPercentage, int duration) {
		Dimension size = GlobalUtil.mdriver.manage().window().getSize();
		int anchor = (int) (size.height * 0.5);
		int startPoint = (int) (size.width * startPercentage);
		int endPoint = (int) (size.width * finalPercentage);
		new TouchAction(GlobalUtil.mdriver).press(PointOption.point(startPoint, anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
				.moveTo(PointOption.point(endPoint, anchor)).release().perform();
	}

}



