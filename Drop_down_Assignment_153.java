package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_Assignment_153 {

	public static void main(String[] args) 
	{
		
		ChromeDriver d=new ChromeDriver();
		d.get("https://grotechminds.com/registration/");
		d.manage().window().maximize();
		
		WebElement e1=d.findElement(By.name("Skills"));
		Select s1=new Select(e1);
		s1.selectByValue("select1");
		
		WebElement e2=d.findElement(By.name("Country"));
		Select s2=new Select(e2);
	    s2.selectByIndex(8);
		
	    WebElement e3=d.findElement(By.name("Relegion"));
	    Select s3=new Select(e3);
	    s3.selectByValue("Hindu");
		
		
		
	}

}
