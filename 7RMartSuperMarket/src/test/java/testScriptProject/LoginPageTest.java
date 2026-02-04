package testScriptProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import constant.Constants;
import pages.HomePageLogout;
import pages.LoginPageMain;
import utilities.ExcelUtility;

public class LoginPageTest extends Basetest {
	HomePageLogout home;
  @Test(groups = "smoke",description = "Verify user can login with valid credentials") 
  public void enterCorrectUsernameAndCorrectPassword() throws IOException 
  {
	  LoginPageMain loginpage = new LoginPageMain(driver); // LoginPageMain - classname of src/main/java(Code)
	  String Username = ExcelUtility.getStringData(1, 0, "LoginPage");
	  String Password = ExcelUtility.getStringData(1, 1, "LoginPage");
	  loginpage.enterUsernameAndPassword(Username, Password); // enterUsernameAndPassword - method name userd in main java (code)
	  home = loginpage.clickOnSignIn();
	  loginpage.clickOnSignIn(); //clickOnSignIn() - method name userd in main java (code) for sign in
	  boolean dashboard = loginpage.isdashboardIdDisplayed();
	  Assert.assertTrue(dashboard, Constants.LOGINTESTPAGE1);
  }
  @Test(groups = "smoke")
  @Parameters({"username","password"})
  public void enterCorrectUsernameAndWrongPassword(String username, String password) throws IOException 
  {
	  LoginPageMain loginpage = new LoginPageMain(driver); // LoginPageMain - classname of src/main/java(Code)
	  String Username = ExcelUtility.getStringData(2, 0, "LoginPage");
	  String Password = ExcelUtility.getStringData(2, 1, "LoginPage");
	  loginpage.enterUsernameAndPassword(Username, Password); // enterUsernameAndPassword - method name userd in main java (code)
	  loginpage.clickOnSignIn(); 
	  boolean dashboard1 = loginpage.isdashboardIdDisplayed1();
	  Assert.assertTrue(dashboard1, Constants.LOGINTESTPAGE2);
  }
  @Test
  public void enterWrongUsernameAndCorrectPassword() throws IOException 
  {
	  LoginPageMain loginpage = new LoginPageMain(driver); 
	  String Username = ExcelUtility.getStringData(3, 0, "LoginPage");
	  String Password = ExcelUtility.getStringData(3, 1, "LoginPage");
	  loginpage.enterUsernameAndPassword(Username, Password); 
	  loginpage.clickOnSignIn(); 
	  boolean dashboard2 = loginpage.isdashboardIdDisplayed2();
	  Assert.assertTrue(dashboard2, Constants.LOGINTESTPAGE3);
  }
  
  @DataProvider(name = "Datas")
  public Object[] testdata()
  {
	  Object data[][] = {{"admins", "Admin@123"},{"admins@!23", "Admin@123"}};
	  
	  return data;
  }
  @Test(dataProvider = "Datas")
  public void enterWrongUsernameAndWrongPassword(String username, String password) 
  {
	  LoginPageMain loginpage = new LoginPageMain(driver); 
	  loginpage.enterUsernameAndPassword(username, password); 
	  loginpage.clickOnSignIn(); 
	  boolean dashboard3 = loginpage.isdashboardIdDisplayed3();
	  Assert.assertTrue(dashboard3, Constants.LOGINTESTPAGE4);
  }
}
