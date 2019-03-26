package Generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class baseTest implements Autoconstant {
	
public	WebDriver driver;
	static
	{
System.setProperty(CHROMEKEY, CHROMEPATH);
	}
	
	@BeforeSuite
	public void openapplication()
	{
		WebDriver driver = new ChromeDriver();
		driver.get(library.getpropertyvalue("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("URL"));
		
		
	}
			
	
		
		
}


