package lokki.bestbuy.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lokki.bestbuy.pageAction.BestbuySearchResultActions;

public class BestbuySearchResultSteps {
	BestbuySearchResultActions BestbuySearchResultActionsObj = new BestbuySearchResultActions();



@Then("^Add to shopping cart$")
public void add_to_shopping_cart() throws Throwable {
	BestbuySearchResultActionsObj.Addtocart();
}
	

@Then("^Click on Brands$")
public void click_on_Brands() throws Throwable {
	BestbuySearchResultActionsObj.Brands();
}

@Then("^Click on Samsung$")
public void click_on_Samsung() throws Throwable {
	BestbuySearchResultActionsObj.Samsung(); 
}

@Then("^Click on Offers$")
public void click_on_Offers() throws Throwable {
	BestbuySearchResultActionsObj.Offers();
}

@Then("^Click on Monitors$")
public void click_on_Monitors() throws Throwable {
	BestbuySearchResultActionsObj.monitors();
}

@Then("^Click on Samsung S(\\d+)C series (\\d+)\"$")
public void click_on_Samsung_S_C_series(int arg1, int arg2) throws Throwable {
	BestbuySearchResultActionsObj.UHDDisplay();
}

@Then("^Click on New$")
public void click_on_New() throws Throwable {
	BestbuySearchResultActionsObj.newmonitor(); 
}



	
	}


		
	
