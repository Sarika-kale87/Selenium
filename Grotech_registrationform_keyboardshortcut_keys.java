package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech_registrationform_keyboardshortcut_keys {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://grotechminds.com/registration/");
		d.manage().window().maximize();
        WebElement e= d.findElement(By.name("fname"));
        e.sendKeys("Sarika");
        e.sendKeys(Keys.CONTROL+"a");
        e.sendKeys(Keys.CONTROL+"c");
        WebElement e1=d.findElement(By.name("lname"));
        Thread.sleep(2000);
        e1.sendKeys(Keys.CONTROL+"v");
	}

}
