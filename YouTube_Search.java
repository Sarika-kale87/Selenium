package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube_Search {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://Youtube.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement e1= d.findElement(By.name("search_query"));
		
		e1.sendKeys("Grotechminds"+Keys.ENTER);
		
		

	}

}
