package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_160_Java_Script_popup {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver d= new ChromeDriver();
		d.get("https://grotechminds.com/javascript-popup/");
		
		WebElement e1=d.findElement(By.xpath("(//button[@class='btnjs'])"));
		e1.click();
		Thread.sleep(20000);
		d.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
	}

}
