package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HoverOver {

	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https:/www.Amazon.in");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a=new Actions(d);
		a.moveToElement(e1).perform();
		WebElement e2=d.findElement(By.xpath("//span[.='Sign in']"));
		a.moveToElement(e2).perform();
		e2.click();
		
		
		
		
		
		
		
		
		
	}

}
