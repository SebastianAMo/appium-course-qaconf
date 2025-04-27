package co.qaconf.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {

    public static final Target SEARCH_BTN = the("Search button in Youtube")
            .locatedBy("//android.widget.ImageView[@content-desc='Search']");

    public static final Target SEARCH_VIDEOS_FIELD = the("Search videos field in Youtube")
            .located(AppiumBy.className("android.widget.EditText"));
}
