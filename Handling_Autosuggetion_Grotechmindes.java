package Selenium1.Handling_Autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_Autosuggetion_Grotechmindes {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.grotechminds.com/blogs");
		d.manage().window().maximize();
		
		WebElement Search= d.findElement(By.xpath("(//input[@class='orig'])"));
		Search.sendKeys("Selenium");
		
		Thread.sleep(8000);
		
		//List<WebElement> e1=d.findElements(By.xpath("(//div[@class='results'])/div/div")); wrong xpath
		
		List<WebElement> e1=d.findElements(By.xpath("(//div[@class='results'])[2]/div/div")); //right xpath
		
		
		System.out.println(e1.size());
		//e1.get(3).click();
		
		Thread.sleep(2000);
		
		d.quit();
		

	}

}
