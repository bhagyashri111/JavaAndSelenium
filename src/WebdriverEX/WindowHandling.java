package WebdriverEX;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		String mainWin = driver.getWindowHandle();
		
		System.out.println(mainWin);
		
		driver.findElement(By.linkText("Data Policy")).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(mainWin);
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Cookies Policy")).click();
		Thread.sleep(1000);
		
		Set <String> chwin = driver.getWindowHandles();
		
		System.out.println(chwin);
		
		System.out.println(chwin.size());
		
		//=========================
		
		for( String i:chwin)                 //c1,c2,p
		{
			if(!i.equals(mainWin))
				
			{
				
				driver.switchTo().window(i);
				
				System.out.println(driver.getTitle());
				System.out.println(driver.getWindowHandle());
				Thread.sleep(1000);
				
				driver.switchTo().window(mainWin);
				System.out.println(driver.getTitle());
				System.out.println(driver.getWindowHandle());
			}
			
		}
		
	}

}
