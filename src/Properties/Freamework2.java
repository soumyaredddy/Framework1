package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Freamework2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		// TODO Auto-generated method stub
          File  file = new File("config//browser.properties");
          Properties prop = new Properties();
          FileInputStream filein = new FileInputStream(file);
          prop.load(filein);
          String browsername=prop.getProperty("browser");
          if (browsername.equals("chrome")) {
        	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        	  driver = new ChromeDriver();
          }
          else if(browsername.equals("Firefox")) {
        	  System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
        	   driver = new FirefoxDriver();
        	  
          }
          driver.get(prop.getProperty("url"));
          
          driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abs@gmail.com");
	}

}
