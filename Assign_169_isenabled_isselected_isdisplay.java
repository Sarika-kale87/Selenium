package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_169_isenabled_isselected_isdisplay {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kales/OneDrive/Desktop/grotechminds.html");
		driver.manage().window().maximize();
	
		WebElement firstname = driver.findElement(By.name("fname"));
		if(firstname.isDisplayed() ==true && firstname.isEnabled()==true)
        {
			System.out.println("WebElement firstname is enabled and displayed " +firstname.isDisplayed()+" "+firstname.isEnabled());
			firstname.sendKeys("Sarika");	
		}
		else
		{
			System.out.println("WebElement firstname is disabled " + firstname.isDisplayed()+firstname.isEnabled());
			
		}
		WebElement lastname = driver.findElement(By.id("121"));
		if(lastname.isDisplayed() ==true && lastname.isEnabled()==true)
		{
			System.out.println("WebElement lastname is enabled and displayed " +lastname.isDisplayed()+"  "+ lastname.isEnabled());
		}
		else
		{
			System.out.println("WebElement lastname is disabled " + lastname.isDisplayed()+lastname.isEnabled());
		}
		
		WebElement boy = driver.findElement(By.xpath("//input[@id='123']"));
		             boolean b  = boy.isSelected();
		             System.out.println(b);
		             if(b==false)
		             {
		            	 boy.click();
		             }
		
		
		
		
		
	}
}