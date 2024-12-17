package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip_kart_search_mobiles_146 {

	public static void main(String[] args) {
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.flipkart.in");
		d.manage().window().maximize();
		WebElement e1= d.findElement(By.name("q"));
		e1.sendKeys("Mobiles"+Keys.ENTER);

	}

}
