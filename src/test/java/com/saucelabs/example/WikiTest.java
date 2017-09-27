package com.saucelabs.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiTest extends AbstractTest {

    @Test
    public void seleniumWikiTest() {

        wikipedia.homePage().performSearch("Selenium (software)");
        wikipedia.frontPage().navigateToLogin();
        wikipedia.loginPage().performLogin("sauce-example", "funkybob");
        wikipedia.frontPage().performSearch("appium");
        wikipedia.articlePage().navigateToPageByLinkTitle("Test automation");
        Assert.assertTrue(wikipedia.articlePage().isLinkShown("Continuous delivery"));

    }

}
