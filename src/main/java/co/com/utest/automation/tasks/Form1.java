package co.com.utest.automation.tasks;

import co.com.utest.automation.userinterface.uTestForm1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Form1 implements Task {


    public static Form1 thePage() {
        return Tasks.instrumented(Form1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(Enter.theValue("Luisa Fernanda").into(uTestForm1Page.FIRST_NAME),
             Enter.theValue("Vega Camacho").into(uTestForm1Page.LAST_NAME),
             Enter.theValue("pruebitas9299@gmail.com").into(uTestForm1Page.EMAIL_ADDRESS),
             Click.on(uTestForm1Page.BIRTH_MONTH_OPTION),
             Click.on(uTestForm1Page.BIRTH_DAY_OPTION),
             Click.on(uTestForm1Page.BIRTH_YEAR_OPTION),
             Enter.theValue("Spanish").into(uTestForm1Page.LANGUAGES),
             Enter.keyValues(Keys.ENTER).into(uTestForm1Page.LANGUAGES),
             Click.on(uTestForm1Page.NEXT_BUTTON));

    }
}
