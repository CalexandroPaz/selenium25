package POMNavigationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POMCommonMethods.WrapClass;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//LoginPage WebElements
	@FindBy(id="user-name")
	WebElement userNameInput;
	
	@FindBy(id = "password")
	WebElement pwdnput;
	
	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	public void login(String user, String pwd) {
		WrapClass.sendKeys(userNameInput, user);
		WrapClass.sendKeys(pwdnput, pwd);
		WrapClass.click(loginBtn);
	}

}
