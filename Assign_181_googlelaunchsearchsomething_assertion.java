package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign_181_googlelaunchsearchsomething_assertion 
{
	@Test
	public void googlesearch() throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("India"+Keys.ENTER);
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
		//Assert.assertNotEquals(driver.getTitle(),"Google");		
		driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
