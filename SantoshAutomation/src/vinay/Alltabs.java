package vinay;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alltabs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://secure.indeed.com/auth");
    
    driver.findElement(By.id("login-google-button")).click();
    driver.findElement(By.id("apple-signin-button")).click();
          Set<String> allwh = driver.getWindowHandles();
          
          for(String vinnu:allwh)
          {
        	  driver.switchTo().window(vinnu);
        	  Thread.sleep(4000);
        	  driver.close();
          }
        	  
        	  
    
	}

}
