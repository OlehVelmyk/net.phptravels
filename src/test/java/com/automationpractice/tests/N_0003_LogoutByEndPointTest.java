package com.automationpractice.tests;

import com.automationpractice.actionHelpers.LoginHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class N_0003_LogoutByEndPointTest extends BaseTest {

    @BeforeMethod
    public void loginWithCredentials() {
        LoginHelper loginHelper = new LoginHelper(driver);

        goToPage();
        loginHelper.login();
    }

    @Test
    public void logoutByEndPoint() {
        logout();
    }
}
