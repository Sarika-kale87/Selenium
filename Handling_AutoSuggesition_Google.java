package Selenium1.Handling_Autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_AutoSuggesition_Google {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		
		d.manage().window().maximize();
		Thread.sleep(4000);
		WebElement e1=d.findElement(By.name("q"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> e2=d.findElements(By.xpath("(//div[@class='OBMEnb'])/ul/li"));
		
		int count =e2.size();
		System.out.println(count);
		e2.get(2).click();
		
		//d.quit();
		
	}

}
