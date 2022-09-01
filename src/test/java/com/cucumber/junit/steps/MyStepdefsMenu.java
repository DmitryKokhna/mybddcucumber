package com.cucumber.junit.steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefsMenu {
    @When("the user opens Cucumber website")
    public void openCucumberWebsite() {
    }

    @When("the user clicks on the {string} section")
    public void clickOnSection(String section) {
    }

    @When("the user clicks on the {string} item")
    public void clickOnItem(String item) {
    }

    @Then("page with title {string}  is displayed")
    public void pageDisplayed(String pageTitle) {
    }
}
