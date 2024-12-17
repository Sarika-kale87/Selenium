package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_dropdown_keysArrow_148 {

	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://grotechminds.com/registration/");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.className("Skills"));
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.click();		
       
		
	}

}
