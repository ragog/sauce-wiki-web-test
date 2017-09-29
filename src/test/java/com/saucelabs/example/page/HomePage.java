package com.saucelabs.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by grago on 27.09.17.
 */
public class HomePage extends AbstractPage {

    @FindBy(id = "searchInput")
    private WebElement searchBar;

    @FindBy(css = "button.pure-button.pure-button-primary-progressive")
    private WebElement searchButton;

    @FindBy(id = "js-link-box-en")
    private WebElement englishWikiLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void performSearch(String searchString) {
        searchBar.sendKeys(searchString);
        searchButton.click();
    }

    public void navigateToEnglishWikipedia() {
        englishWikiLink.click();
    }

}
