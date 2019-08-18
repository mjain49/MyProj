package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPageFactory {

	// Driver definition
	WebDriver driver;

	// Initiating the Driver
	public UserPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Step 1 : Identify Elements

	@FindBy(name = "firstName") // find by is to find element name specified in the form
	@CacheLookup // to cache the value of that element of the form whose name is specified inside
					// FindBy tag
	WebElement fname;

	@FindBy(name = "lastName")
	@CacheLookup
	WebElement lname;

	@FindBy(name = "mobileNo")
	@CacheLookup
	WebElement mobileno;

	@FindBy(name = "address")
	@CacheLookup
	WebElement address;

	@FindBy(name = "email")
	@CacheLookup
	WebElement email;

	@FindBy(id = "password")
	@CacheLookup
	WebElement password;

	@FindBy(id = "confirmPass")
	@CacheLookup
	WebElement confirmpassword;

	@FindBy(id = "firstSecurityQuestion")
	@CacheLookup
	WebElement fsq;

	@FindBy(id = "secondSecurityQuestion")
	@CacheLookup
	WebElement ssq;

	@FindBy(className = "btn")
	@CacheLookup
	WebElement confirmButton;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]")
	WebElement fnameError;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[3]")
	WebElement lnameError;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[4]/td[4]")
	WebElement mobileError;

	@FindBy(xpath = "//*[@id=\"addressErrMsg\"]")
	WebElement addressError;

	@FindBy(xpath = "//*[@id=\"mailErrMsg\"]")
	WebElement mailError;

	@FindBy(xpath = "//*[@id=\"passErrMsg\"]")
	WebElement passError;

	@FindBy(xpath = "//*[@id=\"cpassErrMsg\"]")
	WebElement cpassError;

	@FindBy(xpath = "//*[@id=\"fsqErrMsg\"]")
	WebElement fsqError;

	@FindBy(xpath = "//*[@id=\"ssqErrMsg\"]")
	WebElement ssqError;
	

	// Step 2) Getters and Setters
	// public void setLoginButton() {
	// this.loginButton.click();
	// }

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname.sendKeys(fname);
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname.sendKeys(lname);;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno.sendKeys(mobileno);;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword.sendKeys(confirmpassword);
	}

	public WebElement getFsq() {
		return fsq;
	}

	public void setFsq(String fsq) {
		this.fsq.sendKeys(fsq);
	}

	public WebElement getSsq() {
		return ssq;
	}

	public void setSsq(String ssq) {
		this.ssq.sendKeys(ssq);
	}

	public void setConfirmButton() {
		this.confirmButton.click();
	}

	public WebElement getFnameError() {
		return fnameError;
	}

	public void setFnameError(String fnameError) {
		this.fnameError.sendKeys(fnameError);
	}
//
//	public WebElement getLnameError() {
//		return lnameError;
//	}
//
//	public void setLnameError(WebElement lnameError) {
//		this.lnameError = lnameError;
//	}
//
//	public WebElement getMobileError() {
//		return mobileError;
//	}
//
//	public void setMobileError(WebElement mobileError) {
//		this.mobileError = mobileError;
//	}
//
//	public WebElement getAddressError() {
//		return addressError;
//	}
//
//	public void setAddressError(WebElement addressError) {
//		this.addressError = addressError;
//	}
//
//	public WebElement getMailError() {
//		return mailError;
//	}
//
//	public void setMailError(WebElement mailError) {
//		this.mailError = mailError;
//	}
//
//	public WebElement getPassError() {
//		return passError;
//	}
//
//	public void setPassError(WebElement passError) {
//		this.passError = passError;
//	}
//
//	public WebElement getCpassError() {
//		return cpassError;
//	}
//
//	public void setCpassError(WebElement cpassError) {
//		this.cpassError = cpassError;
//	}
//
//	public WebElement getFsqError() {
//		return fsqError;
//	}
//
//	public void setFsqError(WebElement fsqError) {
//		this.fsqError = fsqError;
//	}
//
//	public WebElement getSsqError() {
//		return ssqError;
//	}
//
//	public void setSsqError(WebElement ssqError) {
//		this.ssqError = ssqError;
//	}

	
	

}
