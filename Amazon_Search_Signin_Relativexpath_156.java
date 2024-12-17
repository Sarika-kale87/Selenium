package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_Search_Signin_Relativexpath_156 {

	public static void main(String[] args) 
	{
		EdgeDriver d= new EdgeDriver();
		d.get("https:/www.Amazon.in/");
		d.manage().window().maximize();
		
		WebElement search=d.findElement(By.xpath("(//input)[5]"));
		search.sendKeys("Mobiles");
		search.sendKeys(Keys.ENTER);
		
		WebElement signin=d.findElement(By.xpath("(//span)[17]"));
		signin.click();
		
		WebElement email=d.findElement(By.xpath("(//input)[7]"));
		email.sendKeys("Shriya@gmail.com");
		
		WebElement contin=d.findElement(By.xpath("(//span)[1]"));
		contin.click();
		
		WebElement password=d.findElement(By.xpath("(//input)[8]"));
		password.sendKeys("123456");
		
		

	}

}
