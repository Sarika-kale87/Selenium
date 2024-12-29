package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_164_flipkart_search_shoes_addTocart {

	public static void main(String[] args) throws InterruptedException
	{
	    ChromeDriver d=new ChromeDriver();
	    d.get("https://www.flipkart.com/");
	    d.manage().window().maximize();
	   WebElement search=d.findElement(By.xpath("//input[@name='q']"));
	   search.sendKeys("Shoes"+Keys.ENTER);
	   
	   WebElement shoes=d.findElement(By.xpath("(//div[@class='_75nlfW'])/div/div[1]"));
	   shoes.click();
	   
	   Thread.sleep(8000);
	   WebElement addtocart=d.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
	   addtocart.click();
	   
	   d.quit();

	}

}
