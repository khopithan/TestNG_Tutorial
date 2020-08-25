package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	//for parallel execution for below two methods
	
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "E:\\devops\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
	
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver", "E:\\devops\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
	}

}
