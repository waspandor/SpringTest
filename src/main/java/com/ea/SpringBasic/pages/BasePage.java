package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasePage {

    protected WebDriver driver;


    @Value("${app.url}")
    String appUrl;

    @Value("${env}")
    String env;

}
