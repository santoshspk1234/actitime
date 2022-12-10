package selectClass;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/Hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions = s.getOptions();
		
		for(WebElement option:allOptions)
		{
			String text = option.getText();
			System.out.println(text);
		}
	}

}
