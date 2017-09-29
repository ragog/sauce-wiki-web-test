package com.saucelabs.example;

import com.saucelabs.example.data.Credentials;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WikiTest extends AbstractTest {

    @Test
    public void seleniumWikiNavigationTest() {

        wikipedia.homePage().performSearch("Selenium (software)");
        wikipedia.frontPage().navigateToLogin();
        wikipedia.loginPage().performLogin(Credentials.USER_VALID);
        wikipedia.frontPage().performSearch("appium");
        wikipedia.articlePage().navigateToPageByLinkTitle("Test automation");
        assertTrue(wikipedia.articlePage().isLinkShown("Continuous delivery"));

    }

    @Test
    public void loginWithInvalidPassword() {

        wikipedia.homePage().navigateToEnglishWikipedia();
        wikipedia.frontPage().navigateToLogin();
        wikipedia.loginPage().performLogin(Credentials.USER_INVALID_PASSWORD);
        assertTrue(wikipedia.loginPage().isErrorMessageDisplayed("Incorrect password entered. Please try again."));
        assertTrue(wikipedia.loginPage().isActive());

    }

    @Test
    public void loginWithValidCredentials() {

        wikipedia.homePage().navigateToEnglishWikipedia();
        wikipedia.frontPage().navigateToLogin();
        wikipedia.loginPage().performLogin(Credentials.USER_VALID);
        assertTrue(wikipedia.frontPage().isActive());

    }

}
