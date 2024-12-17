package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Absolute_xpath_Growtech_154 {

	public static void main(String[] args) 
	{
		ChromeDriver d= new ChromeDriver();
		d.get("file:///C:/Users/kales/OneDrive/Desktop/grotechminds.html");
		d.manage().window().maximize();
		WebElement UN =d.findElement(By.xpath("(/html/body/input)[1]"));
		UN.sendKeys("Sarika_Kale");
		WebElement Hint =d.findElement(By.xpath("(/html/body/input)[2]"));
		Hint.sendKeys("Sha");
		WebElement password =d.findElement(By.xpath("(/html/body/input)[3]"));
		password.sendKeys("301627");
		WebElement firstname =d.findElement(By.xpath("((/html/body/form)[1]/input)"));
		firstname.sendKeys("Shriya");
		//WebElement submit =d.findElement(By.xpath("((/html/body/form[1])/input[3])"));
		//submit.click();
		WebElement checkbox1=d.findElement(By.xpath("((html/body/form)[2]/input[1])"));
		checkbox1.click();
		WebElement checkbox2=d.findElement(By.xpath("((html/body/form)[2]/input[2])"));
		checkbox2.click();
		WebElement checkbox3=d.findElement(By.xpath("((html/body/form)[2]/input[3])"));
		checkbox3.click();
		//WebElement Submit2=d.findElement(By.xpath("((html/body/form[2])/input[4])"));
		//Submit2.click();
		WebElement Male=d.findElement(By.xpath("(html/body/input[4])"));
		Male.click();
		WebElement feMale=d.findElement(By.xpath("(html/body/input[5])"));
		feMale.click();
		WebElement location=d.findElement(By.xpath("html/body/input[6]"));
		location.click();
		
		//WebElement Link=d.findElement(By.partialLinkText("Click to know"));
		//Link.click();
		
		WebElement Dropdn=d.findElement(By.id("Relegion"));
		
		Select s=new Select(Dropdn);
		s.selectByContainsVisibleText("Relegion 3");
		
		WebElement SignUp=d.findElement(By.xpath("html/body/input[7]"));
		SignUp.click();
		
		

	}

}
