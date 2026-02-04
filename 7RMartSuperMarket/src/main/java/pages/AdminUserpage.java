package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUserpage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	
	public AdminUserpage(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	//WebElement moreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "(//input[@name='username'])[1]")
	WebElement username;
	@FindBy(xpath = "(//input[@name='password'])[1]")
	WebElement password;
	@FindBy(xpath = "//select[@name='user_type']")
	WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement adminalert;
	
	public AdminUserpage moreinfo_And_Newbutton()
	{
		//moreinfo.click();
		newbutton.click();
		return this;
	}
	public AdminUserpage enterUsernamePasswordUsertype(String usernamefield, String passwordfield)
	{
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		return this;
	}
	public AdminUserpage dropdown()
	{
		//Select select = new Select(usertype);
		//select.selectByIndex(1);
		pageutility.selectbyindex(usertype, 1);
		return this;
	}
	public AdminUserpage savebutton()
	{
		savebutton.click();
		return this;
	}
	public boolean adminalertsave()
	{
		return adminalert.isDisplayed();
	}
}
