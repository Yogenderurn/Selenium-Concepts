package TestNG_Concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion {
	
	@Test
	public void testcase1()
	{
		System.out.println("===============================");
		System.out.println("Test1 Start");
		Assert.assertTrue(false);
		System.out.println("Test1 End");
		System.out.println("================================");
	}
	@Test
	public void testcase2()
	{
		System.out.println("===============================");
		System.out.println("Test2 Start");
		Assert.assertTrue(true);
		System.out.println("Test2 End");
		System.out.println("================================");
	}
	@Test
	public void testcase3()
	{
		System.out.println("===============================");
		System.out.println("Test3 Start");
		Assert.assertTrue(false);
		System.out.println("Test3 End");
		System.out.println("================================");
	}
	@Test
	public void testcase4()
	{
		System.out.println("===============================");
		System.out.println("Test4 Start");
		Assert.assertTrue(true);
		System.out.println("Test4 End");
		System.out.println("================================");
	}
	@Test
	public void testcase5()
	{
		System.out.println("===============================");
		System.out.println("Test5 Start");
		Assert.assertTrue(false);
		System.out.println("Test5 End");
		System.out.println("================================");
	}
}