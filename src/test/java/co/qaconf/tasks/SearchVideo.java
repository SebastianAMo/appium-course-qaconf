package co.qaconf.tasks;

import co.qaconf.interactions.WriteInInput;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.qaconf.userinterfaces.HomePage.SEARCH_VIDEOS_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchVideo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SEARCH_VIDEOS_FIELD),
                WriteInInput.inputText("Gol de Roberto Carlos")
        );
    }

    public static SearchVideo enYoutube(){
        return instrumented(SearchVideo.class);
    }
}
