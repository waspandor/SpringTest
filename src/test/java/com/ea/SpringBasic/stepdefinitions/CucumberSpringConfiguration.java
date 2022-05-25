package com.ea.SpringBasic.stepdefinitions;

import com.ea.SpringBasic.FeatureTestRunner;
import com.ea.SpringBasic.SpringBasicApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBasicApplication.class)
public class CucumberSpringConfiguration { }