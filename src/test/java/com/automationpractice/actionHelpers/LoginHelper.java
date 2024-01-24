package com.automationpractice.actionHelpers;

import com.automationpractice.pages.AccountPage;
import com.automationpractice.pages.MainPage;
import com.automationpractice.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginHelper {
    protected WebDriver driver;

    public LoginHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        mainPage.clickAccountButton();
        mainPage.clickLoginButton();
        Assert.assertTrue(loginPage.signInButtonIsPresent(), "Element isn't present on the page");
        loginPage.login();
        Assert.assertTrue(accountPage.logoutButtonIsPresent(), "Element isn't present on the page");
    }
}