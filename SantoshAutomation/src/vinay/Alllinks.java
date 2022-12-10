package vinay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amzon.com");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int Akshay = allLinks.size();
	System.out.println(Akshay);
	for(int i=0;i<Akshay;i++) {
		WebElement Vinay = allLinks.get(i);
		String Santosh = Vinay.getText();
		System.out.println(Santosh);
		
	}
	driver.close();
	
	
	}

}
