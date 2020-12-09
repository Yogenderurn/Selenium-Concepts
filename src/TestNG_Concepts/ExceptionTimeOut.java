package TestNG_Concepts;

import org.testng.annotations.Test;

public class ExceptionTimeOut {
	
	@Test(timeOut=2000)
	public void infinitLooP()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
}
