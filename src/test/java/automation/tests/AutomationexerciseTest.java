package automation.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation.testcomponents.BaseTest;
import automationexercises.pageObjects.automationLoginPage;
import automation.data.*;

public class AutomationexerciseTest extends BaseTest{
	
	@Test(dataProvider="getData")
	public void loginflow(HashMap<String, String> input) {
		homepage.goTo();
		automationLoginPage loginpage = new automationLoginPage(driver);
		loginpage.redirecttologinpage();
		loginpage.newusername(input.get("name"));
		loginpage.newuseremail(input.get("email"));
		loginpage.enterthenewuser();
		loginpage.informationtitle(input.get("title"));
		loginpage.informationPassword(input.get("password"));
		loginpage.dateofbirth();
		loginpage.checkboxfornewsletter();
		loginpage.checkboxforoffers();
		loginpage.adressfirstname(input.get("firstName"));
		loginpage.adresslastname(input.get("lastName"));
		loginpage.adresscomapanyname(input.get("company"));
		loginpage.adresscounty();
		loginpage.choosingthestate(input.get("state"));
		loginpage.choosingthecity(input.get("city"));
        loginpage.enterzipcode(input.get("zipcode"));
        loginpage.entermobilenumber(input.get("mobile"));
		loginpage.submittheform();
		loginpage.continuetohomepage();
		homepage.deletingtheuser();
		homepage.delete();
	}
	@DataProvider
	public Object[][] getUserTestData() throws IOException {
	    JsonDataProvider dataProvider = new JsonDataProvider();
	    List<HashMap<String, String>> data = dataProvider.getUserData(
	        System.getProperty("user.dir") + "//src//test//java//automation//data//UserData.json"
	    );

	    Object[][] testData = new Object[data.size()][1];
	    for (int i = 0; i < data.size(); i++) {
	        testData[i][0] = data.get(i);
	    }
	    return testData;
	}


}
