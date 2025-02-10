package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_SoftAssert {
  @Test
  public void f() {
	  
	  SoftAssert softAssert = new SoftAssert();
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		String ActualTittle = driver.getTitle();
		String ExpectedTittle = "Swag Lads";
		String badTittle = "My Store";
		
		Assert.assertEquals(ActualTittle, badTittle);
		Assert.assertEquals(ActualTittle, ExpectedTittle);
		
		softAssert.assertAll();
		
  }
}
