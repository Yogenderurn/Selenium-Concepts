package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T1_Launch_browser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D://selenium//new chorme//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/login/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9319626876");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Yogi");
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	
	System.out.print("Test Passed");
	System.out.print("This is the change file");
	}
}
