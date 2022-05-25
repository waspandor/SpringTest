//package com.ea.SpringBasic;
//
//import com.ea.SpringBasic.libraries.WebDriverLibrary;
//import com.ea.SpringBasic.pages.AboutMePage;
//import com.ea.SpringBasic.pages.HomePage;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Profile;
//
//import java.util.List;
//
//@SpringBootTest
//@Profile("qa")
//class SpringBasicApplicationTests {
//
//
////	@Autowired
////	WebDriverLibrary webDriverLibrary;
////
////	@Autowired
////	HomePage homePage;
////
////	@Autowired
////	AboutMePage aboutMePage;
//
////	@Value("${app.url}")
////	private String appUrl;
//
////	@Value("chrome,firefox,edge")
////	private List<String> browsers;
//
//
////	protected static WebDriver driver;
////
////
////	protected WebDriver getDriver() throws Throwable {
////
////		if (driver == null) {
////
////			driver = webDriverLibrary.startDriver();
////		}
////		return driver;
////	}
//
//
////	@Test
////	void contextLoads() throws Throwable {
////
////		homePage.setDriver(getDriver());
////		homePage.navigateToHomePage();
////
////		aboutMePage.setDriver(getDriver());
////		aboutMePage.test();
////
////		driver = getDriver();
////		driver.quit();
////
////	}
//
//}
