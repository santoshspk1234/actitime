package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/Commondata.property");
		Properties p=new Properties();
		
		p.load(fis);
		
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		
//		WebDriver driver=new ChromeDriver();
//		driver.get(url);
//		driver.findElement(By.id("username")).sendKeys(un);
//		driver.findElement(By.name("pwd")).sendKeys(pw);
		
	//	driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
