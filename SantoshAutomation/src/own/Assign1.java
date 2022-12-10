package own;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Assign1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");

		//	Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");

		Thread.sleep(2000);

		List<WebElement> links = driver.findElements(By.xpath("//span[contains(text(),'java')]"));

		int count = links.size();
		System.out.println(count);

//		for(int i=0;i<count;i++)
//		{
//			System.out.println(links.get(i).getText());
//		}
//
//		links.get(count-1).click();
	}

}


