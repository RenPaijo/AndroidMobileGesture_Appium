import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class swipeGesture {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = createDriverSession.initializeDriver();

        swipe(driver);
        Thread.sleep(2000);
        scroll(driver);
        Thread.sleep(2000);

        driver.quit();
    }

    public static void swipe(AppiumDriver driver){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
//        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

//        WebElement element = driver.findElement(AppiumBy.xpath("//*[@resource-id=\"io.appium.android.apis" +
//                ":id/gallery\"]/android.widget.ImageView[1]"));
        WebElement element = driver.findElement(AppiumBy.id("android:id/list"));
        driver.executeScript("mobile:swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", "up",
                "percent", 0.5
        ));
    }

    public static void scroll(AppiumDriver driver){
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();

//        WebElement element = driver.findElement(AppiumBy.accessibilityId("Search View"));
//        driver.executeScript("mobile:scrollGesture", ImmutableMap.of(
//                     "elementId", ((RemoteWebElement) element).getId(),
//                     "direction", "up",
//                     "percent", 1.0
//        ));

//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector).scroll" +
//                "IntoView(text(\"Animation"\))"));));

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable" +
                "(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Animation\").instance(0))"));


    }
}
