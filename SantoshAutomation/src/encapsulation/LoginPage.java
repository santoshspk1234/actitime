package encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement lgbtn;
	
	public LoginPage(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
	
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.actitime.com/login.do");
//		
//		LoginPage l=new LoginPage(driver);
//		l.setLogin("admin","manager");
//	}
}
