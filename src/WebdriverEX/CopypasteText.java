package WebdriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopypasteText {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Actions act = new Actions(driver);
		
		WebElement unm= driver.findElement(By.id("email"));
		unm.sendKeys("abcegfgh@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		
		act.click(unm)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.click(pwd)
		.keyDown(Keys.CONTROL)
		.sendKeys("v")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		
		
		
		
		
	}

}
