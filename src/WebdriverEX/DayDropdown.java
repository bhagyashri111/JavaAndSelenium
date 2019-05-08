package WebdriverEX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s1 = new Select(day);
		
		//s1.selectByIndex(8);
		//s1.selectByValue("5");
		//s1.selectByVisibleText("day");
		
		System.out.println(day.getAttribute("value"));
		
		List <WebElement> dd = s1.getOptions();
		System.out.println(dd.size());
		
		for(int i= 0; i < dd.size();i++) {
			
			String txt = dd.get(i).getText();
			System.out.println(txt);
			
			dd.get(i).click();
			Thread.sleep(1000);
			
		}
		
		
		

	}

}
