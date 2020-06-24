package com.automationpractice.tests;

import com.automationpractice.actionHelpers.LoginHelper;
import org.testng.annotations.Test;

public class N_0001_LoginTest extends BaseTest {

    @Test
    public void loginWithCorrectCredentials() {
        LoginHelper loginHelper = new LoginHelper(driver);

        goToPage();
        loginHelper.login();
    }
}
