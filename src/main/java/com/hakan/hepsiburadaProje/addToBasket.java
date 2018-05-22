package com.hakan.hepsiburadaProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class addToBasket extends loginPage {

    public addToBasket(WebDriver webDriver) {
        super(webDriver);
    }

    public void addToBasket() {

        this.webDriver = webDriver;
        this.driver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 30, 150);
    }
}
