package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Framework1{
	public static void main(String args[]) throws IOException {
		File file = new File("config//Employee.properties");
	 Properties prop = new Properties();
	 FileInputStream input = new FileInputStream(file);
	 prop.load(input);
	 System.out.println(prop.getProperty("name"));
	}
 
}