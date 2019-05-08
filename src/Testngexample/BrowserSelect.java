package Testngexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserSelect {
	
	WebDriver driver = null;
	
	@Parameters({"browser","URL"})
	
  @Test
  public void Launch(String browser, String URL) {
	  
	  switch(browser) 
	  
	  {
	  case "chrome":
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  break;
	  
	  case "Firefox":
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  break;
	  case "IE":
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new InternetExplorerDriver();
		  break;
	  }
	  
	  driver.get(URL);
  }
}
