package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign_173_scrollbar {
	
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver d=new EdgeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		 
	WebElement e1=d.findElement(By.linkText("About Amazon"));
	Point p1=e1.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	
	System.out.println(x);
	System.out.println(y);
	
	JavascriptExecutor js=d;
	js.executeScript("window.scrollBy(0,4544)");
		
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-500)");
	
		
		
		
		
	}

}
