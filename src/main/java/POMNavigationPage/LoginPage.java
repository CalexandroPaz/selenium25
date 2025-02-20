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
	private WebElement userNameInput;
	
	@FindBy(id = "password")
	private WebElement pwdnput;
	
	@FindBy(id = "login-button")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//*[@data-test='error']")
	private WebElement errorMsg;
	
	public void login(String user, String pwd) {
		WrapClass.sendKeys(userNameInput, user);
		WrapClass.sendKeys(pwdnput, pwd);
		WrapClass.click(loginBtn);
	}
	
	public boolean validateLockedUserError() {
		boolean errorDisplayed = WrapClass.getText(errorMsg).contains("Sorry, this user has been locked out");
		return errorDisplayed;
	}

}
