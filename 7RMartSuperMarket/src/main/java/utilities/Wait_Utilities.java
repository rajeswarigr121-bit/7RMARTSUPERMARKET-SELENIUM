package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Utilities {
	public void waitforelementtoclick(WebDriver driver, WebElement element) 
	{
	WebDriverWait webdriverwait = new WebDriverWait(driver, Duration.ofSeconds(10));
	webdriverwait.until(ExpectedConditions.elementToBeClickable(element));
	}
	

}
