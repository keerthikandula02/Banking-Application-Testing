package com.keerthi.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage {
    private final WebDriver driver;
    private final By accountsOverview = By.linkText("Accounts Overview");
    private final By transferFunds = By.linkText("Transfer Funds");
    private final By logout = By.linkText("Log Out");

    public AccountsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openAccountsOverview() {
        driver.findElement(accountsOverview).click();
    }

    public void openTransferFunds() {
        driver.findElement(transferFunds).click();
    }

    public void logout() {
        driver.findElement(logout).click();
    }
}