
package testScriptProject;

import org.testng.annotations.Test;

import constant.Constants;
import pages.HomePageLogout;
import pages.LoginPageMain;
import pages.ManageCategory;

public class ManageCategoryTest extends Basetest {
	public HomePageLogout home;
	public ManageCategory category;
  @Test
  public void enterUsernameAndPassword() {
	  LoginPageMain loginpage=new LoginPageMain(driver);
	  loginpage.enterUsernameAndPassword("admin", "admin");
	  home = loginpage.clickOnSignIn();
	  
	  category = home.clickOnmoreinfo();
	  category.clickOnNewButton().enterCategory("Screenshot").clickOnDiscount().uploadChooseFileButton().clickOnShowTopmenu().clickOnSavebutton();
	  
	  
	 
	  /*ManageCategory category=new ManageCategory(driver);
	  category.clickOnmoreinfo();
	  category.clickOnNewButton();
	  category.enterCategory("vegetables");
	  category.clickOnDiscount();
	  category.uploadChooseFileButton();
	  category.uploadChooseFile(constants.IMAGEPATH);
	  category.clickOnShowTopmenu();
	  category.clickOnSavebutton();*/
  }
}