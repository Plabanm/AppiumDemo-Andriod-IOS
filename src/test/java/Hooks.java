import driver.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Hooks {
    DriverFactory df = new DriverFactory();

    @Before
    public void setUp() throws IOException {

        AndroidDriver<AndroidElement> driver = df.setCap("YoutilityApp");
        df.impWait();
    }

    @AfterAll
    public void tearDown() {
        df.closeApp();
    }

}
