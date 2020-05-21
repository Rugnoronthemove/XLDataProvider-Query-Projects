package com.demoaut.newtours.cucumber.stepdefs;

import com.cucumber.listener.Reporter;
import com.demoaut.newtours.pages.HomePage;
import com.demoaut.newtours.pages.SignOnPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignOnSteps {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog(" I am on HomePage: "+" http://newtours.demoaut.com/ ");
    }

    @When("^I click on Sign-On link$")
    public void iClickOnSignOnLink() {
        new HomePage().clickOnSignOnLink();
    }

    @Then("^I should navigate to Sign-On page and see the following text \"([^\"]*)\"$")
    public void iShouldNavigateToSignOnPageAndSeeTheFollowingText(String signOnText) {
        new SignOnPage().verifySignOnText(signOnText);
    }
}
