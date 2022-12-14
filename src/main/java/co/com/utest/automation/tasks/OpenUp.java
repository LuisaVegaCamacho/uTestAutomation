package co.com.utest.automation.tasks;


import co.com.utest.automation.userinterface.uTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp  implements Task {


    private uTestPage utestPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));}

    }
