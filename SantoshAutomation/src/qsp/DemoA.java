package qsp;

import org.openqa.selenium.WebDriver;

public class DemoA {

	static void testA(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
}
