package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPageFactory {

	// Driver definition
	WebDriver driver;

	// Initiating the Driver
	public AdminPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Step 1 : Identify Elements

	@FindBy(name = "name") // find by is to find element name specified in the form
	@CacheLookup // to cache the value of that element of the form whose name is specified inside
					// FindBy tag
	WebElement name;

	@FindBy(name = "address")
	@CacheLookup
	WebElement address;

	@FindBy(name = "marks")
	@CacheLookup
	WebElement marks;

	@FindBy(name = "gender")
	@CacheLookup
	WebElement gender;

	@FindBy(id = "rbMale")
	@CacheLookup
	WebElement rbMale;

	@FindBy(id = "rbFemale")
	@CacheLookup
	WebElement rbFemale;

	@FindBy(className = "btn")
	@CacheLookup
	WebElement loginButton;

	@FindBy(xpath = "//*[@id=\"nameErrMsg\"]")
	WebElement nameError;

	@FindBy(xpath = "//*[@id=\"addressErrMsg\"]")
	WebElement addressError;

	@FindBy(xpath = "//*[@id=\"markErrMsg\"]")
	WebElement marksError;

	@FindBy(xpath = "//*[@id=\"genderErrMsg\"]")
	WebElement genderError;

	// Step 2) Getters and Setters

	public WebElement getGenderError() {
		return genderError;
	}

	public void setGenderError(WebElement genderError) {
		this.genderError = genderError;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getName() {
		return name;
	}

	// changes here
	public void setName(String name) { // here String
		this.name.sendKeys(name); // here add sendkeys()
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public WebElement getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks.sendKeys(marks);
	}

	public WebElement getNameError() {
		return nameError;
	}

	public void setNameError(WebElement nameError) {
		this.nameError = nameError;
	}

	public WebElement getAddressError() {
		return addressError;
	}

	public void setAddressError(WebElement addressError) {
		this.addressError = addressError;
	}

	public WebElement getMarksError() {
		return marksError;
	}

	public void setMarksError(WebElement marksError) {
		this.marksError = marksError;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(String gender) {
		// over here for radio button we have tpo specify the options and check the value.
		if(gender.equalsIgnoreCase("Male")) {
			setRbMale();
		}
		else if(gender.equalsIgnoreCase("Female")) {
			setRbFemale();
		}
	}

	public void setLoginButton() {
		this.loginButton.click();
	}

	public WebElement getRbMale() {
		return rbMale;
	}

	public void setRbMale() {
		this.rbMale.click();
	}

	public WebElement getRbFemale() {
		return rbFemale;
	}

	public void setRbFemale() {
		this.rbFemale.click();
	}

}
