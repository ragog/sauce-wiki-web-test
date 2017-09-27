package com.saucelabs.example;

import com.saucelabs.example.page.ArticlePage;
import com.saucelabs.example.page.FrontPage;
import com.saucelabs.example.page.HomePage;
import com.saucelabs.example.page.LoginPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by grago on 27.09.17.
 */
public class Wikipedia {

    private WebDriver driver;

    public Wikipedia(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() { return new HomePage(driver); }
    public FrontPage frontPage() { return new FrontPage(driver); }
    public LoginPage loginPage() { return new LoginPage(driver); }
    public ArticlePage articlePage() { return new ArticlePage(driver); }

}
