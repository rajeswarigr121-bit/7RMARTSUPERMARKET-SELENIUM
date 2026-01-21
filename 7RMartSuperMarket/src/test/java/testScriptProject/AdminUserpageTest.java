package testScriptProject;

import org.testng.annotations.Test;

import pages.AdminUserpage;
import pages.HomePageLogout;
import pages.LoginPageMain;
import utilities.FakerUtility;

public class AdminUserpageTest extends Basetest {
	public AdminUserpage admin;
	public HomePageLogout homepage;
	public FakerUtility faker = new FakerUtility();
	
	
  @Test(retryAnalyzer = retry.Retry.class) //Retry
  public void enterUsernameAndPassword() 
  {
	  LoginPageMain loginpage = new LoginPageMain(driver);
	  loginpage.enterUsernameAndPassword("admin", "admin");
	  homepage=loginpage.clickOnSignIn();
	  admin = homepage.clickOn_Moreinfo();
	  admin.moreinfo_And_Newbutton().enterUsernamePasswordUsertype(faker.getFakeFirstName(), faker.getPassword()).dropdown().savebutton();
	  
	  
	  
	 /* AdminUserpage adminuser = new AdminUserpage(driver);
	  adminuser.moreinfo_And_Newbutton();
	  adminuser.enterUsernamePasswordUsertype("Rajeswari", "Rajeswari@123");
	  adminuser.dropdown();
	  adminuser.savebutton();*/
  }
}
