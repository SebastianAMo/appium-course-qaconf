package co.qaconf.interactions;

import co.qaconf.constants.MenuEnum;

import static net.serenitybdd.screenplay.Tasks.instrumented;


// This class works like a builder, but it isn't, return different classes with depending on a default value or attributes
// A examples it is the code of actions of serenity BDD with screenplay with the Enter class, that use classes like EnterValueByElement, EnterValueByTarget to simplify actions
public class Open {


    public static Open openOption(){
        return new Open();
    }

    public static OpenMenuOption home(){
        return instrumented(OpenMenuOption.class, MenuEnum.HOME);
    }

    public static OpenMenuOption shorts(){
        return instrumented(OpenMenuOption.class, MenuEnum.SHORTS);
    }

    public static OpenMenuOption library(){
        return instrumented(OpenMenuOption.class, MenuEnum.LIBRARY);
    }

    public static OpenMenuOption you(){
        return instrumented(OpenMenuOption.class, MenuEnum.YOU);
    }


}
