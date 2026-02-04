
package testScriptProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pages.HomePageLogout;
import pages.LoginPageMain;
import pages.ManageCategory;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Basetest {
	public HomePageLogout home;
	public ManageCategory category;
  @Test
  public void enterUsernameAndPassword() throws IOException {
	  LoginPageMain loginpage=new LoginPageMain(driver);
	  String Username = ExcelUtility.getStringData(1, 0, "Managecategorypage");
	  String Password = ExcelUtility.getStringData(1, 1, "Managecategorypage");
	  loginpage.enterUsernameAndPassword(Username, Password);
	  home = loginpage.clickOnSignIn();
	  
	  category = home.clickOnmoreinfo();
	  category.clickOnNewButton().enterCategory("Screenshot").clickOnDiscount().uploadChooseFileButton().clickOnShowTopmenu().clickOnSavebutton();
	  boolean categorynew = category.categoryalert();
	  Assert.assertTrue(categorynew, Constants.MANAGECATEGORY);
	  
	  
	 
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