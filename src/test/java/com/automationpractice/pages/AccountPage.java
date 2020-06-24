package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountPage extends BasePage {
    private final By logoutButton = By.cssSelector("a.logout");

    LoginPage loginPage = new LoginPage(driver);

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean logoutButtonIsPresent() {
        return elementIsPresent("LOGOUT BUTTON IS PRESENT", logoutButton);
    }

    public void clickLogoutButton() {
        actionClickElement("CLICK ON LOGOUT BUTTON", logoutButton, 10);
        Assert.assertTrue(loginPage.SignInButtonIsPresent(), "Element isn't present on the page");
    }
}
