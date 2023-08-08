import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class dragAndDrop {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = createDriverSession.initializeDriver();

        longGesture(driver);
        Thread.sleep(2000);

        driver.quit();
    }

    public static void longGesture(AppiumDriver driver) throws InterruptedException {
        By view = AppiumBy.accessibilityId("Views");
        driver.findElement(view).click();

        By drag = AppiumBy.accessibilityId("Drag and Drop");
        driver.findElement(drag).click();

        Thread.sleep(2000);

        WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
        driver.executeScript("mobile:longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
//                "x",217 ,
//                "y",659 ,
                "duration", 1000
        ));
    }
}
