package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class URLWithoutGet {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver c1=new ChromeDriver();
		
		c1.get("https://www.google.com");

		System.out.println(c1.getTitle());
		Thread.sleep(2000);
		
		c1.navigate().to("https://www.gmail.com");
		Thread.sleep(2000);
		
		c1.navigate().back();
		Thread.sleep(2000);
		
		c1.navigate().forward();
		Thread.sleep(2000);
		
		c1.navigate().refresh();
		Thread.sleep(2000);
		
		c1.close();
		
	}

}
