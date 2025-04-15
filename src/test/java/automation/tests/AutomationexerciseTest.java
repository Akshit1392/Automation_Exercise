package automation.tests;

import org.testng.annotations.Test;

import automation.testcomponents.BaseTest;
import automationexercises.pageObjects.automationLoginPage;

public class AutomationexerciseTest extends BaseTest{
	
	@Test()
	public void loginflow() {
		homepage.goTo();
		automationLoginPage loginpage = new automationLoginPage(driver);
		loginpage.redirecttologinpage();
		loginpage.newusername();
		loginpage.newuseremail();
		loginpage.enterthenewuser();
		loginpage.informationtitle();
		loginpage.informationPassword();
		loginpage.dateofbirth();
		loginpage.checkboxfornewsletter();
		loginpage.checkboxforoffers();
		loginpage.adressfirstname();
		loginpage.adresslastname();
		loginpage.adresscomapanyname();
		loginpage.adresscounty();
		loginpage.choosingthestate();
		loginpage.choosingthecity();
		loginpage.enterzipcode();
		loginpage.entermobilenumber();
		loginpage.submittheform();
		loginpage.continuetohomepage();
	}
}
