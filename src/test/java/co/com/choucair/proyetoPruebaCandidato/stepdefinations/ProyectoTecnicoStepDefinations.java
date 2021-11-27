package co.com.choucair.proyetoPruebaCandidato.stepdefinations;

import co.com.choucair.proyetoPruebaCandidato.questions.Answer;
import co.com.choucair.proyetoPruebaCandidato.tasks.OpenUp;
import co.com.choucair.proyetoPruebaCandidato.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ProyectoTecnicoStepDefinations {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Alvaro wants to enter the user registration url$")
    public void thatAlvaroWantsToEnterTheUserRegistrationUrl() {
        OnStage.theActorCalled("Alvaro").wasAbleTo(OpenUp.thePage());
    }


    @When("^enter all the appropriate data for user registration on the Utest platform$")
    public void enterAllTheAppropriateDataForUserRegistrationOnTheUtestPlatform() {
        OnStage.theActorCalled("Alvaro").wasAbleTo(RegisterUser.thePage());
    }

    @Then("^verify that the registration is complete$")
    public void verifyThatTheRegistrationIsComplete() {

    }


}
