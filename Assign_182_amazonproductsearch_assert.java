package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign_182_amazonproductsearch_assert 
{

	@Test
	public void logout() {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes"+Keys.ENTER);
		List<WebElement> l=driver.findElements(By.xpath("//div[@ class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']"));
	   
		//System.out.println(l.size());
	    
		Assert.assertEquals(l.size()>50, true);
		driver.quit();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
