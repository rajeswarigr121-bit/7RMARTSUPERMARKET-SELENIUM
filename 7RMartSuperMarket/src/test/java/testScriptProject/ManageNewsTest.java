package testScriptProject;

import org.testng.annotations.Test;

import pages.HomePageLogout;
import pages.LoginPageMain;
import pages.ManageNews;

public class ManageNewsTest extends Basetest {
	public HomePageLogout home;
	public ManageNews news;
  @Test
  public void enterUsernameAndPassword() 
  {
	  LoginPageMain loginpage = new LoginPageMain(driver);
	  loginpage.enterUsernameAndPassword("admin", "ad123");
	  home =  loginpage.clickOnSignIn();
	  news = home.clickonmoreinfo();
	  news.clickonNew().enternew("News").clicksavebutton();
	  
	  
	  /* ManageNews managenews = new ManageNews(driver);
	  managenews.clickonmoreinfoandclickNew();
	  managenews.enternew("Hello Kitty");
	  managenews.clicksavebutton(); */
	  
}
}