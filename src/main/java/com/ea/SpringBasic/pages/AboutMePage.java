package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;

@Component
public class AboutMePage extends BasePage {


    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public void test() throws MalformedURLException {

        System.out.println(" ");
        System.out.println("ON THE ABOUT ME PAGE");
        System.out.println(driver.getCurrentUrl());
    }

}
