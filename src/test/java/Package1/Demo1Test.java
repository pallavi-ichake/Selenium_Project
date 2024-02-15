package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo1Test {

	@Test
	public void setup()
	{
		  // System.setProperty("webdriver.gecko.driver","C:\\Users\\apall\\OneDrive\\Documents\\Software\\geckodriver-v0.34.0-win32"); 
		   FirefoxOptions options = new FirefoxOptions();
		   WebDriver driver = new FirefoxDriver(options);
		    driver.navigate().to("http://www.google.com/"); 
		    driver.findElement(By.name("q")).sendKeys("Pallavi");  
            System.out.println("Pallavi send for search");
	}

}
