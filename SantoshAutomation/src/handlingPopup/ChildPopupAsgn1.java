package handlingPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupAsgn1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Thread.sleep(2000);

		String parent = driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();

		for(String wh:allWh)
		{
			if(!parent.equals(wh))
			{
				driver.switchTo().window(wh);
				driver.close();
			}
		}
	}
}
