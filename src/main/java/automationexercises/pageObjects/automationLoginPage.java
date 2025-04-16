package automationexercises.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationexercise.abstractcomponents.HelperClass;

public class automationLoginPage extends HelperClass {
    WebDriver driver;

    public automationLoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),' Signup / Login')]")
    WebElement gotologinpage;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement enterthenamefornewuser;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement entertheemailfornewuser;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    WebElement sendbutton;

    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    WebElement verifythetextappears;

    @FindBy(xpath = "//h2[@class='title text-center']/b[contains(text(),'Enter Account Information')]")
    WebElement verifyforaccountpage;

    @FindBy(xpath = "//input[@value='Mr']")
    WebElement titlemr;

    @FindBy(xpath = "//input[@value='Mrs']")
    WebElement titleformrs;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    WebElement dayclick;

    @FindBy(xpath = "//select[@id='days']/option[@value='7']")
    WebElement day;

    @FindBy(xpath = "//select[@id='months']")
    WebElement monthclick;

    @FindBy(xpath = "//select[@id='months']/option[@value='5']")
    WebElement month;

    @FindBy(xpath = "//select[@id='years']")
    WebElement yearsclick;

    @FindBy(xpath = "//select[@id='years']/option[@value='2007']")
    WebElement years;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement checkbox;

    @FindBy(xpath = "//input[@id='optin']")
    WebElement offers;

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement adressname;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement adresslastname;

    @FindBy(xpath = "//input[@id='company']")
    WebElement companyname;

    @FindBy(xpath = "//select[@id='country']")
    WebElement countryname;

    @FindBy(xpath = "//select[@id='country']/option[@value='India']")
    WebElement countrychoose;

    @FindBy(xpath = "//input[@id='state']")
    WebElement statechoose;

    @FindBy(xpath = "//input[@id='city']")
    WebElement citychoose;

    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobilenumber;

    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    WebElement continuetheadrress;

    @FindBy(xpath = "//div[@class='pull-right']/a")
    WebElement continueaftercreatingthesubmit;

    public void redirecttologinpage() {
        gotologinpage.click();
    }

    public void newusername(String name) {
        waitForElementToAppear(verifythetextappears);
        enterthenamefornewuser.sendKeys(name);
    }

    public void newuseremail(String email) {
        entertheemailfornewuser.sendKeys(email);
    }

    public void enterthenewuser() {
        sendbutton.click();
    }

    public void informationtitle(String title) {
        waitForElementToAppear(verifyforaccountpage);
        if (title.equalsIgnoreCase("Mr")) {
            titlemr.click();
        } else {
            titleformrs.click();
        }
    }

    public void informationPassword(String pass) {
        password.sendKeys(pass);
    }

    public void dateofbirth() {
        dayclick.click();
        day.click();
        monthclick.click();
        month.click();
        yearsclick.click();
        years.click();
    }

    public void checkboxfornewsletter() {
        checkbox.click();
    }

    public void checkboxforoffers() {
        offers.click();
    }

    public void adressfirstname(String firstName) {
        adressname.sendKeys(firstName);
    }

    public void adresslastname(String lastName) {
        adresslastname.sendKeys(lastName);
    }

    public void adresscomapanyname(String company) {
        companyname.sendKeys(company);
    }

    public void adresscounty() {
        countryname.click();
        countrychoose.click();
    }

    public void choosingthestate(String state) {
        statechoose.sendKeys(state);
    }

    public void choosingthecity(String city) {
        citychoose.sendKeys(city);
    }

    public void enterzipcode(String code) {
        zipcode.sendKeys(code);
    }

    public void entermobilenumber(String number) {
        mobilenumber.sendKeys(number);
    }

    public void submittheform() {
        continuetheadrress.click();
    }

    public void continuetohomepage() {
        waitForElementToAppear(continueaftercreatingthesubmit);
        continueaftercreatingthesubmit.click();
    }
}
