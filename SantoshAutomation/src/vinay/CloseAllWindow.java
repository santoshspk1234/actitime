package vinay;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		Set<String> allWin = driver.getWindowHandles();//allWin=indeed,fb,apple
		
		for(String win:allWin)
		{
			driver.switchTo().window(win);
			Thread.sleep(2000);
			driver.close();
		}
		
		
		
		
		System.out.println("All done");
		
		
		
		
		
	     
	}

}
