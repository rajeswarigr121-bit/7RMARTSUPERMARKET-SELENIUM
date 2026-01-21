package testScriptProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePageLogout;
import pages.LoginPageMain;

public class HomepageLogoutTest extends Basetest {
	public HomePageLogout home;
  @Test
  public void clickOnAdminbutton() 
  {
	  LoginPageMain loginpagelast = new LoginPageMain(driver); //LoginPageMain - classname of main java class
	  loginpagelast.enterUsernameAndPassword("admin", "admin");
	  home = loginpagelast.clickOnSignIn();
	  home.clickOnAdmin().clickOnLogout();
	  
	 // loginpagelast.clickOnSignIn();
	  
	  
	  
	 // HomePageLogout homepagelogout = new HomePageLogout(driver);
	//  homepagelogout.clickOnAdmin();
	//  homepagelogout.clickOnLogout();
	  String Expected = "Login | 7rmart supermarket";
	  String actual = driver.getTitle();
	  Assert.assertEquals(Expected, actual, "Class name failed");
  }
  
}
