package lokki.bestbuy.pageAction;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import lokki.bestbuy.pageElements.BestbuySearchResultLocators;
import lokki.utilities.SetupDrivers;

public class BestbuySearchResultActions {
	BestbuySearchResultLocators BestbuySearchResultLocatorsObj;


	public BestbuySearchResultActions(){
		BestbuySearchResultLocatorsObj = new BestbuySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver,BestbuySearchResultLocatorsObj);
	}
    public void Addtocart() throws Exception{
	 BestbuySearchResultLocatorsObj.btnAddToCart.click();
		Thread.sleep(10000);
    }

  
	public void Cardcheck() throws Exception{
		BestbuySearchResultLocatorsObj.btnCheckCard.click();
		Thread.sleep(3000);
	}
	
  public void Brands() throws Exception{
	  BestbuySearchResultLocatorsObj.xtmbrand.click();
	  Thread.sleep(3000);
  }
  
  public void Samsung() throws Exception{
	  BestbuySearchResultLocatorsObj.ctxsamsung.click();
	  Thread.sleep(4000);
  }
	  
	  public void Offers() throws Exception{
		  BestbuySearchResultLocatorsObj.ntnoffers.click();  
		  Thread.sleep(3000);
	  }
	  
	  public void monitors() throws Exception{
		  BestbuySearchResultLocatorsObj.mtxmonitor.click(); 
		  Thread.sleep(3000);
	  }
	  
	  public void UHDDisplay() throws Exception{
		  BestbuySearchResultLocatorsObj.sxt4K.click();
		  Thread.sleep(3000);
	  }
	  
	public void newmonitor() throws Exception{
		BestbuySearchResultLocatorsObj.ntcnew.click();
		Thread.sleep(3000);
	
  }

	
}

	
		
		
	
	

