package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2Google {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  
	  System.out.println("The page name is: " +driver.getTitle());
	  
	  driver.quit();
	  
	
	 
	  
	  
	 
  }
}
