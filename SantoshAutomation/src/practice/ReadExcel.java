package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		int count=wb.getSheet("Sheet2").getLastRowNum();
		
		for(int i=1; i<=count; i++)
		{
			String un = wb.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(un+"\t"+pw);
		}
	//	String data = wb.getSheet("Create").getRow(1).getCell(0).getStringCellValue();
	//	System.out.println(data);
	}

}
