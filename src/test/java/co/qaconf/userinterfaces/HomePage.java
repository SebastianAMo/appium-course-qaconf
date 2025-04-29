package co.qaconf.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {

    public static final Target SEARCH_BTN = the("Search button in Youtube")
            .locatedBy("//android.widget.ImageView[@content-desc='Search']");

    public static final Target SEARCH_VIDEOS_FIELD = the("Search videos field in Youtube")
            .located(AppiumBy.className("android.widget.EditText"));

    public static final Target MENU_OPTIONS_ANDROID = the("General Options in Youtube").
            locatedBy("//android.widget.TextView[@text='{0}']");

    // Example of a target to android and IOs
    public static final Target CAMPO_BUSCAR_VIDEOS = the("Campo para busqueda de videos")
            .locatedForAndroid(AppiumBy.className("android.widget.EditText"))
            .locatedForIOS(AppiumBy.className("XCUIElementTypeSearchField"));

}
