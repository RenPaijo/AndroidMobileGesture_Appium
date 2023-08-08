import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class createDriverSession {

    public static AppiumDriver initializeDriver() throws Exception {
        String DIR = System.getProperty("user.dir");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_6_pro");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.APP, DIR + "/src/main/resources/ApiDemos-debug.apk");
        caps.setCapability("avd", "Pixel_6");
        caps.setCapability("avdLaunchTimeout", 21000);

        URL url = new URL("http://0.0.0.0:4723");

        return new AppiumDriver(url, caps);
    }

}