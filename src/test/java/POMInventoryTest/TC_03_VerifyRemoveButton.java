package POMInventoryTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMCommonMethods.DriverSetup;
import POMCommonMethods.GlobalVariables;
import POMCommonMethods.WrapClass;
import POMNavigationPage.InventoryPage;
import POMNavigationPage.LoginPage;

public class TC_03_VerifyRemoveButton {
	//Declarar e inicializar el WebDriver
	
		WebDriver driver = DriverSetup.setupDriver();
		
		//PageObjects
		
		LoginPage loginPage = new LoginPage(driver);
		InventoryPage inventoryPage = new InventoryPage(driver);
		
		@BeforeTest
		
		public void startPage() {
			driver.get(GlobalVariables.HOME_PAGE);
		}
		
		
	  @Test
	  public void LoginTest_03() {
		  //Step 1 : Login
		  loginPage.login(GlobalVariables.USERNAME, GlobalVariables.PWD);
		  //Step 2 : Verify remove button
		  Assert.assertTrue(inventoryPage.verifyRemoveButton());
	  }
	  
	  @AfterTest
	  public void closeDriver() {
		  WrapClass.takeScreenshot(driver, "LoginTest_03");
		  WrapClass.driverQuit(driver);
	  }
}
