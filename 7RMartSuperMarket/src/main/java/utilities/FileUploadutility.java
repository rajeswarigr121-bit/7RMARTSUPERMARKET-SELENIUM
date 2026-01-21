package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadutility {
	public void sendkeysforfileupload(WebElement element, String path)
	{
		element.sendKeys(path);
	}
	public void robotclassforfileupload(WebElement element, String path) throws AWTException
	{
	StringSelection selection = new StringSelection(path); //StringSelection is the class user when we use robot class
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null); //We use this step to copy the path in clipboard Toolkit is class //getDefaultToolkit().getSystemClipboard().setContents() - all these are methods used in Tookit
	Robot robot = new Robot();//new Robot()-imports with throws declaration -AWTException
	robot.delay(2000);
	robot.keyPress(KeyEvent.VK_CONTROL); // KeyEvent is class, VK - Virtual keys
	robot.keyPress(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_CONTROL); //release
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	}

}
