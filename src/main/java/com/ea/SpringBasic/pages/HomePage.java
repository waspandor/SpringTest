package com.ea.SpringBasic.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;

@Component
public class HomePage extends BasePage {


    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToHomePage() throws MalformedURLException {

        driver.get(appUrl);
        System.out.println(" ");
        System.out.println("TESTING AGAINST --> " + env);
        System.out.println(" ");
        System.out.println("ON THE HOMEPAGE");

    }


    public void clickAboutMe() throws MalformedURLException {

        System.out.println("");
        System.out.println("CLICK ABOUT ME");
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/nav/ul/li/a")).click();
    }

}


