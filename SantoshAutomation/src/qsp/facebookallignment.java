package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookallignment {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    int bossx = driver.findElement(By.id("email")).getLocation().getX();
    int vinayy = driver.findElement(By.id("email")).getLocation().getY();
    
    System.out.println(bossx);
    System.out.println(vinayy);
    
    
    int vinnux = driver.findElement(By.id("pass")).getLocation().getX();

    int vinnuy = driver.findElement(By.id("pass")).getLocation().getY();
    
    System.out.println(vinnux);
    System.out.println(vinnuy);

    
	}

}
