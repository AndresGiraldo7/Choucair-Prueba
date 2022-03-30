package co.com.choucair.project.one.stepdefinitions;

import co.com.choucair.project.one.model.UtestData;
import co.com.choucair.project.one.questions.Respon;
import co.com.choucair.project.one.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Andres wants to register to enter the uTest page$")
    public void thanAndresWantsToRegisterToEnterTheUTestPage() {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage());
    }

    @When("^he input the data for registration on the uTest page$")
    public void heInputTheDataForRegistrationOnTheUTestPage(List<UtestData> data) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Write.thePage(data), WriteTwo.thePage(data),
        WriteDivices.thePage(data), WriteFinal.thePage(data)
        );
    }

    @Then("^he enters the uTest page$")
    public void heEntersTheUTestPage(List<UtestData> data)  throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respon.toThe(data)));

    }
}
