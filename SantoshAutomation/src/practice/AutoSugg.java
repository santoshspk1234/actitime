package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
//		int count=allSugg.size();
//		System.out.println(count);
		
		for(WebElement sugg: allSugg)
		{
			String text = sugg.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
