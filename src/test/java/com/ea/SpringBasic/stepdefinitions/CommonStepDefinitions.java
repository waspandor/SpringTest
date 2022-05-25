package com.ea.SpringBasic.stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class CommonStepDefinitions extends AbstractPageStepDefinitions {

    @Before
    public void setUp() throws Throwable {

        homePage.setDriver(getDriver());
    }


    @Then("^searches for Test$")
    public void searches_for_test() throws Throwable {

        //homePage.search("Test");
    }


    @After
    public void cleanUp() throws Throwable {

        driver = getDriver();
        if (driver == null) {
            return;
        }
        driver.quit();
        driver = null;
    }

}
