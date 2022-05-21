package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.EmailAddress;
import screens.Introduction;
import screens.Terms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.is;

public class onBoardSteps {

    Introduction introScreen = new Introduction();
    Terms termsScreen = new Terms();
    EmailAddress emailScreen = new EmailAddress();

    @Given("I am on introduction screen")
    public void i_am_in_introduction_screen() {
        String expected = "Take control of your home finances";
        String actual = introScreen.getIntroMsg();
        assertThat("Home page Intro Loaded", actual, is(equalToIgnoringWhiteSpace(expected)));

    }

    @When("I tap on Get started Button")
    public void i_tap_on_Get_started_Button() {
        introScreen.tapGetStartedButton();
    }

    @When("click on i accept terms of service and click on continue button")
    public void click_on_i_accept_terms_of_service_and_click_on_continue_button() {
        termsScreen.acceptTerms();
        termsScreen.clickContinueButton();
    }

    @When("fill in valid email address and click continue button")
    public void fill_in_valid_email_address_and_click_continue_button() {
        emailScreen.fillEmail();
        emailScreen.clickContinueButton();
    }

    @Then("I should get {string} confirmation")
    public void i_should_get_confirmation(String msg) {
        String actual = emailScreen.confirmationMsg();
        assertThat("Success Message",actual,is(equalToIgnoringWhiteSpace(msg)));
    }
}
