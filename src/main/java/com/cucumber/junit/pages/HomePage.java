package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;

public class HomePage extends BasePage{
    public static final String CUCUMBER_URL = "https://cucumber.io/";
    public static final String TEXT_PATTERN = "%s[contains(text(),'%s')]";
    public static final String MENU_SECTION = "//*[contains(@class,'nav-link')]";
    public static final String CHILD_DROPDOWN_MENU = "//*[contains(@class),'dropdown')]//*contains(@class,'item')]";


    public void openCucumberPage(){
        DriverManager.getDriver().get(CUCUMBER_URL);
    }

    public WebElement menuSection(String linkText){
        return findElement(By.xpath(format(TEXT_PATTERN, MENU_SECTION, linkText)));
    }
    public WebElement menuChildItem(String linkText){
        return findElement(By.xpath(format(TEXT_PATTERN, CHILD_DROPDOWN_MENU, linkText)));
    }

}
