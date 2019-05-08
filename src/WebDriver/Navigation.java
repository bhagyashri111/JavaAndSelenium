package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.google.com");
		WebElement img = driver.findElement(By.linkText("Images"));
		img.click();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(500);
		
		driver.navigate().forward();
		Thread.sleep(500);
		
		driver.navigate().refresh();
		
		
	}

}
