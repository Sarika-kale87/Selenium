package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click_151 {

	public static void main(String[] args)
	{
		ChromeDriver d= new ChromeDriver();
		d.get("https://workspace.google.com/");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(d);
		a1.contextClick(e1).perform();
		

	}

}
