package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectbyindex(WebElement element,int index)
	{
		Select object = new Select(element);
		object.selectByIndex(index);
	}
	public void selectbyValue(WebElement element, String values)
	{
		Select select = new Select(element);
		select.selectByValue(values);
	}
	public void selectByVisibletext(WebElement element, String values)
	{
		Select selects = new Select(element);
		selects.selectByVisibleText(values);
		
	}
}
