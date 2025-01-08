package assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assingment_175_Bm_Test3_Am 
{
	
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method1");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("After Method1");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
	

	@Test
	public void Test3()
	{
		System.out.println("Test3");
	}
	
}
