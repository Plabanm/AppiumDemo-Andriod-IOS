package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.Terms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.is;

public class TermsSteps {

    Terms termsScreen = new Terms();

    @When("I click on terms of service")
    public void i_click_on_terms_of_service() {
        termsScreen.goToTermsPage();
    }

    @Then("I can view the terms of service")
    public void i_can_view_the_terms_of_service() {
        String actual = termsScreen.GetTermsTitle();
        String expected = "Terms of Service";
        assertThat("Terms of Service visible",actual,is(equalToIgnoringWhiteSpace(expected)));
        termsScreen.clickDismissButton();
    }

    @When("I click on privacy policy")
    public void i_click_on_privacy_policy() {
        termsScreen.goToPrivacyPage();
    }

    @Then("I can view the privacy policy")
    public void i_can_view_the_privacy_policy() {
        String actual = termsScreen.getPrivacyTitle();
        String expected = "Privacy";
        assertThat("Privacy Policy visible",actual,is(equalToIgnoringWhiteSpace(expected)));
        termsScreen.clickDismissButton();
    }
}
