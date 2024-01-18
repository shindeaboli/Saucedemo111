package PageLayer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {
	
	@FindBy(name = "user-name")
	private WebElement uname;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(name = "login-button")
	private WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterUsenameAndPassword(String username, String password) {
		Wait.sendKeys(uname, username);
		Wait.sendKeys(pass, password);
	}

	public void clickOnLoginButton() {
		Wait.click(loginButton);
	}
	
	

	public String validateTitle() {

		return 	driver.getTitle();	}

}

