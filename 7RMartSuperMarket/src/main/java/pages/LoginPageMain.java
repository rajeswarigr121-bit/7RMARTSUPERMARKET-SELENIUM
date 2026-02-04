package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Wait_Utilities;

public class LoginPageMain {
	public WebDriver driver; 
	public Wait_Utilities waitutilities = new Wait_Utilities();
	
	public LoginPageMain(WebDriver driver)//constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath = "//input[@name='username']")
WebElement Username;
@FindBy(xpath = "//input[@name='password']")
WebElement Password;
@FindBy(xpath = "//button[@type='submit']")
WebElement Signinbutton;
@FindBy(xpath = "(//a[@class='small-box-footer'])[2]")
WebElement Dashboard;
@FindBy(xpath = "(//a[@class='small-box-footer'])[2]")
WebElement dashboard1;
@FindBy(xpath = "(//a[@class='small-box-footer'])[2]")
WebElement dashboard2;
@FindBy(xpath = "(//a[@class='small-box-footer'])[2]")
WebElement dashboard3;

public LoginPageMain enterUsernameAndPassword(String Usernamefield, String Passwordfield)
{
	
	Username.sendKeys(Usernamefield);
	Password.sendKeys(Passwordfield);
	return this;
}
public HomePageLogout clickOnSignIn()
{
	waitutilities.waitforelementtoclick(driver,Signinbutton );
	Signinbutton.click();
	return new HomePageLogout(driver);
}
public boolean isdashboardIdDisplayed()
{
	return Dashboard.isDisplayed();
}
public boolean isdashboardIdDisplayed1()
{
	return dashboard1.isDisplayed();
}
public boolean isdashboardIdDisplayed2()
{
	return dashboard2.isDisplayed();
}
public boolean isdashboardIdDisplayed3()
{
	return dashboard3.isDisplayed();
}

}
