package handlingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args){

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		WebElement mmListbox = driver.findElement(By.className("ui-datepicker-month"));	
		Select s1=new Select(mmListbox);
		s1.selectByIndex(5);
		
		WebElement yyListbox = driver.findElement(By.className("ui-datepicker-year"));	
		Select s2=new Select(yyListbox);
		s2.selectByVisibleText("1998");
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[9]")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		
		driver.findElement(By.id("renew_policy_submit")).click();
		
		boolean b = driver.findElement(By.xpath("//span[@id='policynumberError']")).isDisplayed();

		if(b==true)
			System.out.println("passed");
		else
			System.out.println("failed");
		
	}

}


/*
String text = driver.findElement(By.xpath("//span[@id='policynumberError']")).getText();

String msg="Please enter valid Policy No.";

if(msg.equals(text))
System.out.println("Test is passed");
else
System.out.println("Test is failed");
*/