package own;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedibuddyTask {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();

		driver.get("https://www.medibuddy.in/");
		
		for(int i=1;i<10000;i++)
		{
			if(driver.getTitle().equals("Book Health Checks, Lab tests, Online Medicine & Doctor Consultation | MediBuddy"))
			{
				System.out.println(i);
				break;
			}
		}
		
		
		
		WebElement med = driver.findElement(By.xpath("//h1[text()='Medicine']"));
		
		int i=0;
		while(i<=100)
		{
			try {
				med.click();
				break;
			}
			catch(Exception e) {
				i++;
			}
		}
		System.out.println(i);
		

		driver.close();
	}

	
	
}
