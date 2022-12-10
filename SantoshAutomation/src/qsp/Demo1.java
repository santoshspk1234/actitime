package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {

		FirefoxDriver f1=new FirefoxDriver();
		f1.get("https://www.google.com");
	
	}

}
//remotewebdriver