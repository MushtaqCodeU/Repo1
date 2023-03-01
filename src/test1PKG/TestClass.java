package test1PKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestClass {
	
	WebDriver driver;

	@Test
	public void Open() {
		
    System.setProperty("webDriver.Chrome.driver","./WebDriver/chromedriver.exe");
    
    driver= new ChromeDriver();
    
    driver.get("https://www.Google.com");
      
	}
	
	@AfterTest
	public void close() {
		driver.close();
		
	}

}
