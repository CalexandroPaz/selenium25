package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelenium {
	
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
		
		//Metodos del explorador
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Thread.sleep(2000);
		
		//Metodos de Navegacion
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		
		//Obtener el texto de un WebElement
		 boolean itemDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		 if(itemDisplayed) {
			 System.out.println("El articulo esta desplegado");
		 }
		 
		 //Obtener el texto de un WebElement
		 
		 String prodName = driver.findElement(By.className("inventory_item_name")).getText();
		 boolean  prod = prodName.equals("Sauce Labs Backpack");
		 if (prod) {
			 System.out.println("El nombre del articulo es correcto");
		 }else {
			 System.out.println("El nombre del articulo es incorrecto");
		 }
		 
		 //DropDowns
		 
		 Select drpFilter = new Select(driver.findElement(By.className("product_sort_container")));
		 drpFilter.selectByVisibleText("Price (low to high)");
		 
		 //Cerrar el Navegador Web
		 driver.quit();
		 
	}

}
