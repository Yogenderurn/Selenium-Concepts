package TestNG_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssertionConcept {
	public WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
	System.setProperty("webdriver.chrome.driver", "D://selenium//new chorme//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	}
	
	@DataProvider
	public void getTestData()
	{
		
	}
	
	@Test
	public void googleTitleTest()
	{
		String str =driver.getTitle();
		System.out.println(str);
		
		Assert.assertEquals(str, "Google");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
