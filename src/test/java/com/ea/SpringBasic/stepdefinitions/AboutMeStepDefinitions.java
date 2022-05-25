package com.ea.SpringBasic.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;

public class AboutMeStepDefinitions extends AbstractPageStepDefinitions {

    @Before
    public void setUp() throws Throwable {

        aboutMePage.setDriver(getDriver());
    }


    @Then("^test$")
    public void test() throws Throwable {

        aboutMePage.test();
    }


    @Then("^click somewhere else$")
    public void click_somewhere_else() throws Throwable {

        aboutMePage.test();
    }



}
