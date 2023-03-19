package lokki.bestbuy.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestbuyHomePageLocators {
	

	//My Bestbuy addtocart
	@FindBy(xpath="//a[contains(text(),'Totaltech Membership')]")
	public WebElement totall ;
	
		
		//Click On Check Card
			@FindBy(xpath="//button[normalize-space()='Menu']//*[name()='svg']")
			public WebElement txtmenu ;
			
}
