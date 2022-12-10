package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extra {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		String sCode = driver.getPageSource();
		
		System.out.println(sCode);
		
//		driver.navigate().to("https://www.facebook.com");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().to("https://www.amazon.com");
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);

		driver.close();
		
	}

}
