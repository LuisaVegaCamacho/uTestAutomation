package co.com.utest.automation.tasks;

import co.com.utest.automation.userinterface.uTestForm3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Form3  implements Task {


    public static Form3 thePage()
    {
        return Tasks.instrumented(Form3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
  actor.attemptsTo(Click.on(uTestForm3Page.MOBILE),
          Enter.theValue("Apple").into(uTestForm3Page.INPUT_MOBILE),
          Enter.keyValues(Keys.ENTER).into(uTestForm3Page.INPUT_MOBILE),
          Click.on(uTestForm3Page.MODEL),
          Enter.theValue("iPhone 7 Plus").into(uTestForm3Page.INPUT_MODEL),
          Enter.keyValues(Keys.ENTER).into(uTestForm3Page.INPUT_MODEL),
          Click.on(uTestForm3Page.SO),
          Enter.theValue("iOS 10.0").into(uTestForm3Page.INPUT_SO),
          Enter.keyValues(Keys.ENTER).into(uTestForm3Page.INPUT_SO),
          Click.on(uTestForm3Page.NEXT_BUTTON)
          );
    }
}
