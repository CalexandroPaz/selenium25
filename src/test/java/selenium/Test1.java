package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://wwww.facebook.com");
	 
	  
  }
}
