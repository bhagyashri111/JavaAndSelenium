package WebdriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
		Thread.sleep(1000);
		
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		
		if(txt.equalsIgnoreCase("Please select start place."))
		{
			driver.switchTo().alert().accept();
		}
		
		else
			System.out.println("Invalid alert");
		
			driver.close();
		
	}

}
