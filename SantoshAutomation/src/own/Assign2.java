package own;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone");
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[contains(text(),'i phone')]"));

		int count = allSugg.size();
		
		System.out.println(count);

		for(int i=0;i<count;i++)
		{
			System.out.println(allSugg.get(i).getText());
		}

		allSugg.get(count-1).click();
	}
}
