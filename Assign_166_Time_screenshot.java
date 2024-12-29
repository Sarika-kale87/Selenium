package assignments;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assign_166_Time_screenshot {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		Date d1=new Date();
		
		
		String humantime= d1.toString();
		String date= humantime.substring(8,10);
		String month=humantime.substring( 4,7);
		String year=humantime.substring(24);
		String time=humantime.substring(11, 19).replace(":", "-");
		String date2=date+month+year+time;
		
		TakesScreenshot ts=d;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\kales\\eclipse-workspace\\Selenium\\ScreenShot\\one" +date2+".png" );
		FileHandler.copy(source, destination);
        d.quit();
				
		
		
		
		
		
		
		
		
	}

}
