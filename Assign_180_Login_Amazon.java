package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign_180_Login_Amazon
{
	
	

	@Test
	public void login() throws InterruptedException {
		
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
		Thread.sleep(4000);
		WebElement user=driver.findElement(By.xpath("//span[.='Hello, Shriya']"));
		//WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		Assert.assertEquals(user.isDisplayed(), true);
		//System.out.println(user.isDisplayed());
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	

}
