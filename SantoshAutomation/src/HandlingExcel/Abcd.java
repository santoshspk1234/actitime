package HandlingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abcd {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count=wb.getSheet("Sheet2").getLastRowNum();
		
		for(int i=9; i<=12; i++)
		{
			String user = wb.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
			String pass = wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();

			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");			
			driver.findElement(By.id("username")).sendKeys(user);
			driver.findElement(By.name("pwd")).sendKeys(pass);			
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
			Thread.sleep(5000);	
//			WebDriverWait wait=new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.titleContains("Time-Track"));
			
			String title = driver.getTitle();
			System.out.println(title);

			if(title.equals("actiTIME - Enter Time-Track"))
				System.out.println("Username and Password matched for "+i+"th record");
			else
				System.out.println("Username and Password not matched for "+i+"th record");
			
			Thread.sleep(2000);
			driver.quit();
		}	
	}
}
