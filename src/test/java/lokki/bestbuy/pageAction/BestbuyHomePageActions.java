package lokki.bestbuy.pageAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import lokki.bestbuy.pageElements.BestbuyHomePageLocators;
import lokki.utilities.SetupDrivers;

public class BestbuyHomePageActions {
	BestbuyHomePageLocators BestbuyHomePageLocatorsObj;

	
	public BestbuyHomePageActions(){
		BestbuyHomePageLocatorsObj = new BestbuyHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver,BestbuyHomePageLocatorsObj);
}
	
	public void clickTotal() throws Exception{
		BestbuyHomePageLocatorsObj.totall.click();
	Thread.sleep(3000);
	}
	
	public void menu() throws Exception{
		BestbuyHomePageLocatorsObj.txtmenu.click();
		Thread.sleep(2000);
	}
	
	}
	
