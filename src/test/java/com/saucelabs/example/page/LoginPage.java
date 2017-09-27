package com.saucelabs.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by grago on 27.09.17.
 */
public class LoginPage extends AbstractPage {

    @FindBy(id = "wpName1")
    private WebElement usernameField;

    @FindBy(id = "wpPassword1")
    private WebElement passwordField;

    @FindBy(id = "wpLoginAttempt")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void performLogin(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }



}
