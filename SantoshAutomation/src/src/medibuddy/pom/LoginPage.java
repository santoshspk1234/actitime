package src.medibuddy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "username")
	private WebElement un;
	
	@FindBy(name = "pwd")
	private WebElement pw;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLoginCredentials(String username, String password) {
		un.sendKeys(username);
		pw.sendKeys(password);
		lgBtn.click();
	}
	
}
