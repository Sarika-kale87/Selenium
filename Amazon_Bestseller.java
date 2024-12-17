package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Bestseller {

	public static void main(String[] args) 
	{
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.amazon.in/");
		cd.manage().window().maximize();
		//WebElement e=cd.findElement(By.partialLinkText("Sellers"));
		WebElement e=cd.findElement(By.linkText("Best Sellers"));
		//e.click();
		e.sendKeys(Keys.ENTER);

	}

}
