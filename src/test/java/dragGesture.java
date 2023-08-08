import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class dragGesture {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = createDriverSession.initializeDriver();

        drag(driver);
        Thread.sleep(2000);

        driver.quit();
    }

    public static void drag(AppiumDriver driver) throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        Thread.sleep(2000);

        WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
        driver.executeScript("mobile:dragGesture", ImmutableMap.of(
           "elementId", ((RemoteWebElement) element).getId(),
           "endX", 832,
           "endY", 797
        ));

    }
}
