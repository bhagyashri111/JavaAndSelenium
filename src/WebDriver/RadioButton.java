package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		List <WebElement> gender =driver.findElements(By.name("sex"));
		
		int  cnt = gender.size();
		
		System.out.println(cnt);
		
		//==============================
		
		
//		for(int i = 0; i< cnt;i++) {
//			
//			gender.get(i).click();
//			
//			Thread.sleep(1000);
//		}
		
		//===================================
		
		for(WebElement i:gender) {         //F,M
		
			if(!i.isSelected()) {
				
				i.click();
				Thread.sleep(500);
				
				
			}
			
		}
	
		
		driver.close();
	
	
	}

}
