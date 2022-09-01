package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;

public class HomePage extends BasePage{
    public static final String CUCUMBER_URL = "https://cucumber.io/";
    public static final String TEXT_PATTERN = "%s[contains(text(),'%s')]";
    public static final String MENU_SECTION = "//*[@class='nav-link dropdown-toggle']";
    public static final String DROPDOWN_MENU = "//*[@href='/docs/gherkin/']";

    public void openPage(){
        DriverManager.getDriver().get(CUCUMBER_URL);
    }

    public WebElement menuSection(String linkText){
        return findElement(By.xpath(format(TEXT_PATTERN, MENU_SECTION, linkText)));
    }
    public WebElement menuChildItem(String linkText){
        return findElement(By.xpath(format(TEXT_PATTERN, DROPDOWN_MENU, linkText)));
    }

}
