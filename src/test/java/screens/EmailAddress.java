package screens;

import driver.DriverFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class EmailAddress extends DriverFactory {

    @AndroidFindBy(id = "com.youtility.test:id/etEmail")
    private WebElement emailTextBox;

    @AndroidFindBy(id = "com.youtility.test:id/btnContinue")
    private WebElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    private WebElement thanksMsg;

    public void fillEmail(){
        emailTextBox.sendKeys("email@test.com");
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public String confirmationMsg(){
        return thanksMsg.getText();
    }
}
