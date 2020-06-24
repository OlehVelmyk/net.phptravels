package com.automationpractice.tests;

import com.automationpractice.logging.CustomReporter;
import com.automationpractice.logging.EventHandler;
import com.automationpractice.pages.MainPage;
import com.automationpractice.utils.DriverFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected EventFiringWebDriver driver;
    private String baseUrl = "http://automationpractice.com/index.php";
    protected String logoutUrl = "http://automationpractice.com/index.php?mylogout=";

    @BeforeClass
    @Parameters("browser")
    public void setUpDriver(@Optional("chrome") String browser) {
        driver = new EventFiringWebDriver(DriverFactory.initDriver(browser));
        driver.register(new EventHandler());

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void goToPage() {
        CustomReporter.logAction("GO TO " + baseUrl);
        driver.get(baseUrl);
        Assert.assertEquals(driver.getCurrentUrl(), baseUrl);
    }

    protected void logout() {
        MainPage mainPage = new MainPage(driver);
        CustomReporter.logAction("GO TO " + logoutUrl);
        driver.get(logoutUrl);
        Assert.assertTrue(mainPage.loginButtonIsPresent(), "Element isn't present on the page");
    }
}
