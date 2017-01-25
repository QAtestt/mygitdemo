package testcases;

import org.testng.annotations.Test;


import pages.PFHomePage;
import pages.PFCreateAccount;
import wrappers.PFChangWrappers;

import org.testng.annotations.BeforeClass;

public class PF003_VerifyMessage_LoginFailure extends PFChangWrappers{
	@Test(dataProvider="fetchData")
	public void login(String emailaddress, String passWord, String message) throws InterruptedException {
		new PFCreateAccount()
		.clicklogin()
		.enterEmailaddresslogin(emailaddress)
		.enterPasswordlogin(passWord)
		.loginfailure()
		.verifyLoginmessage(message);
			}
@BeforeClass
	public void beforeClass() {
		dataSheetName="PF003";
		browserName="chrome";
		testCaseName="PF003 Verify error message for Login failure";
		testDescription="User login using POM";
	}

		
}

