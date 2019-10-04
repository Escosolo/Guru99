package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how = How.NAME, using = "uid")
	public static WebElement userName;
	

	@FindBy(how = How.NAME, using = "password")
	public static WebElement passWord;
	
	@FindBy(how = How.NAME, using = "btnLogin")
	public static WebElement login;
	
	public void enter_username(String username) {
		userName.sendKeys(username);
	}	
	public void enter_password(String password) {
		passWord.sendKeys(password);
	}
	
	public void click_on_login_button() {
		login.click();
	}
}
