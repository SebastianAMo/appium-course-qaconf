package co.qaconf.stedefinitions;

import co.qaconf.constants.MenuEnum;
import co.qaconf.exceptions.NoFoundElement;
import co.qaconf.interactions.Open;
import co.qaconf.interactions.OpenMenuOption;
import co.qaconf.questions.ShareButton;
import co.qaconf.tasks.SearchVideo;
import co.qaconf.utils.MobileHelper;
import net.serenitybdd.annotations.Pending;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static co.qaconf.userinterfaces.HomePage.SEARCH_BTN;
import static co.qaconf.userinterfaces.ShortsPage.SUSCRIPTION_BTN;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchVideoYoutube {

    @BeforeEach
    public void before() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Sebastian");
    }

    @Test
    @Pending
    public void searchSoccerVideo() {
        theActorCalled("Sebastian").attemptsTo(
                WaitUntil.the(SEARCH_BTN, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(SEARCH_BTN),
                SearchVideo.enYoutube()
        );

    }

    @Test
    @Pending
    public void openShorts() {
        theActorCalled("Sebastian").attemptsTo(
                Open.shorts()
        );
    }

    @Test
    public void checkShareButtonShortExceptionQuestion(){
        theActorCalled("Sebastian").attemptsTo(
                Open.shorts()
        );
        theActorCalled("Sebastian").should(
                seeThat(ShareButton.isVisible()).orComplainWith(
                        NoFoundElement.class
                )
        );
    }


    @Test
    public void checkShareButtonShortEnsure(){
        theActorCalled("Sebastian").attemptsTo(
                Open.shorts()
        );
        theActorCalled("Sebastian").attemptsTo(
                Ensure.that(SUSCRIPTION_BTN).isDisabled()
        );
    }

}
