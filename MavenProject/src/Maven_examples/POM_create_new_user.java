package Maven_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class POM_create_new_user {
	 public static WebDriver driver;
 
	
@FindBy(xpath="//input[@name='firstname']")	
WebElement FirstName;

@FindBy(xpath="//input[@name='lastname']")	
WebElement Lastname;

@FindBy(xpath="//input[@name='reg_email__']")	
WebElement Email;

@FindBy(name="reg_email_confirmation__")
WebElement confirmpwd;

@FindBy(xpath="//input[@name='reg_passwd__']")	
WebElement Password;



@FindBy(id="day")
WebElement date;

@FindBy(id="month")
WebElement months;

@FindBy(id="year")
static
WebElement years;

@FindBy(name="sex")
WebElement gender;

@FindBy(name="websubmit")
WebElement submitbtn;

POM_create_new_user (WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void setFirstname(String FN)
{
	FirstName.sendKeys(FN);
}

public void setLastname(String LN)
{
	Lastname.sendKeys(LN);
}


public void setEmail(String EM)
{
	Email.sendKeys(EM);
}

public void confirmpassword(String passwrd)
{
	confirmpwd.sendKeys(passwrd);
}

public void setpasswors(String pd)
{
	Password.sendKeys(pd);
}

public void setDate(String day)
{
	date.sendKeys(day);
}

public void setMONTH(String month)
{
	months.sendKeys(month);
}

public void setYear(String Year)
{
	years.sendKeys(Year);
}

public void setSex()
{
	gender.click();
}
		
public void clicksubmit()
{
	submitbtn.click();
}
}
		
	/*public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Seleniumm\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		POM_create_new_user fb = new POM_create_new_user(driver);

		fb.setFirstname("subha");
		fb.setLastname("poonja");
		fb.setEmail("shubhanagarju94@gmail.com");
		fb.setpasswors("Shub@1994");
		
		Select s=new Select(driver.findElement(By.id("day")));
		s.selectByVisibleText("27");
		
		Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByVisibleText("Jun");
		
		Select s2 = new Select(driver.findElement(By.id("year")));
		s2.selectByVisibleText("1994");

		fb.setSex();
		
		
		
		
	}

}*/
