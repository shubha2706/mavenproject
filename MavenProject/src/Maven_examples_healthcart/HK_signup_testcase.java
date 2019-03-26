package Maven_examples_healthcart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.baseTest;

public class HK_signup_testcase extends baseTest {
	/*SoftAssert sa = new SoftAssert();
	WebDriver driver;
	HK_POM1_signuppage pom1;
	Robot r;
	
	@BeforeSuite
	public void launchbrowser() throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.get("https://www.healthkart.com/");
		Thread.sleep(5000);
	}*/
	
	HK_POM1_signuppage pom1;
	WebDriver driver;
	

	
	
	
	
	
	@Test()
	public void cxsignup() throws Exception
	{
		HK_POM1_signuppage pom1 = new HK_POM1_signuppage(driver);
		Robot r = new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		Actions a = new Actions(driver);
		WebElement signupbtn = driver.findElement(By.linkText("Signup"));
		boolean flag = signupbtn.isEnabled();
		System.out.println(flag);
		a.moveToElement(signupbtn).click().build().perform();
		pom1.ucn("9743296822");
		pom1.uncheckthebox();
		Thread.sleep(4000);
		pom1.submitt();
		

		}
	
	@Test(enabled=false)
	public void signup_withgoogle() throws Exception {
	//	HK_POM1_signuppage pom1 = new HK_POM1_signuppage(driver);
		Robot r = new Robot();
		Thread.sleep(10000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		Actions action = new Actions(driver);
		WebElement signupbtn = driver.findElement(By.linkText("Signup"));
		boolean flag = signupbtn.isEnabled();
		System.out.println(flag);
		action.moveToElement(signupbtn).click().build().perform();
		pom1.signuppluss();
		
	}
	
	@Test(enabled=false)
	public void signup_withfb() throws Exception
	{
//	HK_POM1_signuppage pom1 = new HK_POM1_signuppage(driver);
		Robot r = new Robot();
		Thread.sleep(10000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		Actions action = new Actions(driver);
		WebElement signupbtn = driver.findElement(By.linkText("Signup"));
		boolean flag = signupbtn.isEnabled();
		System.out.println(flag);
		action.moveToElement(signupbtn).click().build().perform();
		Thread.sleep(5000);
		pom1.facebook();
		driver.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=1472859052935932&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.11%2Fdialog%2Foauth%3Fchannel%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter%252Fr%252Fj-GHT1gpo6-.js%253Fversion%253D43%2523cb%253Df29a316010bec2c%2526domain%253Dwww.healthkart.com%2526origin%253Dhttps%25253A%25252F%25252Fwww.healthkart.com%25252Ff1573be505a1b6c%2526relation%253Dopener%26redirect_uri%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter%252Fr%252Fj-GHT1gpo6-.js%253Fversion%253D43%2523cb%253Df13d04ec60e50c4%2526domain%253Dwww.healthkart.com%2526origin%253Dhttps%25253A%25252F%25252Fwww.healthkart.com%25252Ff1573be505a1b6c%2526relation%253Dopener%2526frame%253Df3af6ba47b8e44%26display%3Dpopup%26scope%3Dpublic_profile%252Cemail%26response_type%3Dtoken%252Csigned_request%26domain%3Dwww.healthkart.com%26return_scopes%3Dtrue%26auth_type%3Drerequest%26origin%3D1%26client_id%3D1472859052935932%26ret%3Dlogin%26sdk%3Djoey%26fallback_redirect_uri%3Dhttps%253A%252F%252Fwww.healthkart.com%252F%26logger_id%3Df7b1562e-6717-7aac-1648-3d290482d1d8&cancel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2Fj-GHT1gpo6-.js%3Fversion%3D43%23cb%3Df13d04ec60e50c4%26domain%3Dwww.healthkart.com%26origin%3Dhttps%253A%252F%252Fwww.healthkart.com%252Ff1573be505a1b6c%26relation%3Dopener%26frame%3Df3af6ba47b8e44%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26e2e%3D%257B%257D&display=popup&locale=en_GB&logger_id=f7b1562e-6717-7aac-1648-3d290482d1d8");
		pom1.fbloginun("shubhanagaraju94@gmail.com");
		pom1.fbloginpass("shubha");
		pom1.fbloginclick();

		
	}
}


