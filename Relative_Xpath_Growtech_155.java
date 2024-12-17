package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Relative_Xpath_Growtech_155 {

	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("file:///C:/Users/kales/OneDrive/Desktop/grotechminds.html");
		d.manage().window().maximize();
		WebElement UN= d.findElement(By.xpath("//input[1]"));
		UN.sendKeys("S_G_K");
		
		WebElement Hint= d.findElement(By.xpath("(//input)[2]"));
		Hint.sendKeys("Sa");
		
		WebElement password= d.findElement(By.xpath("(//input)[3]"));
		password.sendKeys("123456");
		
		WebElement Firstname=d.findElement(By.xpath("(//input)[4]"));
		Firstname.sendKeys("Sarika");
		
		WebElement Submit=d.findElement(By.xpath("(//input)[6]"));
		//Submit.click();
		
        WebElement Boy=d.findElement(By.xpath("(//input)[7]"));
        Boy.click();
        
        WebElement Girl=d.findElement(By.xpath("(//input)[8]"));
        Girl.click();
        
        WebElement Baby=d.findElement(By.xpath("(//input)[9]"));
        Baby.click();
        
        WebElement Sub=d.findElement(By.xpath("(//input)[10]"));
        Sub.click();
        
        WebElement male=d.findElement(By.xpath("(//input)[11]"));
        male.click();
        
        WebElement female=d.findElement(By.xpath("(//input)[12]"));
        female.click();
        
        WebElement locate=d.findElement(By.xpath("(//input)[13]"));
        locate.click();
        
        WebElement link=d.findElement(By.linkText("Click to know about us"));
        link.click();
        
        WebElement Relegion=d.findElement(By.id("Relegion"));
        Select s=new Select(Relegion);
        s.selectByValue("1");
        
        WebElement signup=d.findElement(By.xpath("(//input)[14]"));
        signup.click();
	}

}
