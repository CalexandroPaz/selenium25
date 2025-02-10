package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		String ActualTittle = driver.getTitle();
		String ExpectedTittle = "Swa asd";
		
		Assert.assertEquals(ActualTittle, ExpectedTittle);
	  
  }
}
