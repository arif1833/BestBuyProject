package lokki.bestbuy.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestbuySearchResultLocators {
	

	//Click Add to cart
	@FindBy(xpath="//body/main[1]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement btnAddToCart ;

	
	//Click On Check Card
		@FindBy(xpath="//a[contains(text(),'Check card balance')]")
		public WebElement btnCheckCard ;
		

	//Click On Check Card
		@FindBy(xpath="//button[normalize-space()='Brands']")
		public WebElement xtmbrand ;
				

	 //Click On Check Card
		@FindBy(xpath="//a[normalize-space()='Samsung']")
		public WebElement ctxsamsung ;
					

		//Click On Check Card
			@FindBy(xpath="//a[normalize-space()='Offers']")
			public WebElement ntnoffers ;
						

		//Click On Check Card
		@FindBy(xpath="//a[normalize-space()='Monitors']")
			public WebElement mtxmonitor ;
		
		
		
				
		@FindBy(xpath="//a[contains(text(),'4K UHD Display')]")
			public WebElement sxt4K ;
		
		
		@FindBy(xpath="//input[@id='condition_facet-New-0']")
			public WebElement ntcnew ;
				
		
		
				
				
}
