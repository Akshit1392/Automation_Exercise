package automationexercises.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class automationHomePage {
	WebDriver driver;
	String homepageurl = "https://automationexercise.com/";
	
	public automationHomePage(WebDriver driver) {
		//initialization
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goTo() {
 		driver.get(homepageurl);
 	}
}
