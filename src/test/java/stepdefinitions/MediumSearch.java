package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.security.PublicKey;


public class MediumSearch {

    @Given("^the medium site is up$")
    public void openApp() {
        System.out.println("Given***********");

    }

    @Before
    public void navigateToURLBeforeScenario(){
        System.out.println("Before scenario");
    }


    @Given("the user has already navigated to the site")
    public void navigateToURL(){
        System.out.println("Given");
    }



    @When("^the search button is clicked and the text is types")
    public void clickSearchButton() {
        System.out.println("When*****************");
    }

    @Then("^the results are displayed")
    public void validateResults() {
        System.out.println("Then**************");

    }

    @Given("^driver is initialised")
    public void initialiseDriver(){
        System.out.println("Before feature *****************");
    }


}
