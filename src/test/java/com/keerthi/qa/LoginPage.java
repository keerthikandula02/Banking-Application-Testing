package com.keerthi.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By username = By.name("username");
    private final By password = By.name("password");
    private final By loginButton = By.cssSelector("input[value='Log In']");
    private final By errorMessage = By.cssSelector(".error");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    public boolean isLoginErrorDisplayed() {
        return driver.findElements(errorMessage).stream().anyMatch(e -> e.isDisplayed());
    }
}