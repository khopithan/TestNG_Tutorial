package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
	// Aim - open the chrome and go to
	// 1. google.com   2. yahoo.com   3. bing.com   then close the browser

	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	
	@BeforeSuite
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\devops\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void openGoogle() {
		startTime = System.currentTimeMillis();
		
		driver.get("http://www.google.com");
		
		
	}
	
	@Test
	public void openYahoo() {
		
		driver.get("http://www.yahoo.com");
		
	}
	
	@Test
	public void openBing() {
		
		driver.get("http://www.bing.com");
		
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
		
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println("total Time is " + totalTime);
	}
	
}
