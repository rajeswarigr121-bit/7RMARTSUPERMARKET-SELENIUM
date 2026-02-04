package testScriptProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pages.HomePageLogout;
import pages.LoginPageMain;
import utilities.ExcelUtility;

public class HomepageLogoutTest extends Basetest {
	public HomePageLogout home;

	@Test(description = "Verify homepage Logout")
	public void clickOnAdminbutton() throws IOException {
		LoginPageMain loginpagelast = new LoginPageMain(driver); // LoginPageMain - classname of main java class
		String Username = ExcelUtility.getStringData(1, 0, "Homepage");
		String Password = ExcelUtility.getStringData(1, 1, "Homepage");
		loginpagelast.enterUsernameAndPassword(Username, Password);
		home = loginpagelast.clickOnSignIn();
		home.clickOnAdmin().clickOnLogout();

		// loginpagelast.clickOnSignIn();

		// HomePageLogout homepagelogout = new HomePageLogout(driver);
		// homepagelogout.clickOnAdmin();
		// homepagelogout.clickOnLogout();
		String Expected = "Login | 7rmart supermarket";
		String actual = driver.getTitle();
		Assert.assertEquals(Expected, actual, Constants.HOMEPAGELOGIN);
	}

}
