package testcases;
import org.testng.annotations.Test;
import pages.PFHomePage;
import pages.PFCreateAccount;
import wrappers.PFChangWrappers;

import org.testng.annotations.BeforeClass;

public class PF005_SuccessfulReservation extends PFChangWrappers{
	@Test(dataProvider="fetchData")
	public void reservation(String Emailaddress, String passWord,String reservationDate, String reservationTime,String size,String firstName,String lastName, String phone) throws InterruptedException {
		new PFHomePage()
		.clicklogin()
		.enterEmailaddresslogin(Emailaddress)
		.enterPasswordlogin(passWord)
		.clickloginSubmit()
		.MakeReservation()
		.selectReservationdate(reservationDate)
		.selectReservationtime(reservationTime)
		.selectSize(size)
		.enterFirstname(firstName)
		.enterLastname(lastName)
		.enterPhone(phone)
		.submitReservation();
		
			}
@BeforeClass
	public void beforeClass() {
		dataSheetName="PF005";
		browserName="chrome";
		testCaseName="Make a Reservation with valid data";
		testDescription="Reservation with valid data";
	}

		
}

