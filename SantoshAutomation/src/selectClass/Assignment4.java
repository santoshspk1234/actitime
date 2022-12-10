package selectClass;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		HashSet<String> sh=new HashSet<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/Hotel.html");

		WebElement mtr = driver.findElement(By.id("cp"));
		Select s=new Select(mtr);
		List<WebElement> options = s.getOptions();

		HashSet<String> hs=new HashSet<String>();

		for(WebElement i:options)
		{
			if(hs.add(i.getText())==false)
				System.out.println(i.getText());
		}

		driver.close();
	}
}
