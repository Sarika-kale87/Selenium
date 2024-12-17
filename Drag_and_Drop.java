package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://grotechminds.com/drag-and-drop/");
		d.manage().window().maximize();
		 WebElement e= d.findElement(By.id("drag7"));
         WebElement e1=d.findElement(By.id("div2"));
          Actions a=new Actions(d);
          Thread.sleep(3000);
         a.dragAndDrop(e, e1).perform();
         }

}
