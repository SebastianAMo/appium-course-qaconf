package co.qaconf.stedefinitions;

import co.qaconf.tasks.SearchVideo;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static co.qaconf.userinterfaces.HomePage.SEARCH_BTN;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchVideoYoutube {

    @Test
    public void buscarVideoFutbolEnYoutube(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").attemptsTo(
                WaitUntil.the(SEARCH_BTN, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(SEARCH_BTN),
                SearchVideo.enYoutube()
        );
    }

}
