package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
	//	driver.close();
		
		driver.get("https://www.facebook.com");
		String t1 = driver.getTitle();
		System.out.println(t1);
	//	driver.close();
		
		driver.get("https://www.instagram.com");
		String t2 = driver.getTitle();
		System.out.println(t2);
	//	driver.close();
		
		driver.get("https://www.myntra.com");
		String t3 = driver.getTitle();
		System.out.println(t3);
	//	driver.close();
		
		driver.get("https://www.amazon.com");
		String t4 = driver.getTitle();
		System.out.println(t4);

		driver.close();
	}

}
