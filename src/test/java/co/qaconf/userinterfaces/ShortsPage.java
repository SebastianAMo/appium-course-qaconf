package co.qaconf.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ShortsPage {

    public static final Target SHARE_BTN = the("Share button of a short").located(
            AppiumBy.accessibilityId("Comprtir este video"));

    public static final Target SUSCRIPTION_BTN = the("Suscribe button of a short").locatedBy(
            "//android.view.ViewGroup[starts-with(@content-desc, 'Zuscribirme a')]");
}
