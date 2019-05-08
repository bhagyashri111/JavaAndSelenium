package Testngexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	WebDriver driver = null;
	
	
  @BeforeMethod
  public void Launch() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
		
  }
  
  @Test(priority = 1)
  public void Facebook() {
	  
	  driver.get("http://wwww.facebook.com");
	  
	  Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
  }
  
  @Test(priority = 2)
  public void Google() {
	  
	  driver.get("http://wwww.google.com");
	  Assert.assertEquals(driver.getTitle(), "Google");
	  
  }
  
  @AfterMethod
  
  public void close() {
	  
	  driver.close();
  }
  
}
