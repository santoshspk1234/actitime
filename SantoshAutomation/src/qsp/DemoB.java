package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoB {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver c1=new ChromeDriver();
		DemoA.testA(c1);
		
		
		
	}

}
