package assignments;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assign_177_bs_test3 
{

	@BeforeSuite
	public void bs1()
	{
		System.out.println("BeforeSuit1");
	}
	/*@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuit");
	}
	*/
	
	@Test
	public void test1()
	{
		System.out.println("Test case1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test case2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test case3");
	}
	
	
	
	
	
	
	
}
