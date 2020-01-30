package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest1 {
	
	@Test
	public void sampleTest1() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tvlicensing.co.uk");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
