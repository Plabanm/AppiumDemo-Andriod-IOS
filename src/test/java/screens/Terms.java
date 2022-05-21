package screens;

import driver.DriverFactory;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Terms extends DriverFactory {

    @AndroidFindBy(id = "com.youtility.test:id/cbTermsAndConditions")
    private WebElement termsAcceptRadioButton;

    @AndroidFindBy(id = "com.youtility.test:id/btnContinue")
    private WebElement continueButton;

    @AndroidFindBy(id = "com.youtility.test:id/llTermsAndConditions")
    private WebElement termsLink;

    @AndroidFindBy(id = "com.youtility.test:id/llPrivacyPolicy")
    private WebElement privacyLink;

    @AndroidFindBy(id = "com.youtility.test:id/btnDismiss")
    private WebElement dismissButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms of Service']")
    private WebElement termsTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy']")
    private WebElement privacyTitle;

    public void acceptTerms(){
        termsAcceptRadioButton.click();
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void goToTermsPage(){
        termsLink.click();
    }

    public void goToPrivacyPage(){
        privacyLink.click();
    }

    public String GetTermsTitle(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.stalenessOf(termsTitle));
        return termsTitle.getText();
    }

    public String getPrivacyTitle(){
        return privacyTitle.getText();
    }

    public void clickDismissButton(){
        dismissButton.click();
    }



}
