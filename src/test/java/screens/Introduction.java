package screens;

import driver.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;


public class Introduction extends DriverFactory {

    @AndroidFindBy(id = "com.youtility.test:id/tvTop")
    private WebElement introMsg;

    @AndroidFindBy(id = "com.youtility.test:id/btnGetStarted")
    private WebElement getStartedButton;


    public String getIntroMsg(){
        return introMsg.getText();
    }

    public void tapGetStartedButton(){
        TouchAction touch = new TouchAction(driver);
        touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(getStartedButton))).perform();
    }




}
