package handlingPopup;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupAsgn3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any title");
		String st=sc.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Thread.sleep(2000);

		Set<String> allWh = driver.getWindowHandles();

		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(!st.equals(title))
				driver.close();
		}
	}
}
