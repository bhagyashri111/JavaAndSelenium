package WebdriverEX;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	 static WebDriver driver= null;
	
	public void screen() throws IOException {
		
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-dd-hh-mm-ss");
		String time = df.format(d);
		
		
		File  src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		//*********** Screenshot*************
		
		//FileUtils.copyFile(src, new File("C:\\Users\\vadga\\OneDrive\\Desktop\\img.png"));
		
		//**********************Screenshot with time and date****************
		
		FileUtils.copyFile(src, new File("C:\\Users\\vadga\\OneDrive\\Desktop\\img " + time + ".png"));
		
		System.out.println("Done Screenshot");
	}

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vadga\\Downloads\\IMP DATA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		Screenshot s = new Screenshot();
		s.screen();
		
		
	}

}
