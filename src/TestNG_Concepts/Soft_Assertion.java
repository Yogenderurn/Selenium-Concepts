package TestNG_Concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	
	SoftAssert obj = new SoftAssert();
	
	
	@Test
	public void testcase1()
	{
		System.out.println("===============================");
		System.out.println("Test1 Start");
		obj.assertTrue(false);
		System.out.println("Test1 End");
		System.out.println("================================");
		obj.assertAll();
	}
	
}
