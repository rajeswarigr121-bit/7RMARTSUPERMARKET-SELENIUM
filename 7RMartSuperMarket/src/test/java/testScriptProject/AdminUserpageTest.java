package testScriptProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pages.AdminUserpage;
import pages.HomePageLogout;
import pages.LoginPageMain;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserpageTest extends Basetest {
	public AdminUserpage admin;
	public HomePageLogout homepage;
	public FakerUtility faker = new FakerUtility();
	
	
  @Test(retryAnalyzer = retry.Retry.class) //Retry
  public void enterUsernameAndPassword() throws IOException 
  {
	  LoginPageMain loginpage = new LoginPageMain(driver);
	  String Username = ExcelUtility.getStringData(1, 0, "Adminuserpage");
	  String Password = ExcelUtility.getStringData(1, 1, "Adminuserpage");
	  loginpage.enterUsernameAndPassword(Username, Password);
	  homepage=loginpage.clickOnSignIn();
	  admin = homepage.clickOn_Moreinfo();
	  admin.moreinfo_And_Newbutton().enterUsernamePasswordUsertype(faker.getFakeFirstName(), faker.getPassword()).dropdown().savebutton();
	  boolean adminalerts = admin.adminalertsave();
	  Assert.assertTrue(adminalerts, Constants.ERRORMESSAGEADMIN);
	  
	  
	  
	 /* AdminUserpage adminuser = new AdminUserpage(driver);
	  adminuser.moreinfo_And_Newbutton();
	  adminuser.enterUsernamePasswordUsertype("Rajeswari", "Rajeswari@123");
	  adminuser.dropdown();
	  adminuser.savebutton();*/
  }
}
