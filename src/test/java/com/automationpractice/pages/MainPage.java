package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private final By loginButton = By.cssSelector("a.login");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean loginButtonIsPresent() {
        return elementIsPresent("LOGIN BUTTON IS PRESENT", loginButton);
    }

    public void clickLoginButton() {
        actionClickElement("CLICK ON LOGIN ITEM", loginButton, 10);
    }
}
