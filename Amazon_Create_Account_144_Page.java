package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Create_Account_144_Page {
	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&prevRID=XVP60EF5BN4XM0QQHF65&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement name= driver.findElement(By.name("customerName"));
		name.sendKeys("Sarika");
		WebElement id=driver.findElement(By.id("ap_phone_number"));
		id.sendKeys("0123456789");
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("1234567");
		
		WebElement e1=driver.findElement(By.id("continue"));
		e1.click();
		
		
		
		
	}

}
