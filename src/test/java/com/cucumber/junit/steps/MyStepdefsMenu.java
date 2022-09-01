package com.cucumber.junit.steps;


import com.cucumber.junit.pages.DocsPage;
import com.cucumber.junit.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;


public class MyStepdefsMenu {

    private HomePage homePage = new HomePage();
    private DocsPage docsPage = new DocsPage();

    @When("the user opens Cucumber website")
    public void openCucumberWebsite() {
        homePage.openPage();
    }

    @When("the user clicks on the {string} section")
    public void clickOnSection(String section) {
        homePage.menuSection(section).click();
    }

    @When("the user clicks on the {string} item")
    public void clickOnItem(String item) {
        homePage.menuChildItem(item).click();
    }

    @Then("page with title {string}  is displayed")
    public void pageDisplayed(String pageTitle) {
        Assertions.assertThat(docsPage.isPageWithTitleDisplayed(pageTitle)).
                overridingErrorMessage("Страница с названием %s не открыта", pageTitle).isTrue();
    }
}
