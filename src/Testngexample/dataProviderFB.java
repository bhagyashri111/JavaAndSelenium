package Testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderFB {
	
	WebDriver driver = null;
	
	
	@BeforeMethod
	
	public void initBrowser() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.facebook.com");
			
	}
  
	 @Test(dataProvider = "data")
	  public void Login(String Unm, String Pwd) {
		  
		 driver.findElement(By.id("email")).sendKeys(Unm);
		 driver.findElement(By.id("pass")).sendKeys(Pwd);
		 driver.findElement(By.id("loginbutton")).click();
		 
		 driver.close();
	  }

	  @DataProvider(name="data")
	  public Object[][] Display() {
		  
	    return new Object[][] {
	    	
	      { "A1@gmail.com", "aaa" },
	      { "B2@gmail.com", "bbb" },
	      { "C3@gmail.com", "ccc" },
	    };
	    
	
	  }
}
