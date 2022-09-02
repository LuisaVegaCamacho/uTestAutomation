package co.com.utest.automation.tasks;

import co.com.utest.automation.userinterface.uTestForm4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Form4  implements Task {


    public static Form4 thePage()
    {
        return Tasks.instrumented(Form4.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(Enter.theValue("Choucair2022*").into(uTestForm4Page.PASSWORD),
              Enter.theValue("Choucair2022*").into(uTestForm4Page.CONFIRM_PASSWORD),
              Click.on(uTestForm4Page.STAY_INFORMED_CHECK),
              Click.on(uTestForm4Page.TERMS_USE_CHECK),
              Click.on(uTestForm4Page.PRIVACY_SECURITY_CHECK),
              Click.on(uTestForm4Page.COMPLETE_BUTTON)
              );
    }
}
