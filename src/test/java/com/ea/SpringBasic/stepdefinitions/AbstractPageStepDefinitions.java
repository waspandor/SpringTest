package com.ea.SpringBasic.stepdefinitions;

import com.ea.SpringBasic.libraries.WebDriverLibrary;
import com.ea.SpringBasic.pages.AboutMePage;
import com.ea.SpringBasic.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = TestConfiguration.class)
@SpringBootTest
public class AbstractPageStepDefinitions {

    @Autowired
    WebDriverLibrary webDriverLibrary;

    @Autowired
    HomePage homePage;

    @Autowired
    AboutMePage aboutMePage;

    protected static WebDriver driver;


    protected WebDriver getDriver() throws Throwable {

        if (driver == null) {

            driver = webDriverLibrary.startDriver();
        }
        return driver;
    }
}

