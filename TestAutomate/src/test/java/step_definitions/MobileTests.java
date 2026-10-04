package step_definitions;

import io.cucumber.java.en.When;
import mobileutil.MobileKeywords;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import utilities.DriverUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class MobileTests {

	@When("^Launch the SwagLabs \"([^\"]*)\"$")
	public void Launch_the_SwagLabs(String deviceDetails) {
		try {
			KeywordUtil.cucumberTagName = "MobileTests";
			if (GlobalUtil.getCommonSettings().getExecutionEnv().equalsIgnoreCase("Local"))
				DriverUtil.invokeSwagLabMobileApp(GlobalUtil.getCommonSettings().getExecutionEnv(), deviceDetails);
			MobileKeywords.logs2("Verify Application Package Availability");
		} catch (Exception e) {
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}


}
