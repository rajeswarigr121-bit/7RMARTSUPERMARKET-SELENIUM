package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLogout {
	public WebDriver driver;

	public HomePageLogout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initElements(driver, this) - to give the elements
	}

	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement moreinfo; // (From Admin User)

	@FindBy(xpath = "(//a[@class='small-box-footer'])[9]")
	WebElement moreinfocategory; // from managecategory

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]") // [2] - here we use index and we give[2]bcoz Logout in coming
														// in 2nd position
	WebElement logout;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[7]")
	WebElement moreinfonew; // (From ManageNEews)

	public ManageNews clickonmoreinfo() {
		moreinfonew.click();
		return new ManageNews(driver);
	}

	public ManageCategory clickOnmoreinfo() {
		moreinfocategory.click();
		return new ManageCategory(driver);
	}

	public AdminUserpage clickOn_Moreinfo() {
		moreinfo.click();
		return new AdminUserpage(driver);
	}

	public HomePageLogout clickOnAdmin() {
		admin.click();
		return this;
	}

	public HomePageLogout clickOnLogout() {
		logout.click();
		return this;
	}
}
