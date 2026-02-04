package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByindex(WebElement element,int index) {
	 Select select=new Select(element);
	 select.selectByIndex(index);
		
	}
	public void selectByVisibleText(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
		
	}
	public void selectByValues(WebElement element,String values) {
		Select select=new Select(element);
		select.selectByValue(values);
	}
	public void mouseaction(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element);
		
	}
	public void scrollup(WebDriver driver, String script) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript(script);
	}
	public void scrolldown(WebDriver driver, String script) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript(script);
	}


}