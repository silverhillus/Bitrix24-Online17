package com.bitrix24.step_definitons;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.pages.StreamPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    LoginPage loginPage = new LoginPage();
    StreamPage streamPage = new StreamPage();
    Faker faker = new Faker();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

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
        streamPage.activityStream.isDisplayed();
    }

    @When("User enters incorrect username")
    public void user_enters_incorrect_or_incorrect_or_both_incorrect() {

        loginPage.username.sendKeys(faker.name().username());
        loginPage.password.sendKeys(ConfigurationReader.getProperty("marketing.password"));
    }

    @Then("User should be able to verify Error message text is displayed on the Login Page")
    public void user_should_be_able_to_verify_error_message_text_is_displayed_on_the_login_page() {
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
}
