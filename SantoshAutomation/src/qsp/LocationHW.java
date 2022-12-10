package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationHW {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/DisabledElements.html");
		int userX = driver.findElement(By.id("d1")).getLocation().getX();
		int userY = driver.findElement(By.id("d1")).getLocation().getY();
		
//		System.out.println(userX);
//		System.out.println(userY);
//		
		int pwdX = driver.findElement(By.id("d1")).getLocation().getX();
		int pwdY = driver.findElement(By.id("d1")).getLocation().getY();
		
//		System.out.println(pwdX);
//		System.out.println(pwdY);
		
		if(userX==pwdX && userY==pwdY)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}

}
