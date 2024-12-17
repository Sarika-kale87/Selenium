package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_search_Relativexpath_158 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https:www.google.com");
		Thread.sleep(5000);
		WebElement e=d.findElement(By.xpath("(//textarea)[1]"));
		e.sendKeys("Selenium"+Keys.ENTER);
		

	}

}
