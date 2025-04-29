package co.qaconf.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.qaconf.userinterfaces.ShortsPage.SHARE_BTN;

public class ShareButton implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        // SHARE_BTN.isVisibleFor(actor);
        return SHARE_BTN.resolveFor(actor).isVisible();
    }

    public static ShareButton isVisible() {
        return new ShareButton();
    }
}
