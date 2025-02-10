package POMLoginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMCommonMethods.DriverSetup;
import POMCommonMethods.GlobalVariables;
import POMCommonMethods.WrapClass;
import POMNavigationPage.LoginPage;

public class TC_01_Login {
	
	//Declarar e inicializar el WebDriver
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	
	public void startPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	
  @Test
  public void LoginTest_01() {
	  loginPage.login(GlobalVariables.USERNAME, GlobalVariables.PWD);
	  
  }
  
  @AfterTest
  public void closeDriver() {
	  WrapClass.driverQuit(driver);
  }
  
}
