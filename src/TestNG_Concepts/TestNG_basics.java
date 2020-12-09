package TestNG_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_basics {
	public WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "D://selenium//new chorme//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test(priority=1)
	public void GoogleTitle()
	{
		String title = driver.getTitle();
		System.out.println("Your URL is" + title);
	}
	@Test(priority=2)
	public void GooglelogoTest()
	{
		boolean  b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=3)
	public void Test1()
	{
		System.out.println("Test is test case one");
	}
	@Test(priority=4)
	public void Test2()
	{
		System.out.println("Test is test case Two");
	}
	
	
	@AfterTest
	public void Teardown()
	{
		driver.close();
	}
	
}
