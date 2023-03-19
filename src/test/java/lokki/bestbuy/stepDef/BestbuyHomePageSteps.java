package lokki.bestbuy.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lokki.bestbuy.pageAction.BestbuyHomePageActions;

public class BestbuyHomePageSteps {
	BestbuyHomePageActions BestbuyHomePageActionsObj = new BestbuyHomePageActions();

@Given("^Open BestBuy Homepage$")
public void open_BestBuy_Homepage() throws Throwable {
	
}

@When("^Click on BestBuy Totaltechmembership$")
public void click_on_BestBuy_Totaltechmembership() throws Throwable {
	BestbuyHomePageActionsObj.clickTotal();
}

	  
@When("^Click on BestBuy Menu$")
public void click_on_BestBuy_Menu() throws Throwable {
	BestbuyHomePageActionsObj.menu();


	
	
	

}


}



