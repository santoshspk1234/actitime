package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allSug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
		Thread.sleep(2000);
		
		int count=allSug.size();
		System.out.println(count);
		
//		for(WebElement sug:allSug)
//		{
//			String text = sug.getText();
//			System.out.println(text);
//		}
	}

}
