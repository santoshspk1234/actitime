package handlingPopup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/naukri.html");
		File f=new File("./data/Santosh_resume.pdf");
		String absPath = f.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.id("cv")).sendKeys(absPath);
	}
}
