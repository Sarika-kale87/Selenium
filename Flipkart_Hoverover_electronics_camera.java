package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Hoverover_electronics_camera {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https:/www.flipkart.com");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.xpath("(//span [.='Fashion'])[2]"));
		Actions a=new Actions(d);
		a.moveToElement(e1).perform();
		
		WebElement e2=d.findElement(By.partialLinkText("Women Foot"));
		a.moveToElement(e2).perform();
		//e2.click();
		
		WebElement e3=d.findElement(By.xpath("(//span[.='Electronics'])[2]"));
		Actions a1=new Actions(d);
		a1.moveToElement(e3).perform();
		
		WebElement e4=d.findElement(By.partialLinkText("Cameras & Accessories"));
		a1.moveToElement(e4).perform();
		//e4.click();
		
		//Thread.sleep(8000);
		WebElement e5=d.findElement(By.partialLinkText("Drone"));
		e5.click();
		
		
		

	}

}
