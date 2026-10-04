package step_definitions;



import Pages.SwagLabs;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.MobileElement;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobileutil.MobileKeywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;


public class Login extends KeywordUtil {


	/**
	 * Enter UserName
	 */

	@Given("Enter Your {string} UserName")
	public void enterYourUserName(String UserName) throws InterruptedException {

		try {

			MobileKeywords.logs(
					SwagLabs.userName,
					"UserName field is displayed"
			);

			MobileElement ele = mdriver.findElement(SwagLabs.userName);
			ele.sendKeys(UserName);

			MobileKeywords.logs2("UserName entered successfully");

		} catch (Exception e) {

			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Failed to enter UserName : " + e.getMessage()
					)
			);

			throw e; // Fail the scenario
		}
	}

	/**
	 * Enter Password
	 */

	@Then("Enter Your {string} PassWord")
	public void enterYourPassWord(String PassWord) {

		try {

			// Verify Password Field
			MobileKeywords.logs(
					SwagLabs.passWord,
					"Password field is displayed"
			);

			// Enter Password
			MobileElement ele = mdriver.findElement(SwagLabs.passWord);
			ele.sendKeys(PassWord);

			// Success Log
			MobileKeywords.logs2("Password entered successfully");

		} catch (Exception e) {

			// Failure Log
			MobileKeywords.logs2("Failed to enter password. Error: " + e.getMessage());

			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Failed to enter password. Error: " + e.getMessage())
			);

			throw e; // Mark scenario as failed
		}
	}


	/**
	 * Click On Login Button
	 */

	@When("^Click On Login Button$")
	public void Click_On_Login_Button() {

		try {

			MobileKeywords.logs(
					SwagLabs.loginButton,
					"Login Button is displayed"
			);

			MobileKeywords.click1(SwagLabs.loginButton);

			MobileKeywords.logs2("Login Button clicked successfully");

		} catch (Exception e) {

			GlobalUtil.ErrorMsg = e.getMessage();

			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Failed to click Login Button : " + e.getMessage()
					)
			);

			Assert.fail("Failed to click Login Button : " + e.getMessage());
		}
	}


	/**
	 * Verify Home Page for Login Success
	 */


	@And("Verify Home Page is displayed")
	public void verify_Home_Page_is_displayed() {

		try {

			MobileKeywords.logs(
					SwagLabs.homeScreen,
					"Products title is displayed on Home Page"
			);

			boolean isDisplayed = mdriver
					.findElement(SwagLabs.homeScreen)
					.isDisplayed();

			Assert.assertTrue(isDisplayed, "Home Page is not displayed");

			MobileKeywords.logs2("Home Page displayed successfully");

		} catch (Exception e) {

			GlobalUtil.ErrorMsg = e.getMessage();

			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Home Page verification failed : " + e.getMessage()
					)
			);

			Assert.fail("Home Page verification failed : " + e.getMessage());
		}
	}

	/**
	 * Click On Menu
	 */

	@When("^Click On Menu$")
	public void Click_On_Menu() {

		try {

			MobileKeywords.logs(
					SwagLabs.menuButton,
					"Menu Button is displayed"
			);

			MobileKeywords.click1(SwagLabs.menuButton);

			MobileKeywords.logs2("Menu Button clicked successfully");

		} catch (Exception e) {

			GlobalUtil.ErrorMsg = e.getMessage();

			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Failed to click Menu Button : " + e.getMessage()
					)
			);

			Assert.fail("Failed to click Menu Button : " + e.getMessage());
		}
	}

	/**
	 * Click On Logout
	 */

	@When("^Click on Logout$")
	public void click_on_logout() {

		try {

			MobileKeywords.logs(
					SwagLabs.logOutButton,
					"Logout Menu is displayed"
			);

			MobileKeywords.click1(SwagLabs.logOutButton);

			MobileKeywords.logs2("Logout clicked successfully");

		} catch (Exception e) {

			GlobalUtil.ErrorMsg = e.getMessage();

			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Logout_Click_Failure : " + e.getMessage()
					)
			);
					Assert.fail("Failed to click Logout : " + e.getMessage());
		}
	}




	/**
	 * Verify Logout After Clicking Logout Button
	 */


	@Then("^Verify the Logout$")
	public void verify_the_logout() {

		try {

			MobileKeywords.logs(
					SwagLabs.loginButton,
					"Login Button displayed after logout"
			);

			boolean isDisplayed =
					mdriver.findElement(SwagLabs.loginButton).isDisplayed();

			Assert.assertTrue(
					isDisplayed,
					"User is not navigated to Login Screen"
			);

			MobileKeywords.logs2("Logout verified successfully");

		} catch (Exception e) {

			GlobalUtil.ErrorMsg = e.getMessage();

			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Logout Verification failure : " + e.getMessage()
					)
			);
			Assert.fail("Logout verification failed : " + e.getMessage());
		}
	}

	@Then("^Verify Unsuccessful Login$")
	public void verify_unsuccessful_login() {

		try {

			MobileKeywords.logs(
					SwagLabs.loginErrorMessage,
					"Login Error Message is displayed"
			);

			String actualError =
					mdriver.findElement(SwagLabs.loginErrorMessage).getText();

			String expectedError =
					"Username and password do not match any user in this service.";

			Assert.assertEquals(
					actualError,
					expectedError,
					"Invalid Error Message displayed"
			);

			MobileKeywords.logs2(
					"Unsuccessful Login verified successfully"
			);

		} catch (Exception e) {
			RunCukesTest.logger.log(
							LogStatus.FAIL,
							HTMLReportUtil.failStringRedColor(
									"Unsuccessful_Login_Verification_Failure : "
											+ e.getMessage()
							)
			);

			GlobalUtil.ErrorMsg = e.getMessage();

			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Unsuccessful Login Verification Failed : "
									+ e.getMessage()
					)
			);

			Assert.fail(
					"Unsuccessful Login Verification Failed : "
							+ e.getMessage()
			);
		}
	}

	@Then("^Verify Menu$")
	public void verify_Menu() {

		try {

			String[] menuItems = {
					"ALL ITEMS",
					"WEBVIEW",
					"QR CODE SCANNER",
					"GEO LOCATION",
					"DRAWING",
					"ABOUT",
					"LOGOUT",
					"RESET APP STATE"
			};

			for (String menuItem : menuItems) {

				MobileKeywords.verifyTextExists(menuItem);

//				RunCukesTest.logger.log(
//						LogStatus.PASS,
//						menuItem + " menu item is displayed"
//				);
			}

		} catch (Exception e) {

			GlobalUtil.ErrorMsg = e.getMessage();

			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Menu verification failed : "
									+ e.getMessage()
					)
			);

			Assert.fail(
					"Menu verification failed : "
							+ e.getMessage()
			);
		}
	}


	@When("^Add \"([^\"]*)\" to cart$")
	public void add_product_to_cart(String productName) {

		try {

			MobileKeywords.addProductToCart(productName);

			RunCukesTest.logger.log(
					LogStatus.PASS,
					productName + " added to cart successfully"
			);

		} catch (Exception e) {

//			String screenshotPath =
//					ScreenshotUtil.captureScreenshot("AddToCartFailure");

		RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"add to cart failed  : "
									+ e.getMessage()
					)
			);

			Assert.fail(
					"Failed to add product to cart : "
							+ e.getMessage()
			);
		}
	}












	@Then("^Verify cart count is \"([^\"]*)\"$")
	public void verify_cart_count(String count) {

		try {

			MobileKeywords.verifyCartCount(count);

			RunCukesTest.logger.log(
					LogStatus.PASS,
					"Cart count verified successfully : " + count
			);

		} catch (Exception e) {

//			String screenshotPath =
//					ScreenshotUtil.captureScreenshot("CartCountFailure");
			RunCukesTest.logger.log(
					LogStatus.FAIL,
					HTMLReportUtil.failStringRedColor(
							"Cart count verification failed : "
									+ e.getMessage()
					)
			);

					Assert.fail(
					"Cart count verification failed : "
							+ e.getMessage()
			);
		}
	}


}


