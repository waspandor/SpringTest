package com.ea.SpringBasic.libraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;

@Configuration
public class WebDriverLibrary {

    @Value("${browser}")
    private String browser;

    public WebDriver startDriver() throws MalformedURLException {

        System.out.println("");
        System.out.println("UISNG THE FOLLOWING BROWSER --> " + browser );
        System.out.println("");

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }


}
