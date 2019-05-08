package WebdriverEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.NANOSECONDS);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass123"));
		pwd.sendKeys("test");
		
		WebElement log = driver.findElement(By.id("loginbutton"));
		log.click();
	}

}
