package TestNG_Concepts;

import org.testng.annotations.Test;

public class dependsOnMehode {
	@Test()
	public void LoginPage()
	{
		System.out.println("Test Login page = ");
		int i=9/0;
	}
	@Test(dependsOnMethods ="LoginPage")//if login test case fail that means Homepage skiped
	public void Homepage()
	{
		System.out.println("Test case = 3");	
	}
}
