package com.hakan.hepsiburadaProje;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;


public class searchPage {


    WebDriver driver;

    public searchPage(WebDriver driver) {

        this.driver = driver;
    }

    public void search(String text) {

        driver.get("https://www.hepsiburada.com");

        WebElement searchAreaElement = driver.findElement(By.id("productSearch"));

        searchAreaElement.sendKeys(text);
        searchAreaElement.sendKeys(Keys.ENTER);

        Assert.assertTrue(driver.getTitle().startsWith(text));

    }
}
