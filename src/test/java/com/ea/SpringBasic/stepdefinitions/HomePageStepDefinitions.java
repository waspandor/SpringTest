package com.ea.SpringBasic.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDefinitions extends AbstractPageStepDefinitions {

    @Before
    public void setUp() throws Throwable {

        homePage.setDriver(getDriver());
    }


    @Given("^User navigates to the HomePage$")
    public void user_navigates_to_the_homepage() throws Throwable {

        homePage.navigateToHomePage();
    }


    @Then("^Clicks on the About Me page$")
    public void clicks_on_the_about_me_page() throws Throwable {

        homePage.clickAboutMe();
    }

}
