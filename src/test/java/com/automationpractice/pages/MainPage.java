package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPage extends BasePage {
    private final  By accountButton = By.cssSelector("div.nav-item--right > ul > li:nth-child(3)");
    private final  By loginButton = By.cssSelector("li:nth-child(3) > ul > li:nth-child(1)");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickAccountButton() {
        actionClickElement("CLICK ON ACCOUNT BUTTON", accountButton, timeoutCommon);
        Assert.assertTrue(elementIsPresent("LOGIN BUTTON IS PRESENT", loginButton), "Element isn't present on the page");
    }

    public void clickLoginButton() {
        actionClickElement("CLICK ON ACCOUNT BUTTON", loginButton, timeoutCommon);
    }
}
