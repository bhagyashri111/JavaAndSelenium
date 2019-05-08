package WebdriverEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebDriverWait w = new WebDriverWait(driver, 20);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		//w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("pass123")));
		
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("test");
		
		
		WebElement log = driver.findElement(By.id("loginbutton"));
		w.until(ExpectedConditions.numberOfElementsToBe(By.id("loginbutton"),3));
		log.click();
	}

}
