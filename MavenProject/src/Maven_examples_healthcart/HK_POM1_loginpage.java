package Maven_examples_healthcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.baseTest;

public class HK_POM1_loginpage extends baseTest {
	
	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(name="userName")
    WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginclick;
	
	HK_POM1_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginpage(String un,String pwd)
	{
		login.sendKeys(un);
		login.sendKeys(pwd);
		loginclick.click();
	}
}
