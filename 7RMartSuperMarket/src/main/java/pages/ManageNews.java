package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	public WebDriver driver;
	public ManageNews(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,  this);
	}
	//@FindBy(xpath = "(//a[@class='small-box-footer'])[7]")
	//WebElement moreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement clickNew;
    @FindBy(xpath = "//textarea[@id='news']")
    WebElement news;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement save;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement newsalert;
    
    
    public ManageNews clickonNew()
    {
    	clickNew.click();
    	return this;
    }
    public ManageNews enternew(String Newsfield)
    {
    	news.sendKeys(Newsfield);
    	return this;
    }
    
    public ManageNews clicksavebutton()
    {
    	save.click();
    	return this;
    }
    public boolean alertnewsgreen()
    {
    	return newsalert.isSelected();
    }
}
