package Maven_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orange_POM_page {
	

	

		
		static WebDriver driver;
		
		@FindBy(id="txtUsername")
		WebElement untb;

		@FindBy(id="txtPassword")
		WebElement pwd;
		
		@FindBy(id="btnLogin")
		WebElement btn;
		
		orange_POM_page (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void setusername1()
		{
			untb.sendKeys("Admin");
		}
		
		public void setpassword1()
		{
			pwd.sendKeys("admin123");
		}
		
		public void clickbtn()
		{
			btn.click();
		}
	
	

}
