package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task {

	@Test
	public void readExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String un = wb.getSheet("Sheet2").getRow(10).getCell(0).getStringCellValue();
		String pw = wb.getSheet("Sheet2").getRow(10).getCell(1).getStringCellValue();

		Reporter.log(un,true);
		Reporter.log(pw,true);
	}
	
	@Test
	public void writeExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("Sheet2").getRow(10).getCell(0).setCellValue("admin10");
		wb.getSheet("Sheet2").getRow(10).getCell(1).setCellValue("manager10");
		
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
	}
	
	@Test
	public void property() throws IOException {
		FileInputStream fis=new FileInputStream("./data/Commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		
		Reporter.log(url,true);
		Reporter.log(un,true);
		Reporter.log(pw,true);
	}
}
