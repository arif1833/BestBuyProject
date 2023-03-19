package lokki.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;


public class BeforeActions {
	
	@Before
	public void BeforeActions(Scenario scen){
		System.out.println(">>> Initializing Driver");
		SetupDrivers.setupDriver();
		System.out.println("Test Scenario Name :  "+ scen.getName());

}
}