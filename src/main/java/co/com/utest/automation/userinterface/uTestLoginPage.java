package co.com.utest.automation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestLoginPage extends PageObject {

public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
        .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

}
