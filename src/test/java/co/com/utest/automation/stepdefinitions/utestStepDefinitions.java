package co.com.utest.automation.stepdefinitions;

import co.com.utest.automation.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class utestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Luisa wants to work independently in the testing area on the uTest platform$")
    public void thanLuisaWantsToWorkIndependentlyInTheTestingAreaOnTheUTestPlatform() {
        OnStage.theActorCalled("Luisa").wasAbleTo(OpenUp.thePage(), Login.thePage());
    }

    @When("^she enters her data in the uTest registration form$")
    public void sheEntersHerDataInTheUTestRegistrationForm() {
        OnStage.theActorCalled("Luisa").wasAbleTo(Form1.thePage(), Form2.thePage(), Form3.thePage(), Form4.thePage());
    }

    @Then("^she finishes by clicking register(.*)$")
    public void sheFinishesByClickingRegister() {

    }
}
