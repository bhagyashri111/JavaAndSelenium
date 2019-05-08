package WebdriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		
		WebElement src= driver.findElement(By.id("draggable"));
		
		WebElement tgt= driver.findElement(By.id("droppable"));
		
		//act.dragAndDrop(src, tgt).perform();
		
		act.dragAndDropBy(src, 200, 400).perform();
		
		
		
		if(tgt.getText().matches("Dropped!"))
		
		{
			
			System.out.println("Successfully dropped");
		}
		
		else {
			
			System.out.println("Inavalid Actions");
		}
		
		
		
		
		
	}

}
