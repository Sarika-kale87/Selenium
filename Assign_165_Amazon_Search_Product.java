package assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import package1.Private_Class;

public class Assign_165_Amazon_Search_Product {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver d = new EdgeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();

		WebElement search = d.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes" + Keys.ENTER);

		WebElement shoes = d.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"));
		shoes.click();

		Set<String> s = d.getWindowHandles();
		Iterator<String> i = s.iterator();
		String Parentid=i.next();
		String Childid=i.next();
		//System.out.println(Parentid);
	//	System.out.println(Childid);
		
		d.switchTo().window(Childid);
		
		Thread.sleep(5000);
		
		WebElement addtocart=d.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
		addtocart.click();
		
		WebElement proceedtocheckout=d.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
		proceedtocheckout.click();
		
		WebElement email=d.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys(Private_Class.email);
		
		WebElement conti=d.findElement(By.xpath("//span[@id='continue']"));
		conti.click();
		
	
		
	}

}
