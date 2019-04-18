package stepdefinitions;

import configs.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import java.security.PublicKey;


public class MediumSearch {

    HomePage homePage;


    @Given("^the medium site is up$")
    public void openApp() {
        System.out.println("Given");
    }


    @Given("the user has already navigated to the site")
    public void navigateToURL(){
        Hooks.driver.get(Constants.URL);
    }



    @When("^the onezero button is clicked")
    public void clickSearchButton() {
        homePage = new HomePage(Hooks.driver);
        homePage.clickOnOneZero();
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
