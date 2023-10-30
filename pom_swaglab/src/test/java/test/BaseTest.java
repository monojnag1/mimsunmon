package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {
	
	static WebDriver driver;
	
	@BeforeSuite
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/monojnag/Downloads/chromedriver");
	    driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
