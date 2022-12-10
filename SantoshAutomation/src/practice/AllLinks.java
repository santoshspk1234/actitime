package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement> all = driver.findElements(By.xpath("//a"));
		
		for(WebElement link:all)
		{
			String text = link.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
