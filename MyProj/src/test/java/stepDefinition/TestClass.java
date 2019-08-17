package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.UserPageFactory;

public class TestClass{
	
	private WebDriver driver;
	private UserPageFactory rpf;
	
@Given("^User is on 'register' Page$")
public void user_is_on_register_Page() throws Throwable {
    
}

@When("^User Enters Invalid First Name$")
public void user_Enters_Invalid_First_Name() throws Throwable {
    
    
}

@Then("^display 'Please Enter Valid First Name'$")
public void display_Please_Enter_Valid_First_Name() throws Throwable {
    
    
}

@When("^User Enters Invalid Last Name$")
public void user_Enters_Invalid_Last_Name() throws Throwable {
    
    
}

@Then("^display 'Please Enter Valid Last Name'$")
public void display_Please_Enter_Valid_Last_Name() throws Throwable {
    
    
}

@When("^User Enters Invalid Mobile Number$")
public void user_Enters_Invalid_Mobile_Number() throws Throwable {
    
    
}

@Then("^display 'Please Enter Valid Mobile Number'$")
public void display_Please_Enter_Valid_Mobile_Number() throws Throwable {
    
    
}

@When("^User Enters Invalid Address$")
public void user_Enters_Invalid_Address() throws Throwable {
    
    
}

@Then("^display 'Please Enter Your Valid Address'$")
public void display_Please_Enter_Your_Valid_Address() throws Throwable {
    
    
}

@When("^User Enters Invalid EmailID$")
public void user_Enters_Invalid_EmailID() throws Throwable {
    
    
}

@Then("^display 'Please Enter Valid EmailID'$")
public void display_Please_Enter_Valid_EmailID() throws Throwable {
    
    
}

@Given("^User is on 'register' page$")
public void user_is_on_register_page() throws Throwable {
    
    
}

@When("^User Enters Invalid Password$")
public void user_Enters_Invalid_Password() throws Throwable {
    
    
}

@Then("^display 'Please Enter Valid Password'$")
public void display_Please_Enter_Valid_Password() throws Throwable {
    
    
}

@Then("^display 'Please Enter Valid ConfirmPassword'$")
public void display_Please_Enter_Valid_ConfirmPassword() throws Throwable {
    
    
}

@When("^User Enters Invalid Answer for SecrityQuestion(\\d+)$")
public void user_Enters_Invalid_Answer_for_SecrityQuestion(int arg1) throws Throwable {
    
    
}

@Then("^display 'Please Enter Valid Answer for SecrityQuestion(\\d+)'$")
public void display_Please_Enter_Valid_Answer_for_SecrityQuestion(int arg1) throws Throwable {
    
    
}

@When("^User clicks on Create Account$")
public void user_clicks_on_Create_Account() throws Throwable {
    
    
}

@Then("^display 'Yoursuccess' Page$")
public void display_Yoursuccess_Page() throws Throwable {
    
    
}
}