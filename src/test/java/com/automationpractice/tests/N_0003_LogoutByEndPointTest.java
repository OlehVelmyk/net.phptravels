package com.automationpractice.tests;

import com.automationpractice.actionHelpers.LoginHelper;
import com.automationpractice.pages.AccountPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class N_0003_LogoutByEndPointTest extends BaseTest {

    @BeforeMethod
    public void loginWithCredentials() {
        LoginHelper loginHelper = new LoginHelper(driver);

        goToPage();
        loginHelper.login();
    }

    @Test(dependsOnMethods = "loginWithCredentials")
    public void logoutByEndPoint() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickAccountButton();
        accountPage.clickLogoutButton();
        Assert.assertEquals(driver.getCurrentUrl(), baseUrl);
    }
}
