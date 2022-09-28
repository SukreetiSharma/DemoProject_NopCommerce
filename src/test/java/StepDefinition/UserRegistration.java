package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration extends BaseClass {
    @Given("User is on Dashboard")
    public void user_is_on_dashboard() {
        setup();
    }
    @When("Click on Register")
    public void click_on_register() {
        obj.getRegister().ClickRegister();
    }
    @When("Fill all Required Details and Register")
    public void fill_all_required_details_and_register() {
        obj.getRegister().FillDetails();
    }
    @Then("Verify User is Register and Logout")
    public void verify_user_is_register() {
        obj.getRegister().VerifyRegister();
        close();
    }

}
