package Maven_examples_healthcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HK_productdesptn_testcase {
	WebDriver driver;
	@BeforeSuite
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.get("https://www.healthkart.com/");
		Thread.sleep(5000);

	}

	@Test
	public void getthemealsreplacementpage()
	{
		
		Actions a = new Actions(driver);
	}
}
