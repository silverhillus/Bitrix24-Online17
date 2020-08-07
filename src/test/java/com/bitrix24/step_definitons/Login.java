package com.bitrix24.step_definitons;

import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    @When("User clicks to Log In button")
    public void user_clicks_to_log_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login.url"));
    }


    @Then("User should be able to verify Activity Stream text is displayed")
    public void user_should_be_able_to_verify_activity_stream_text_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters incorrect {string} or incorrect {string} or both incorrect")
    public void user_enters_incorrect_or_incorrect_or_both_incorrect(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should be able to verify Error message text is displayed on the Login Page")
    public void user_should_be_able_to_verify_error_message_text_is_displayed_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
