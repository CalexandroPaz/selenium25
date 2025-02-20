package POMCommonMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

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
	
	public static String getText(WebElement webElementUI) {
		return webElementUI.getText();		
	}
	
	public static boolean isDisplayed(WebElement webElementUI) {
		return webElementUI.isDisplayed();
	}
	
	public static void takeScreenshot(WebDriver webDriver, String testCaseName) {
		File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath = "./test-output/ExecutionResults";
			
		try {
			FileHandler.createDir(new File(screenshotPath)); //Creamo el folder usando la ruta especificada de la variable "screenshotPath"
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
