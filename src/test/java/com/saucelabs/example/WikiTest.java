package com.saucelabs.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WikiTest extends AbstractTest {

    @Test
    public void wikiTest() {
        driver.get("https://wikipedia.org");

        driver.findElement(By.id("searchInput")).sendKeys("Selenium (software)");
        driver.findElement(By.cssSelector("button.pure-button.pure-button-primary-progressive")).click();
        driver.findElement(By.cssSelector("a.external.text")).click();

    }

}
