package co.qaconf.interactions;

import co.qaconf.constants.MenuEnum;
import co.qaconf.utils.MobileHelper;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.qaconf.userinterfaces.HomePage.MENU_OPTIONS_ANDROID;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class OpenMenuOption implements Interaction {

    private MenuEnum optionMenu;

    public OpenMenuOption(MenuEnum optionMenu) {
        this.optionMenu = optionMenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String envDevice = MobileHelper.getCurrentEnvironment();
        String valueDevice = optionMenu.getValueByPlataform(envDevice);

         actor.attemptsTo(
                WaitUntil.the(MENU_OPTIONS_ANDROID.of(valueDevice), isClickable())
                        .forNoMoreThan(10).seconds(),
                Click.on(MENU_OPTIONS_ANDROID.of(valueDevice))
         );


    }

    // Using this Open class, this method is no necessary,  and you avoid use MenuEnum in test
    public static OpenMenuOption openOption(MenuEnum optionMenu) {
        return instrumented(OpenMenuOption.class, optionMenu);
    }

    /*
     * public static Performable OpenCallMenu(){
     *  return intrumented(OpenMenuOption.class);
     * }
     * */
}
