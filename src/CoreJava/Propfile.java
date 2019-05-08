package CoreJava;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propfile {

	public static void main(String[] args) throws IOException {
		
		Properties p1= new Properties();
		
		
		
		
		FileInputStream fis= new FileInputStream("C:/Bhagya/stud.properties");
		
		
	
		p1.load(fis);
		System.out.println(p1.getProperty("name"));
		System.out.println(p1.getProperty("Location"));
		System.out.println(p1.getProperty("course"));
		System.out.println(p1.getProperty("time"));
		
	}

}
