package assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_171_fetch_data_excel {
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

		String password = w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
		// System.out.println(password);
		/*ChromeDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&prevRID=XVP60EF5BN4XM0QQHF65&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement name = driver.findElement(By.name("customerName"));
		name.sendKeys(username);
		WebElement id = driver.findElement(By.id("ap_phone_number"));
		id.sendKeys("0123456789");
		WebElement pw = driver.findElement(By.id("ap_password"));
		pw.sendKeys(password);

		WebElement e1 = driver.findElement(By.id("continue"));
		e1.click();*/
		

	}

}
