package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWithoutQuit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://secure.indeed.com");
		driver.findElement(By.id("apple-signin-button")).click();
//		driver.findElement(By.xpath("//span[text()=\"Continue with Google\"]")).click();

		driver.findElement(By.xpath("//span[text()=\"Continue with Facebook\"]")).click();
		
		Set<String> wh = driver.getWindowHandles();
		
		for(String w:wh)
		{
			driver.switchTo().window(w);
			driver.close();
		}
		
	}

}
