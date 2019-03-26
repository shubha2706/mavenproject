package Maven_examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class whatsapptestcase {
	WebDriver driver;
	@BeforeSuite()
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(5000);

	}
	
	@Test
	public void search2() throws AWTException
	{
		Whatspppom wp = new Whatspppom(driver);
		Robot r = new Robot();
		wp.search1();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

}
