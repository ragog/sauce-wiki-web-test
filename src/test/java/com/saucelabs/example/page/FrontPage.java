package com.saucelabs.example.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by grago on 27.09.17.
 */
public class FrontPage extends AbstractPage {

    @FindBy(id = "pt-login")
    private WebElement loginLabel;

    @FindBy(id = "searchInput")
    private WebElement searchBar;

    public FrontPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToLogin() {
        loginLabel.click();
    }

    public void performSearch(String searchString) {
        searchBar.sendKeys(searchString);
        searchBar.sendKeys(Keys.ENTER);
    }

}
