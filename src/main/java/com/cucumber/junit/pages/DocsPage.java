package com.cucumber.junit.pages;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class DocsPage extends BasePage{

    private static final String PAGE_TITLE = "//*[@class='title is-1' and text()='Gherkin Syntax']";

    public boolean isPageWithTitleDisplayed(String title){
        return isElementDisplayed(By.xpath(PAGE_TITLE));
    }
}
