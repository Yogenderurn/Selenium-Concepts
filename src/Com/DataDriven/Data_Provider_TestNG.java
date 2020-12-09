package Com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_TestNG {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D://selenium//new chorme//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@DataProvider
	public void getTestData()
	{
		//TestNG_util_package_for_dataprovider.getDataFromExcel();
	}
	
	@Test
	public void login(String phone, String  pass)
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
