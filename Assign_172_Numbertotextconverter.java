package assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Assign_172_Numbertotextconverter {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\kales\\eclipse-workspace\\Selenium\\Excelsheet\\Sarika.xlsx");

		// step1(Method1=Stepbystep)
		Workbook w1 = WorkbookFactory.create(f1);

		// step2
		Sheet s1 = w1.getSheet("logindetails");

		// step3
		Row r1 = s1.getRow(1);

		// step4
		Cell c1 = r1.getCell(0);
		String username = c1.getStringCellValue();
		// System.out.println(username);

		// method2=direct

		//String password = w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
		String pass=NumberToTextConverter.toText(w1.getSheet("logindetails").getRow(1).getCell(1).getNumericCellValue());
       System.out.println(pass);

	}

}