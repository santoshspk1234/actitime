package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/Hotel.html");
		WebElement cp = driver.findElement(By.id("cp"));
		
		Select s=new Select(cp);
		List<WebElement> selected = s.getAllSelectedOptions();
		
		for(WebElement opt:selected)
		{
			String text = opt.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
