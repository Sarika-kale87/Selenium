package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_customer {

	public static void main(String[] args)
	{
		
		ChromeDriver d= new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
	//WebElement e= d.findElement(By.linkText("Customer Service"));
	WebElement e1=d.findElement(By.partialLinkText("Service"));
		
		e1.click();		
		
		
	}

	
	}



