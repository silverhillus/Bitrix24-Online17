package com.bitrix24.step_definitons;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();


    @When("User clicks to Log In button")
    public void user_clicks_to_log_in_button() {giy

    }

    @When("User enters correct {string} and {string}")
    public void userEntersCorrectUsernameAndPassword(String arg0, String arg1) {

        loginPage.username.sendKeys();

    }




    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login.url"));
    }

    @When("User enters correct username and password")
    public void userEntersCorrectUsernameAndPasssword() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("marketing.username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("marketing.password"));
    }

    @When("User clicks to Log In button")
    public void user_clicks_to_log_in_button() {
        loginPage.loginButton.click();
    }


    @Then("User should be able to verify Activity Stream text is displayed")
    public void user_should_be_able_to_verify_activity_stream_text_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

<<<<<<< HEAD
    @When("User enters incorrect {string} or incorrect {string} or both incorrect")
    public void user_enters_incorrect_or_incorrect_or_both_incorrect(String string, String string2) {

=======
    @When("User enters incorrect username")
    public void user_enters_incorrect_or_incorrect_or_both_incorrect() {
        loginPage.username.sendKeys(faker.name().username());
        loginPage.password.sendKeys(ConfigurationReader.getProperty("marketing.password"));
>>>>>>> 0e6be1d0c2fce461b0c624b8b2fdad461d3a3105
    }

    @Then("User should be able to verify Error message text is displayed on the Login Page")
    public void user_should_be_able_to_verify_error_message_text_is_displayed_on_the_login_page() {
<<<<<<< HEAD

    }



=======
        loginPage.errorMessage.isDisplayed();
    }


    @When("User enters incorrect password")
    public void userEntersIncorrectPassword() {
        loginPage.password.sendKeys(faker.name().fullName());
        loginPage.username.sendKeys(ConfigurationReader.getProperty("marketing.username"));
    }

    @When("User enters incorrect username and password")
    public void userEntersIncorrectUsernameAndPassword() {
        loginPage.password.sendKeys(faker.name().firstName());
        loginPage.username.sendKeys(faker.name().lastName());
    }
>>>>>>> 0e6be1d0c2fce461b0c624b8b2fdad461d3a3105
}
