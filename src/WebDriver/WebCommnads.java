package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCommnads {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement img = driver.findElement(By.xpath("//div[@class='_7d _6_ _76']//div[1]//div[1]//img[1]"));

		boolean s1 = img.isDisplayed();
		System.out.println(s1);
		
		System.out.println(img.isEnabled());
		
		System.out.println(img.isSelected());
		
		//============================
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl())
		;
		
		
		
	}

}
