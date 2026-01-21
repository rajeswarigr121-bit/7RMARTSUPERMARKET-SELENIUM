package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constants;
import utilities.FileUploadutility;
import utilities.Wait_Utilities;

public class ManageCategory {
	Wait_Utilities wait =new Wait_Utilities();
	public WebDriver driver;
	FileUploadutility filesupload = new FileUploadutility();
	public ManageCategory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath="(//a[@class='small-box-footer'])[9]")
	//WebElement moreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath="//input[@type='text']")
	WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']")
	WebElement discount;
	@FindBy(xpath="//input[@id='main_img']")
	WebElement choosefile;
	@FindBy(xpath="(//input[@value='yes'])[1]")
	WebElement showontopmenu;
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	//public ManageCategory clickOnmoreinfo() {
	//	moreinfo.click();
	//	return this;
//	}
	public ManageCategory clickOnNewButton() {
		newbutton.click();
		return this;
	}
	public ManageCategory enterCategory(String categoryfield) {
		category.sendKeys(categoryfield);
		return this;
		
	}
	public ManageCategory clickOnDiscount() 
	{
		discount.click();
		return this;
	}
	public ManageCategory uploadChooseFileButton( ) 
	{
		filesupload.sendkeysforfileupload(choosefile, Constants.IMAGEPATH);
		return this;
	}
	
	public ManageCategory clickOnShowTopmenu() {
		showontopmenu.click();
		return this;
	}
	public ManageCategory clickOnSavebutton() {
		wait.waitforelementtoclick(driver, save);
		save.click();
		return this;
	}

}

