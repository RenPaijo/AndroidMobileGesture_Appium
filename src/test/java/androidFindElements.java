import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import javax.annotation.concurrent.Immutable;
import java.rmi.Remote;

public class androidFindElements {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = createDriverSession.initializeDriver();

        By view = AppiumBy.accessibilityId("Views");
        driver.findElement(view).click();

        Thread.sleep(2000);

        WebElement element = driver.findElement(AppiumBy.id("android:id/list"));
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
           "elementId", ((RemoteWebElement) element).getId(),
                "direction", "up",
                "percent", 0.75
        ));

        Thread.sleep(2000);

        By textField = AppiumBy.accessibilityId("TextFields");
        driver.findElement(textField).click();

        By text = AppiumBy.id("io.appium.android.apis:id/edit");
        driver.findElement(text).sendKeys("Aldan Ganteng");
    }
}
