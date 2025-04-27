package co.qaconf.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.qaconf.userinterfaces.HomePage.SEARCH_VIDEOS_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteInInput implements Interaction {

    private String videName;

    public WriteInInput(String videName){
        this.videName = videName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(videName).into(SEARCH_VIDEOS_FIELD)
        );
    }

    public static WriteInInput inputText(String videName){
        return instrumented(WriteInInput.class, videName);
    }
}
