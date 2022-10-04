package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct extends BaseClass {
    @Given("user is on dashboard")
    public void user_is_on_dashboard() {
        setup();
    }

    @When("Enter any Product in search Bar and Search")
    public void enter_any_product_in_search_bar_and_search() {
        obj.getSearch().AbleTosearch();
    }

    @Then("Verify Product is searched and Logout")
    public void verify_product_is_searched_and_logout() {
        obj.getSearch().VerifySearchedProduct();
        close();
    }
}

