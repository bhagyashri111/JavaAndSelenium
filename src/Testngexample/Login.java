package Testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	
  @Test
  public void Facebook() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.facebook.com");
		
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		driver.findElement(By.id("email")).sendKeys("aaa");
		
		
  }
}
