package selectClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/Hotel.html");

		WebElement cpListbox=driver.findElement(By.id("cp"));
		
		Select s=new Select(cpListbox);
		List<WebElement> allOptions=s.getOptions();
		int count = allOptions.size();
		
		ArrayList<String> a1=new ArrayList<String>();
		
		for(int i=0; i<count;i++)
		{
			String text = allOptions.get(i).getText();
			a1.add(text);
		}
		
		Collections.sort(a1);

		for(String option:a1)
		{
			System.out.println(option);
		}
		
		driver.close();
	}
}
