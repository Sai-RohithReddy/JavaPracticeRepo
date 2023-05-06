import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Rohith Reddy\\eclipse-workspace\\Java_Selenium\\src\\data.properties");
		prop.load(fis);//read mode
		System.out.println(prop.getProperty("browser"));
	
		prop.setProperty("browser", "forefox");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rohith Reddy\\eclipse-workspace\\Java_Selenium\\src\\data.properties");
		prop.store(fos, null);//write mode
		
	}

}
