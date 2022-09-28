package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class GiftcardProduct extends BaseClass {
    @Given("user is on Dashboard")
    public void user_is_on_dashboard() {
        setup();
    }

    @When("click on Giftcard")
    public void click_on_giftcard() {
        obj.getGiftcard().ClickGiftCard();
    }

    @When("Add one product to cart with Details")
    public void add_one_product_to_cart_with_details() throws IOException {
        obj.getGiftcard().AddProductWithDetails();
    }

    @When("Go to shopping cart an checkout")
    public void go_to_shopping_cart_an_checkout() {
        obj.getGiftcard().CheckOutPage();
        obj.getRegister().FillDetails();
        obj.getGiftcard().ContinueCheckout();
    }

    @Then("Verify user is able to send gift")
    public void verify_user_is_able_to_send_gift() {
        obj.getGiftcard().VerifyGiftcard();
        close();
    }

}
