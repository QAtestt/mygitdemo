package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
/**
 * @author Muthuraman
 *
 */
public class PFHomePage extends PFChangWrappers{

	public PFHomePage() {
		if(!verifyTitle("Asian Cuisine & Chinese Food Restaurant | P.F. Chang's"));
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	
	public PFCreateAccount clickRegister() {
		clickByXpath(prop.getProperty("Home.Register.XPath"));
		return new PFCreateAccount();
	
	}
	public PFCreateAccount clicklogin() {
		clickByXpath(prop.getProperty("Login.login.xpath"));
		return new PFCreateAccount();
	}
	
}