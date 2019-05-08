package Testngexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 {
	
	
	WebDriver driver = null;
  
	  @BeforeMethod
	  public void Launch() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
			
	  }
	  
	  @Test(priority = 1)
	  public void Facebook1() {
		  
		  driver.get("http://wwww.facebook.com");
		  
		  Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	  }
	  
	  @Test(priority = 2)
	  public void Google2() {
		  
		  driver.get("http://wwww.google.com");
		  Assert.assertEquals(driver.getTitle(), "Google");
		  
	  }
	  
	  @AfterMethod
	  
	  public void close() {
		  
		  driver.close();
	  }
	  
	
}
