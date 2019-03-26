package Maven_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whatspppom {
	
	@FindBy(xpath="//input[@title='Search or start new chat']")
	WebElement search;
	
	
	
	Whatspppom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public void search1()
	{
		
		search.sendKeys("manu");
		
	}
	
}
