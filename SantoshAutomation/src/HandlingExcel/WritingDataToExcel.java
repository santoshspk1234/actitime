package HandlingExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("Sheet2").getRow(10).getCell(0).setCellValue("admin");
		wb.getSheet("Sheet2").getRow(10).getCell(1).setCellValue("manager");
		
//		String data = wb.getSheet("santhu").getRow(1).getCell(4).getStringCellValue();
//		System.out.println(data);
		
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
		
	}
}
