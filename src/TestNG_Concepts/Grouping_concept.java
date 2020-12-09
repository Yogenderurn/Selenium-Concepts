package TestNG_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping_concept {
	
public WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "D://selenium//new chorme//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test(priority=1, groups="Test")
	public void Test1()
	{
		System.out.println("Test case = 1");
	}
	@Test(priority=2, groups="Test")
	public void Test2()
	{
		System.out.println("Test case = 2");
	}
	@Test(priority=3, groups="Testing")
	public void Test3()
	{
		System.out.println("Test case = 3");	
	}
	@Test(priority=4, groups="Test")
	public void Test4()
	{
		System.out.println("Test case = 4");	
	}
	@Test(priority=5, groups="Testing")
	public void Test5()
	{
		System.out.println("Test case = 5");
	}
	
	
	@AfterTest
	public void Teardown()
	{
		driver.close();
	}
}
