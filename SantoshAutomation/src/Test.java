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

public class Test {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://www.medibuddy.in/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.id("phone")).sendKeys("8884739055");
		driver.findElement(By.xpath("(//button[text()='Log in'])[1]")).submit();
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//img[@alt='doctor']")).click();
		Set<String> wh = driver.getWindowHandles();
		
		for(String w:wh)
		{
			driver.switchTo().window(w);
		}

		driver.findElement(By.xpath("//img[@class='talkToDocPaytm']")).click();
//		System.out.println("1");
		
//		driver.findElement(By.id("mobNum")).sendKeys("8660038710");
//		System.out.println("2");
//		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//		System.out.println("3");
//		Thread.sleep(10000);
//		
//		driver.findElement(By.xpath("//li[text()='father']")).click();
//		WebElement age = driver.findElement(By.xpath("//div[text()='18 Years']/.."));
//		
//		Select s=new Select(age);
//		s.selectByVisibleText("50 Years");
//		
//		driver.findElement(By.xpath("//a[text()='Next']"));
//		
//		TakesScreenshot t=(TakesScreenshot) driver;
//		File src = t.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./screenShot/snc.png");
//		FileUtils.copyFile(src, dest);
	}

}
