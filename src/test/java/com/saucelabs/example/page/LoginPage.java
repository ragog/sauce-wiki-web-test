package com.saucelabs.example.page;

import com.saucelabs.example.data.Credentials;
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

    @FindBy(xpath = "//div[@class='mw-parser-output']/p")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void performLogin(Credentials credentials) {
        usernameField.sendKeys(credentials.username);
        passwordField.sendKeys(credentials.password);
        loginButton.click();
    }

    public boolean isErrorMessageDisplayed(String expectedErrorMessage) {
        return errorMessage.getText().trim().equals(expectedErrorMessage);
    }

    public boolean isActive() {
        return loginButton.isDisplayed();
    }

}
