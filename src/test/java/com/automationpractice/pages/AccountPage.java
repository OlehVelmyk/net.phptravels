package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountPage extends BasePage {
    private final By logoutButtonMenu = By.cssSelector("div:nth-child(2) > ul > li:nth-child(4)");
    private final  By accountButton = By.cssSelector("div.nav-item--right > ul > li:nth-child(3)");
    private final  By logoutButton = By.cssSelector("li:nth-child(3) > ul > li:nth-child(3)");

    LoginPage loginPage = new LoginPage(driver);

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean logoutButtonIsPresent() {
        return elementIsPresent("LOGOUT BUTTON IS PRESENT", logoutButtonMenu);
    }

    public void clickLogoutButtonMenu() {
        actionClickElement("CLICK ON LOGOUT BUTTON", logoutButtonMenu, timeoutCommon);
    }
    public void clickLogoutButton() {
        actionClickElement("CLICK ON LOGOUT BUTTON", logoutButton, timeoutCommon);
    }

    public void clickAccountButton() {
        actionClickElement("CLICK ON ACCOUNT BUTTON", accountButton, timeoutCommon);
        Assert.assertTrue(elementIsPresent("LOGIN BUTTON IS PRESENT", logoutButton), "Element isn't present on the page");
    }
}
