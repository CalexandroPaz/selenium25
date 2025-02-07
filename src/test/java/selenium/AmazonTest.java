package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
  @Test
  public void f() {
	  
	  //Initialize
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  
	  driver.manage().window().maximize();
	  
	  //Input
	  String search = "Hands-on Selenium WebDriver";
	  //WebElements
	  WebElement searchBtn = driver.findElement(By.cssSelector("input[id*='twotabsearchtextbox']"));
	  WebElement searchBtnClick = driver.findElement(By.id("nav-search-submit-button"));
	  
	  //Methods
	  searchBtn.sendKeys(search);
	  searchBtnClick.click();
  }
}
