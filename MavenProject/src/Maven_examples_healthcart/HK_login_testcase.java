package Maven_examples_healthcart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Generic.baseTest;

public class HK_login_testcase extends baseTest {
WebDriver driver;
HK_POM1_loginpage lp;

@BeforeSuite
public void launchbrowser() throws InterruptedException, Exception
{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
	 driver = new ChromeDriver();
	driver.get("https://www.healthkart.com/");
	Thread.sleep(5000);
}





	@Test
	public void validatelogintoacc() throws Exception
	
	{
		HK_POM1_loginpage lp= new HK_POM1_loginpage(driver);
		Robot r = new Robot();
		Thread.sleep(8000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Login"))).click().build().perform();
		driver.findElement(By.name("userName")).sendKeys("9743296822");
		driver.findElement(By.name("password")).sendKeys("shub1994");
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	    Thread.sleep(5000);
	    String text = driver.findElement(By.xpath("(//span[@class='header-icons-text float-l'])[7]")).getText();
	    
Assert.assertEquals("Hi User", text);		
	}
	
}
