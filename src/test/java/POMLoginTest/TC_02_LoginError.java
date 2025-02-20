package POMLoginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMCommonMethods.DriverSetup;
import POMCommonMethods.GlobalVariables;
import POMCommonMethods.WrapClass;
import POMNavigationPage.LoginPage;

public class TC_02_LoginError {
	//Declarar e inicializar el WebDriver
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest

	
	public void startPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
		@Test
  public void LoginTest_02() {
	  //step1 : login
	  loginPage.login(GlobalVariables.USERNAME_LOCKED, GlobalVariables.PWD);
	  //step2 : Validate error
	  Assert.assertTrue(loginPage.validateLockedUserError());
  
  }
  @AfterTest
  public void closeDriver() {
	  WrapClass.takeScreenshot(driver, "LoginTest_02");
	  WrapClass.driverQuit(driver);
  }
  
}

  
  