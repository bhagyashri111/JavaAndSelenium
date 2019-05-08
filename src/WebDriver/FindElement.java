package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement Unm = driver.findElement(By.id("email"));
		Unm.sendKeys("abc@gmail.com");
		
		
		WebElement Pwd = driver.findElement(By.id("pass"));	
		Pwd.sendKeys("test");
		
		WebElement log = driver.findElement(By.id("loginbutton"));
		log.click();
		
	
		
		
	}

}
