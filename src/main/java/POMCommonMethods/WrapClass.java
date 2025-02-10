package POMCommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WrapClass {
	
	public static void click(WebElement webElementUI) {
		webElementUI.click();
	}
	
	public static void sendKeys(WebElement webElementUI, String textToSend) {
		webElementUI.sendKeys(textToSend);
	}
	
	public static void driverQuit(WebDriver driver) {
		driver.quit();
	}

}
