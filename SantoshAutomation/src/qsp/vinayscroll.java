package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vinayscroll {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		int ht = driver.findElement(By.xpath("//a[text()='India News']")).getLocation().getY();
		//System.out.println(ht);
		
		
		JavascriptExecutor a=(JavascriptExecutor) driver;
		Thread.sleep(6000);
		a.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.close(); 
	

	}

}
