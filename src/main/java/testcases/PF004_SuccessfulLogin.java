
package testcases;

import org.testng.annotations.Test;


import pages.PFHomePage;
import pages.PFCreateAccount;
import wrappers.PFChangWrappers;

import org.testng.annotations.BeforeClass;

public class PF004_SuccessfulLogin extends PFChangWrappers{
	@Test(dataProvider="fetchData")
	public void login(String emailaddress, String passWord) throws InterruptedException {
		new PFCreateAccount()
		.clicklogin()
		.enterEmailaddresslogin(emailaddress)
		.enterPasswordlogin(passWord)
		.clickloginSubmit();
			}
@BeforeClass
	public void beforeClass() {
		dataSheetName="PF004";
		browserName="chrome";
		testCaseName="Login User with Valid data";
		testDescription="User login using POM";
	}

		
}
