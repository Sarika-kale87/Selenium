package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign_163_Handling_Autosuggetion_Flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		
		EdgeDriver d= new EdgeDriver();
		d.get("https://www.flipkart.com");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.xpath("(//input[@class='Pke_EE'])"));
		e.sendKeys("Id cards");
		Thread.sleep(2000);
	List<WebElement> e1=d.findElements(By.xpath("(//form[@class='_2rslOn header-form-search OpXDaO'])/ul/li"));
		
	    
		System.out.println(e1.size());
		
		e1.get(1).click();
		d.quit();
		
		
		
		
	}

}
