package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/DisabledElements.html");
		
	//	Thread.sleep(2000);
		driver.findElement(By.id("d1")).sendKeys("rocky bhai");
		
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("document.getElementById('d2').value='143sfdhjvgf'");
		
	//	Thread.sleep(2000);
		r.executeScript("document.getElementById('d2').value=''");
		
		
		int x = driver.findElement(By.id("d1")).getLocation().getX();
		int y = driver.findElement(By.id("d1")).getLocation().getY();
		
		int x1 = driver.findElement(By.id("d2")).getLocation().getX();
		int y1 = driver.findElement(By.id("d2")).getLocation().getY();
		
		System.out.println(x+" "+y);
		System.out.println(x1+" "+y1);
		
		driver.close();
	}

}
