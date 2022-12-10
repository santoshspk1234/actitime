import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	static WebDriver driver;

	public static void main(String[] args) {

		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		long mili1 = System.currentTimeMillis();

		driver.get("https://www.medibuddy.in/");
		
		long mili2=System.currentTimeMillis();
		
		driver.findElement(By.xpath("//h1[normalize-space()='Talk to Doctor']"));

		long mili3=System.currentTimeMillis();

		long time = mili2-mili1;
		long page2Ele = mili3-mili2;

		System.out.println(time);
		System.out.println(page2Ele);


	}
}