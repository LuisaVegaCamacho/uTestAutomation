package co.com.utest.automation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestForm1Page extends PageObject {

    public static final Target FIRST_NAME = Target.the("Write First Name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Write Last Name").located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("Write Email Address").located(By.id("email"));
    public static final Target BIRTH_MONTH_OPTION = Target.the("Select Month Option").located(By.xpath("//*[@id=\"birthMonth\"]/option[5]"));
    public static final Target BIRTH_DAY_OPTION = Target.the("Select Day Option").located(By.xpath("//*[@id=\"birthDay\"]/option[25]"));
    public static final Target BIRTH_YEAR_OPTION = Target.the("Select Year Option").located(By.xpath("//*[@id=\"birthYear\"]/option[7]"));
    public static final Target LANGUAGES = Target.the("Select Language").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_BUTTON = Target.the("Click in Button Next")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
