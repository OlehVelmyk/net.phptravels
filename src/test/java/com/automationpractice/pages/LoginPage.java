package com.automationpractice.pages;

import com.automationpractice.dataProvider.LoginDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By emailField = By.id("email");
    private final By passwordField = By.id("passwd");
    private final By signInButton = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean SignInButtonIsPresent() {
        return elementIsPresent("SIGN IN BUTTON IS PRESENT", signInButton);
    }

    public void fillEmailField() {
        actionFillField("FILL IN EMAIL FIELD", emailField, LoginDataProvider.email, 10);
    }

    public void fillPasswordField() {
        actionFillField("FILL IN PASSWORD FIELD", passwordField, LoginDataProvider.password, 10);
    }

    public void clickSignInButton() {
        actionClickElement("CLICK ON SIGN IN BUTTON", signInButton, 10);
    }

    public void login() {
        fillEmailField();
        fillPasswordField();
        clickSignInButton();
    }
}
