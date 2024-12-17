package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_grotech_151 {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://grotechminds.com/registration/");
		d.manage().window().maximize();
		Thread.sleep(8000);
		WebElement e=	d.findElement(By.id("fname"));
		e.sendKeys("Sarika");
		Actions a1= new Actions(d);
		a1.doubleClick(e).perform();
		//e.click();
				//e.click();
				//e.sendKeys(Keys.DOWN);
				//e.sendKeys(Keys.ENTER);
		
		
		
		

	}

}
