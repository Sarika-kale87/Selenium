package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_select_Class_nonStaticMethods {

	public static void main(String[] args)
	{

		ChromeDriver d=new ChromeDriver();
		d.get("https://grotechminds.com/dropdown/");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.id("Choice1"));
		Select s1=new Select(e1);
		s1.selectByIndex(2);
	    
		WebElement e2=d.findElement(By.id("Choice2"));
		Select s2=new Select(e2);
		s2.selectByContainsVisibleText("practice2");
		
		WebElement e3=d.findElement(By.id("Choice3"));
		Select s3=new Select(e3);
		s3.selectByValue("Power4");
		

	}

}
