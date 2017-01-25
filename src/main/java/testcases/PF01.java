package testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PFHomePage;
import pages.PFCreateAccount;
import wrappers.PFChangWrappers;

public class PF01 extends PFChangWrappers{
	
	@Test(dataProvider="fetchData")
	public void register(String emailaddress, String passWord,String fname, String lname,String phone,String zipcode,String message) {
		new PFHomePage()
		.clickRegister()
		.enterEmailaddress(emailaddress)
		.enterPassword(passWord)
		.enterFirstname(fname)
		.enterLastname(lname)
		.enterPhone(phone)
		.enterZip(zipcode)
		.clickCreateMyAccount()
		.verifyAlertmessage(message);
		
		}
@BeforeClass
	public void beforeClass() {
		dataSheetName="PF001";
		browserName="chrome";
		testCaseName="Register User with invalid data";
		testDescription="Validate error messages";
	}
	
}
