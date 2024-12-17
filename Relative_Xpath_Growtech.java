package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Relative_Xpath_Growtech {

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

	}

}
