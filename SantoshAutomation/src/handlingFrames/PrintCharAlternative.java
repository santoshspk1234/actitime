package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCharAlternative {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/page1.html");		
		driver.findElement(By.id("t1")).sendKeys("a");

		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		
		WebElement e = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("d");
	}
}