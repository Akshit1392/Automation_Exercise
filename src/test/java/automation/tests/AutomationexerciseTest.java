package automation.tests;

import org.testng.annotations.Test;

import automation.testcomponents.BaseTest;

public class AutomationexerciseTest extends BaseTest{
	@Test()
	public void loginflow() {
		homepage.goTo();
	}
}
