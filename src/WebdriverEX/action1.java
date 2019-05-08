package WebdriverEX;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Actions act = new Actions(driver);
		
		WebElement unm= driver.findElement(By.xpath("//input[@id='email']"));
		act.moveToElement(unm).click().sendKeys("abc").build().perform();
		
		WebElement link = driver.findElement(By.linkText("Forgot account?"));
		
		//act.doubleClick(link).perform();
		
		act.contextClick(link).perform();
		
		
	}

}
