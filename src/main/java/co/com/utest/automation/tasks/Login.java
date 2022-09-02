package co.com.utest.automation.tasks;

import co.com.utest.automation.userinterface.uTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Login implements Task{


    public static Login thePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(Click.on(uTestLoginPage.LOGIN_BUTTON));
    }
}
