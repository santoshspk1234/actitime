package own;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.FindElements;

public class Assignment2 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("i phone");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'i phone')]/.."));
		
		int count=allSugg.size();
		
		for(int i=0; i<count; i++) {
			System.out.println(allSugg.get(i).getText());
			System.out.println();
		}
		Thread.sleep(2000);
		
		allSugg.get(count-1).click();
		
		System.out.println();

		System.out.println("Total number of suggestions : "+count);
				
	}

}
