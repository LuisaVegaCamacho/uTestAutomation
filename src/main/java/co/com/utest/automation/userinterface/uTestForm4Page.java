package co.com.utest.automation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestForm4Page extends PageObject {

    public static final Target PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password").located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED_CHECK = Target.the("Stay_informed check").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target TERMS_USE_CHECK = Target.the("Terms use check").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_SECURITY_CHECK = Target.the("Privacity security check").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_BUTTON = Target.the("Button").located(By.id("laddaBtn"));

}
