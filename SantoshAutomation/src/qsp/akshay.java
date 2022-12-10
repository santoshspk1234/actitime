package qsp;

import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class akshay {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		int akshay = driver.findElement(By.xpath("//input[@name='password']")).getLocation().getX();
		int akshayv = driver.findElement(By.name("username")).getLocation().getY();
		System.out.println(akshay);
		System.out.println(akshayv);
		
		

	}

}
