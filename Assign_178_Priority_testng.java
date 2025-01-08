package assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assign_178_Priority_testng
{

	@Test
	public void testcase1()
	{
		System.out.println("test1");
	}
	
	@Test(priority=3)
	public void testcase2()
	{
		System.out.println("test2");
	}
	
	@Test(priority=2)
	public void testcase3()
	{
		System.out.println("test3");
	}
	
	@Test(priority=1)
	public void testcase4()
	{
		System.out.println("test4");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("AfterMethod1");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method1");
	}
	
	
	
	
	
	
	
	
}
