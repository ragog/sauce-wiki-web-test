package com.saucelabs.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by grago on 27.09.17.
 */
public class ArticlePage extends AbstractPage {

    public ArticlePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToPageByLinkTitle(String title) {
        driver.findElement(By.xpath("//a[@title='" + title + "']"));
    }

    public boolean isLinkShown(String title) {
        try {
            driver.findElement(By.xpath("//a[@title='Continuous delivery']"));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
