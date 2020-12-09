package TestNG_Parameter_cocept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	
	@Test
	@Parameters({"url","phone"})
	public void Facebook(String url, String phone)
	{
		System.setProperty("webdriver.chrome.driver", "D://selenium//new chorme//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		
	}
}
