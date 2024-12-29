package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign_162_Handling_AutoSuggetion_1mg {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver d= new EdgeDriver();
		d.get("https://www.1mg.com/");
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement Search=d.findElement(By.id("srchBarShwInfo"));
		Search.sendKeys("Dolo");
		
		Thread.sleep(2000);
		
		List<WebElement> e1=d.findElements(By.xpath("(//div[@class='styles__search-results-container___3OUHy'])/ul/li"));
		int count =e1.size();
		System.out.println(count);
		
		e1.get(5).click();
		d.quit();
		

	}


}
