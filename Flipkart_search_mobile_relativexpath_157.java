package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_search_mobile_relativexpath_157 {

	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https:/www.flipkart.com");
		WebElement e1=d.findElement(By.xpath("(//input)[1]"));
		e1.sendKeys("Mobiles");
		e1.sendKeys(Keys.ENTER);

	}

}
