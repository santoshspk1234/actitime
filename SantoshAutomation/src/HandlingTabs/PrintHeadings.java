package HandlingTabs;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeadings {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		
		driver.findElement(By.linkText("Read Service Agreement")).click();
				
		Set<String> wh = driver.getWindowHandles();
		
		for(String t:wh)
		{
			driver.switchTo().window(t);
		}
		
		List<WebElement> allHeadings = driver.findElements(By.xpath("//h2"));
		
		for(WebElement heading:allHeadings)
		{
			String text = heading.getText();
			System.out.println(text);
		}
	}

}
