package testScriptProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pages.HomePageLogout;
import pages.LoginPageMain;
import pages.ManageNews;
import utilities.ExcelUtility;

public class ManageNewsTest extends Basetest {
	public HomePageLogout home;
	public ManageNews news;

	@Test(description = "Verify the Manage News Page")
	public void enterUsernameAndPassword() throws IOException {
		LoginPageMain loginpage = new LoginPageMain(driver);
		String Username = ExcelUtility.getStringData(1, 0, "ManageNews");
		String Password = ExcelUtility.getStringData(1, 1, "ManageNews");
		loginpage.enterUsernameAndPassword(Username, Password);
		home = loginpage.clickOnSignIn();
		news = home.clickonmoreinfo();
		news.clickonNew().enternew("News").clicksavebutton();

		boolean managenewsalert = news.alertnewsgreen();
		Assert.assertTrue(managenewsalert, Constants.MANAGENEWS);

		/*
		 * ManageNews managenews = new ManageNews(driver);
		 * managenews.clickonmoreinfoandclickNew(); managenews.enternew("Hello Kitty");
		 * managenews.clicksavebutton();
		 */

	}
}