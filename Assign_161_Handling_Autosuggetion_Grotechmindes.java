package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign_161_Handling_Autosuggetion_Grotechmindes {

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver d=new EdgeDriver();
		d.get("https://www.grotechminds.com/blogs");
		d.manage().window().maximize();
		
		WebElement Search= d.findElement(By.xpath("(//input[@class='orig'])"));
		Search.sendKeys("Selenium");
		Search.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		//List<WebElement> e1=d.findElements(By.xpath("(//div[@class='results'])/div/div")); wrong xpath
		
		List<WebElement> e1=d.findElements(By.xpath("(//div[@class='results'])[2]/div/div")); //right xpath
		
		//List<WebElement> e1=d.findElements(By.xpath("(//div[@class='elementor-post__thumbnail'])[4]/div/div"));//trial
		//System.out.println(e1.size());
		//Thread.sleep(8000);
		
		e1.get(3).click();
		
		//Thread.sleep(2000);
		
		d.quit();
		

	}

}
