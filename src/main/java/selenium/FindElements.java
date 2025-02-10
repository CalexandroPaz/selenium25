package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		passWord.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginBtn.click();
		
		List<WebElement> prodList = driver.findElements(By.className("inventory_item_description"));
		
		System.out.println("El numero de productos es: " + prodList.size());
		String secdProd = prodList.get(1).getText();
		System.out.println(secdProd);
		
		String thirdProd = prodList.get(2).getText();
		System.out.println(thirdProd);
		
		driver.quit();
		
		
	}

}
