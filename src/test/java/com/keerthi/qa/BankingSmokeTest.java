package com.keerthi.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankingSmokeTest extends BaseTest {

    @Test
    void validLoginShouldOpenAccountOverview() {
        setUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("john", "demo");
        Assertions.assertTrue(driver.getTitle().contains("ParaBank"), "ParaBank page should be displayed after login");
        Assertions.assertTrue(driver.getPageSource().contains("Accounts Overview"), "Account services should be available");
    }

    @Test
    void invalidLoginShouldShowError() {
        setUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_user", "invalid_password");
        Assertions.assertTrue(loginPage.isLoginErrorDisplayed(), "Invalid login should display an error");
    }

    @Test
    void loggedInUserShouldAccessTransferFunds() {
        setUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("john", "demo");
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openTransferFunds();
        Assertions.assertTrue(driver.getPageSource().contains("Transfer Funds"), "Transfer Funds page should be displayed");
    }
}