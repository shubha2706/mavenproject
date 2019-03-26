package Maven_examples;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class BestBuy_TestNG {
	WebDriver driver;
	BestBuy_pom bp = new BestBuy_pom(driver);

	@BeforeSuite
	public void launchbrowser() throws Exception

	{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			 driver = new ChromeDriver();
			driver.get("https://www.bestbuy.ca/en-CA/home.aspx");
			Thread.sleep(5000);
		}
		
	@Test(priority=1)
	public void searchproduct() throws AWTException
	{
		BestBuy_pom bp = new BestBuy_pom(driver);
		//bp.dismissthepop();

		bp.searchtab("notepad");
		bp.clickonicon();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
	//	bp.dismissthepop();
		
		
	}
		
	@Test(priority=2)
	public void filter()
	{

		Select s = new Select(driver.findElement(By.xpath("//select[@class='margin-bottom-none select-height-four font-xxs']")));
	
	s.selectByVisibleText("Price: High to Low");
	}
	
	@Test(priority=3)
	public void addtocart() throws Exception
	{
		BestBuy_pom bp = new BestBuy_pom(driver);

		bp.clickonsproduct();
		bp.clickonaddcart();
		Thread.sleep(4000);
		bp.checkout();
		
		
	}

}
