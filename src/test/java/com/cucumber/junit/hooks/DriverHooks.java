package com.cucumber.junit.hooks;

import com.cucumber.junit.driver.DriverManager;
import org.junit.After;
import org.junit.Before;

public class DriverHooks {

    @Before
    public void setupDriver(){
        DriverManager.setupDriver();
    }
    @After
    public void quitDriver(){
        DriverManager.quitDriver();
    }
}
