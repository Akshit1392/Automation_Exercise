package automationexercises.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationexercise.abstractcomponents.HelperClass;

public class automationHomePage extends HelperClass{
	WebDriver driver;
	String homepageurl = "https://automationexercise.com/";
	
	public automationHomePage(WebDriver driver) {
		//initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),' Delete Account')]")
	WebElement deletethecurrentuser;
	
	@FindBy(xpath="//div[@class='pull-right']/a")
	WebElement deleting;
	
	// Methods 
	public void goTo() {
 		driver.get(homepageurl);
 	}
	public void deletingtheuser() {
		waitForElementToAppear(deletethecurrentuser);
		deletethecurrentuser.click();
	}
	public void delete() {
		waitForElementToAppear(deleting);
		deleting.click();
	}
	
}
