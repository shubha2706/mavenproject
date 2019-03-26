package Maven_examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class create_user_FB_Testng {
	WebDriver driver;
	@BeforeSuite
	public void launchbrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void enter_details()
	{
		POM_create_new_user fb = new POM_create_new_user(driver);
		fb.setFirstname("sobha");
		fb.setLastname("poonja");
		fb.setEmail("shubhanagaraju94@gmail.com");
		fb.confirmpassword("shubhanagaraju94@gmail.com");
		fb.setpasswors("Shub@1994");
		
		Select s=new Select(driver.findElement(By.id("day")));
		s.selectByVisibleText("27");
		
		Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByVisibleText("Jun");
		
		Select s2 = new Select(driver.findElement(By.id("year")));
		s2.selectByVisibleText("1994");
		
		fb.setSex();
		fb.clicksubmit();
		
		//Actions action = new Actions(driver);
     //   action.sendKeys(Keys.ESCAPE).build().perform();
		
	}
	
	@Test(priority=2,enabled=true)
	public void avoid_popup() throws AWTException, Exception
	{
		
		//Actions action = new Actions(driver);
       // action.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		
	}
	
	
	
	
@Test(enabled=false)
public void popup()
{
	
	try {
		driver.switchTo().alert().accept();
	}
	
	catch(NoAlertPresentException e)
	{
		System.out.println(e);
	}
	
}
	
	
	
	

}
