package Maven_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBuy_pom {
	
	@FindBy(xpath="//svg[@class='at-close-icon']")
	              WebElement closed;
	
	
	@FindBy(id="ctl00_MasterHeader_ctl00_uchead_GlobalSearchUC_TxtSearchKeyword")
	WebElement Search;

	@FindBy(xpath="//i[@class='icon-search']")
	WebElement icon;
	
	@FindBy(xpath="//select[@class='margin-bottom-none select-height-four font-xxs']")
	WebElement drop;
	
@FindBy(xpath="//img[@src='https://multimedia.bbycastatic.ca/multimedia/products/150x150/122/12292/12292246.jpg']")
WebElement clickontheproduct;

@FindBy(id="btn-cart")
WebElement addtocart;

@FindBy(xpath="//a[@id='express-checkout']")
WebElement checkoutbtn;


public BestBuy_pom (WebDriver driver) 
{
PageFactory.initElements(driver, this);
}

public void dismissthepop()
{
	closed.click();
}
		

public void searchtab(String keyss )
{
	Search.sendKeys(keyss);
}


public void clickonicon()
{
	icon.click();
}

public void clickonsproduct()
{
	clickontheproduct.click();
}
	
public void clickonaddcart() {
	addtocart.click();
	
}

public void checkout()
{
	checkoutbtn.click();
}


}