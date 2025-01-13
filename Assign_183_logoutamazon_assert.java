package assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign_183_logoutamazon_assert 
{

	@Test
	public void logout() throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fhomepage.html%3F_encoding%3DUTF8%26ref_%3Dnavm_em_signin%26action%3Dsign-out%26path%3D%252Fgp%252Fhomepage.html%253F_encoding%253DUTF8%2526ref_%253Dnavm_em_signin%26signIn%3D1%26useRedirectOnSuccess%3D1%26ref_%3Dnav_em_signout_0_1_1_40&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		//driver.navigate();
		
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("pathak.saru@gmail.com");
		WebElement con_key=driver.findElement(By.className("a-button-input"));
		con_key.click();
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("Amazon@2584");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		
		WebElement acc=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		
		a1.moveToElement(acc).perform();
		
		WebElement signout=driver.findElement(By.xpath("//span[.='Sign Out']"));
		signout.click();
		//a1.moveToElement(signout).perform();
		
		Thread.sleep(5000);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
