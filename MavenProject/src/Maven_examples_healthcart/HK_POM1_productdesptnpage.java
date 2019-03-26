package Maven_examples_healthcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HK_POM1_productdesptnpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Product']")
	static
	WebElement mousehoverproduct;
	
	@FindBy(xpath="//a[@href='/health-food-n-drinks?navKey=CP-hfd-n-drnks&itracker=w:category|product|1|;p:4|;c:health-food-n-drinks|;']")
	WebElement mousehvrhealthanddrinks;
	
	@FindBy(xpath="//a[@href='meal-replacement?navKey=CL-4137&itracker=w:category|product|health-food-n-drinks|weight-loss-foods|3|;p:1|;c:meal-replacement|;\']")
	WebElement mousehovermealsreplacement;
	
	@FindBy(id="sortByVariants")
	WebElement filter;
	
	@FindBy(xpath="//option[@value='priceLH']")
	WebElement filterbylowtohigh;
	
	@FindBy(xpath="//a[@href='/sv/evexia-way2slim/SP-47917?navKey=VRNT-87319&itracker=w:menuLanding||;p:1|;e:87319|;']")
	WebElement mousehoveronfirstproduct;
	
	@FindBy(xpath="(//button[text()='Add to Cart'])[1]")
	WebElement addtocartbtn;
	
	@FindBy(xpath="(//button[text()='Buy Now'])[1]")
	WebElement buynowbtn;
	
	
	HK_POM1_productdesptnpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
