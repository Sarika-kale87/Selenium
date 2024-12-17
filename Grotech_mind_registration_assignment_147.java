package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotech_mind_registration_assignment_147 {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver d=new ChromeDriver();
		d.get("https://grotechminds.com/registration/");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.name("fname"));
		e1.sendKeys("Sarika");
		
		
		WebElement e2=d.findElement(By.name("lname"));
		e2.sendKeys("kale");
		
		WebElement e3=d.findElement(By.name("email"));
		e3.sendKeys("shriya@gmail.com");
		
		WebElement e4=d.findElement(By.name("password"));
		e4.sendKeys("123456");
		
		WebElement e5=d.findElement(By.name("Skills"));
		Select s1=new Select(e5);
		s1.selectByValue("select1");
		
		WebElement e6=d.findElement(By.name("Country"));
		Select s2=new Select(e6);
	    s2.selectByIndex(8);
		
	    WebElement e7=d.findElement(By.name("Present-Address"));
	    e7.sendKeys("Zurich");
	    
	    WebElement e8=d.findElement(By.name("Permanent-Address"));
	    e8.sendKeys("Pune");
	    
	    WebElement e9=d.findElement(By.name("Pincode"));
	    e9.sendKeys("8152");
	    
	    WebElement e10=d.findElement(By.name("Relegion"));
	    Select s3=new Select(e10);
	    s3.selectByValue("Hindu");
	    
	   // Thread.sleep(8000);
		WebElement e11=d.findElement(By.id("file"));
		e11.sendKeys("C:\\Users\\kales\\OneDrive\\Desktop\\grotechminds.html");

	}

}
