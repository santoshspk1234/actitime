package selectClass;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any option");
		String option = sc.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hanumanth/Desktop/Santosh/Hotel.html");
		WebElement a = driver.findElement(By.id("mtr"));
		Select s1=new Select(a);
		
		List<WebElement> allOpt = s1.getOptions();
		int count=allOpt.size();
		
		int counter=0;
		
		for(int i=0; i<count; i++)
		{
			String text = allOpt.get(i).getText();
			if(option.equals(text))
				counter++;
		}
		if(counter==0)
			System.out.println(option+" is not found in the list");
		else if(counter==1)
			System.out.println(option+" is found");
		else
			System.out.println(option+" is found "+counter+" times");
	}

}
