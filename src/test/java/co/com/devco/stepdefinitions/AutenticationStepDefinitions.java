package co.com.devco.stepdefinitions;

import co.com.devco.questions.VarifyWith;
import co.com.devco.tasks.Login;
import co.com.devco.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutenticationStepDefinitions {

    @Given("^that (.*) wants to enter the Wordpress application$")
    public void thatBrandonWantsToEnterTheWordpressApplication(String user) {
        theActorCalled(user).wasAbleTo(OpenThe.wordpressApp());
    }

    @When("I login with the username (.*) and the password (.*)")
    public void iLoginWithTheUsernameAndThePassword(String user, String password) {
        theActorInTheSpotlight().attemptsTo(Login.with(user,password));
    }

    @Then("you should see the login in the application with the message")
    public void youShouldSeeTheLoginInTheApplicationWithTheMessageLoggedInAs() {
        theActorInTheSpotlight().should(seeThat(VarifyWith.the("appium396504399")));
    }
}
