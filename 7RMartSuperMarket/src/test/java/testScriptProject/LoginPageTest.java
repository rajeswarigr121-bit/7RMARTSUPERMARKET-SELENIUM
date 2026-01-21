package testScriptProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

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
	  Assert.assertTrue(dashboard, "FailToLogin");
  }
  @Test(groups = "smoke")
  @Parameters({"username","password"})
  public void enterCorrectUsernameAndWrongPassword(String username, String password) 
  {
	  LoginPageMain loginpage = new LoginPageMain(driver); // LoginPageMain - classname of src/main/java(Code)
	  loginpage.enterUsernameAndPassword(username, password); // enterUsernameAndPassword - method name userd in main java (code)
	  loginpage.clickOnSignIn(); 
  }
  @Test
  public void enterWrongUsernameAndCorrectPassword() 
  {
	  LoginPageMain loginpage = new LoginPageMain(driver); 
	  loginpage.enterUsernameAndPassword("admin123456", "admin"); 
	  loginpage.clickOnSignIn(); 
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
  }
}
