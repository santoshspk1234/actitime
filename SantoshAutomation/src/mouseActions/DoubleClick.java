package mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
		WebElement we = driver.findElement(By.id("loginspan"));
		
		a.doubleClick(we).perform();
		String title = driver.getTitle();
		
		if(title.equals("Login - Vtiger"))
			System.out.println("Test passed");
		else
			System.out.println("Test failed");
	}

}
