package vinay;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srolling {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window,scrollTo(0,500)");
         driver.close();
	}

}
