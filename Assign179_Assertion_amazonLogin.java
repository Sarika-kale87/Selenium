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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assign179_Assertion_amazonLogin {
	@DataProvider(name = "amazon_login")
	public Object[][] logindetails() throws EncryptedDocumentException, IOException, InterruptedException {
		Object[][] info = new Object[4][2];
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\kales\\eclipse-workspace\\Selenium\\Excelsheet\\Sarika.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		
		String user1=NumberToTextConverter.toText(w1.getSheet("logindetails").getRow(0).getCell(0).getNumericCellValue());
		String pass1=w1.getSheet("logindetails").getRow(0).getCell(1).getStringCellValue();
		String user2=w1.getSheet("logindetails").getRow(1).getCell(0).getStringCellValue();
		String pass2=w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
		String user3=w1.getSheet("logindetails").getRow(2).getCell(0).getStringCellValue();
		String pass3=w1.getSheet("logindetails").getRow(2).getCell(1).getStringCellValue();
		String user4=w1.getSheet("logindetails").getRow(3).getCell(0).getStringCellValue();
		String pass4=w1.getSheet("logindetails").getRow(3).getCell(1).getStringCellValue();
		
		Thread.sleep(3000);
		info[0][0]=user1;
		info[0][1]=pass1;
		info[1][0]=user2;
		info[1][1]=pass2;
		info[2][0]=user3;
		info[2][1]=pass3;
		info[3][0]=user4;
		info[3][1]=pass4;	

		return info;
	}
	

	@Test(dataProvider="amazon_login")
	public void login(String username, String password) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fhomepage.html%3F_encoding%3DUTF8%26ref_%3Dnavm_em_signin%26action%3Dsign-out%26path%3D%252Fgp%252Fhomepage.html%253F_encoding%253DUTF8%2526ref_%253Dnavm_em_signin%26signIn%3D1%26useRedirectOnSuccess%3D1%26ref_%3Dnav_em_signout_0_1_1_40&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		//WebElement e1 = driver.findElement(By.linkText("Sign in"));
		//e1.click();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys(username);
		Thread.sleep(3000);
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys(password);
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
	}

}
