package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static AndroidDriver<AndroidElement> driver;

    public AndroidDriver<AndroidElement> setCap(String appName) throws IOException {


        FileInputStream fis = new FileInputStream("src/test/java/global.properties");
        Properties prop = new Properties();
        prop.load(fis);


        DesiredCapabilities cap = new DesiredCapabilities();

        File appDir = new File("src");
        File app = new File(appDir, (String) prop.get(appName));

        String device = (String) prop.get("device");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        return driver;
    }

    public void impWait(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public DriverFactory(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void closeApp(){
        driver.quit();
    }

}
