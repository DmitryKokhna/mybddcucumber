package com.cucumber.junit.hooks;

import com.cucumber.junit.driver.DriverManager;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotHook {
    @After
    public void takeScreenshot(Scenario scenario){
    //  scenario.write(DriverManager.getDriver().getCurrentUrl()); // WRITE depreceted
        scenario.attach("docx","jpg","naneAttachment");
        byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.getUri();
    }
}
