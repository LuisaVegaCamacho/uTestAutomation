package co.com.utest.automation.tasks;

import co.com.utest.automation.userinterface.uTestForm2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Form2 implements Task {


    public static Form2 thePage() {
        return Tasks.instrumented(Form2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
   actor.attemptsTo(Enter.theValue("Bogota D.C").into(uTestForm2Page.CITY),
           Enter.keyValues(Keys.ARROW_DOWN).into(uTestForm2Page.CITY),
           Enter.keyValues(Keys.ENTER).into(uTestForm2Page.CITY),
           Enter.theValue("110821").into(uTestForm2Page.POSTAL),
           Click.on(uTestForm2Page.COUNTRY),
           Enter.theValue("Colombia").into(uTestForm2Page.INPUT_COUNTRY),
           Enter.keyValues(Keys.ENTER).into(uTestForm2Page.INPUT_COUNTRY),
           Click.on(uTestForm2Page.NEXT_BUTTON)
           );
    }
}
