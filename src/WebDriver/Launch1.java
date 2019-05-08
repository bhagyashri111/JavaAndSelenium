package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch1 {

	public static void main(String[] args) {
		
		// Open Chrome Browser
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		// Open firefox browser
		
		//System.setProperty("C:\\Users\\vadga\\Downloads\\IMP DATA\\geckodriver-v0.24.0-win64\\geckodriver.exe", null);
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.firefox.com");
		
		
		
		
	}

}
