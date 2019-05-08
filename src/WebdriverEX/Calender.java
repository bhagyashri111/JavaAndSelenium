package WebdriverEX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.id("txtJourneyDate")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/a[1]"));
		
		List<WebElement> days= driver.findElements(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr/td"));
		System.out.println(days.size());
		
		for(int i =0;i <days.size();i ++) {
			
			String txt = days.get(i).getText();	
			System.out.println(txt);
			
			if(txt.contentEquals("20")) {
				
				days.get(i).click();
				break;
			}
		}
		
	}

}
