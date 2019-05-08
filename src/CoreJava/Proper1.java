package CoreJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Proper1 {

	public static void main(String[] args) throws IOException {
		
		Properties p1= new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\vadga\\OneDrive\\Desktop\\stud1.properties");
		p1.load(fis);
		System.out.println(p1.getProperty("Name"));
		System.out.println(p1.getProperty("Location"));
		System.out.println(p1.getProperty("course"));
	}

}
