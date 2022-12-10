package HandlingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
Workbook wb=WorkbookFactory.create(fis);
String rock = wb.getSheet("santhu").getRow(0).getCell(0).getStringCellValue();
System.out.println(rock);
	}

}
