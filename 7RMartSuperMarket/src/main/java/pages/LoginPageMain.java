package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Wait_Utilities;

public class LoginPageMain {
	public WebDriver driver;
	public Wait_Utilities waitutilities = new Wait_Utilities();

	public LoginPageMain(WebDriver driver)// constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signinbutton;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[2]")
	WebElement dashboard;
	
	public LoginPageMain enterUsernameAndPassword(String Usernamefield, String Passwordfield) {

		username.sendKeys(Usernamefield);
		password.sendKeys(Passwordfield);
		return this;
	}

	public HomePageLogout clickOnSignIn() {
		Wait_Utilities.waitforelementTobeSelected(driver, signinbutton);
		signinbutton.click();
		return new HomePageLogout(driver);
	}

	public boolean isdashboardIdDisplayed() {
		return dashboard.isDisplayed();
	}

	

}
