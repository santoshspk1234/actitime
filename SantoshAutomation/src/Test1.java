import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://www.medibuddy.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt=\"doctor\"]")).click();
		
		Set<String> wh = driver.getWindowHandles();
		
		for(String w:wh)
		{
			driver.switchTo().window(w);
		}
		driver.findElement(By.xpath("(//img[@class=\"talkToDocPaytm\"])[1]")).click();
		
		driver.findElement(By.id("mobNum")).sendKeys("8660038710");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		driver.findElement(By.xpath("//li[text()='wife']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='23 Years']")).click();
		driver.findElement(By.linkText("Next")).click();
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShot/snc.png");
		FileUtils.copyFile(src, dest);
	}
}
