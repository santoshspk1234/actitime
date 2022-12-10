package handlingScrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPerticularEliment {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		int y = driver.findElement(By.xpath("//span[@class='planet--title']")).getLocation().getY();
		
//		j.executeScript("window.scrollTo(0,y)"); //CTE
		
		j.executeScript("window.scrollTo(0,"+y+")");
		
	}
}
