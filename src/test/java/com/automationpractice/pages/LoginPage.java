package com.automationpractice.pages;

import com.automationpractice.dataProvider.LoginDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By signInButton = By.id("submitBTN");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

   public boolean signInButtonIsPresent() {
        return elementIsPresent("SIGN IN BUTTON IS PRESENT", signInButton);
    }

    public void fillEmailField() {
        actionFillField("FILL IN EMAIL FIELD", emailField, LoginDataProvider.email, timeoutCommon);
    }

    public void fillPasswordField() {
        actionFillField("FILL IN PASSWORD FIELD", passwordField, LoginDataProvider.password, timeoutCommon);
    }

    public void clickSignInButton() {
        actionClickElement("CLICK ON SIGN IN BUTTON", signInButton, timeoutCommon);
    }

    public void login() {
        fillEmailField();
        fillPasswordField();
        clickSignInButton();
    }
}
