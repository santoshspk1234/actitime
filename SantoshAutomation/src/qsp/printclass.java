package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class printclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> all = driver.findElements(By.xpath("//a"));
		
		int vinay = all.size();
		System.out.println("Total number of links : "+vinay);
		
		for( WebElement santosh: all)
		{
			String text = santosh.getText();
			System.out.println(text);
		}
		


	}
}