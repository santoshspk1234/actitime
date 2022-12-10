package encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage l=new LoginPage(driver);
		
		l.setLogin("admin1", "manager1");//StaleElementReferenceException
		Thread.sleep(3000);

		l.setLogin("admin", "manager");
	}

}
