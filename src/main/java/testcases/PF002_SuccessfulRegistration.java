package testcases;

import org.testng.annotations.Test;


import pages.PFHomePage;
import pages.PFCreateAccount;
import wrappers.PFChangWrappers;

import org.testng.annotations.BeforeClass;

public class PF002_SuccessfulRegistration extends PFChangWrappers{
	@Test(dataProvider="fetchData")
	public void register(String emailaddress, String passWord,String fname, String lname,String phone,String zipcode,String value, String dayvalue) throws InterruptedException {
		new PFCreateAccount()
		.enterEmailaddress(emailaddress)
		.enterPassword(passWord)
		.enterFirstname(fname)
		.enterLastname(lname)
		.enterPhone(phone)
		.enterZip(zipcode)
		.clickCreateMyAccount()
		.month(value)
		.day(dayvalue)
		.clickSubmit()
		.clickLogout()
		.clickNotuser();
			}
@BeforeClass
	public void beforeClass() {
		dataSheetName="PF002";
		browserName="chrome";
		testCaseName="PF002 Successful Registration";
		testDescription="User Registration using POM";
	}

		
}

