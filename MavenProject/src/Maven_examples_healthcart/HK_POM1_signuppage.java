package Maven_examples_healthcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.baseTest;

public class HK_POM1_signuppage extends baseTest {
	static WebDriver driver;
	
	@FindBy(linkText="Signup")
	WebElement usersignup;
	
	@FindBy(id="contactNumber")
	WebElement usercn;
	
	@FindBy(className="checboximg")
	WebElement checkbox;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement submitsignup;
	
	@FindBy(xpath="(//div[@class='customGPlusSignIn'])[1]")
	WebElement signupplus;
	
	@FindBy(xpath="(//span[@class='fb'])[1]")
	WebElement fb;
	
	@FindBy(name="email")
	WebElement email1;
	
	@FindBy(name="pass")
	WebElement pass1;
	
	@FindBy(name="login")
	WebElement loginfb;
	
	HK_POM1_signuppage ( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonsignup() 
	
	{
		usersignup.click();
	}
	
	public void ucn(String phonenumber)
	{
		usercn.sendKeys(phonenumber);
	}
	
	public void uncheckthebox()
	{
		checkbox.click();
	}
	
	public void submitt()
	{
		submitsignup.click();
	}
	

	public void signuppluss()
	{
		signupplus.click();
	}
	
	public void facebook()
	{
		fb.click();
	}
	
	public void fbloginun(String username)
	{
		email1.sendKeys(username);
		
	}
	
	public void fbloginpass(String password)
	{
		pass1.sendKeys(password);

	}
	
	public void fbloginclick()
	{
		loginfb.click();

	}
}
