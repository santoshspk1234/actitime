package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintList {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/Hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtr);
		List<WebElement> options = s.getOptions();
		
		for(WebElement opt:options)
		{
			String text = opt.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
