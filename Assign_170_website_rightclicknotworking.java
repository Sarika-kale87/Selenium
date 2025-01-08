package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_170_website_rightclicknotworking {

	public static void main(String[] args)
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		d.manage().window().maximize();
		
	WebElement continuetologin=	d.findElement(By.linkText("CONTINUE TO LOGIN"));
	continuetologin.click();
	WebElement un=d.findElement(By.id("username"));
	un.sendKeys("sarika");
	WebElement pw=d.findElement(By.id("label2"));
	pw.sendKeys("1234");

	}

}
