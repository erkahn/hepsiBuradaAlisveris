package com.hakan.hepsiburadaProje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class loginPage {

    WebDriver webDriver;
    WebDriverWait webDriverWait;
    WebDriver driver;

    public loginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.driver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 30, 150);
    }

    public void login(String username, String password) {
        webDriver.get("https://www.hepsiburada.com/");
        sleep(3);
        webDriver.findElement(By.cssSelector(".insider-opt-in-notification-button.insider-opt-in-disallow-button")).click();
        WebElement mainLoginButton = webDriver.findElement(By.id("myAccount"));
        mainLoginButton.click();

        Actions actions = new Actions(webDriver);
        actions.moveToElement(mainLoginButton).build().perform();

        WebElement loginElement = webDriver.findElement(By.cssSelector("#login"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(loginElement)).click();
        sleep(3);
        webDriver.findElement(By.id("email")).sendKeys(username);
        webDriver.findElement(By.id("password")).sendKeys(password);
        sleep(3);
        webDriver.findElement(By.cssSelector(".btn.full.btn-login-submit")).click();

        System.out.println("giris basarili");
    }

    public void addToBasket(String name, String surname, String adres, String adres_2, String telefon) {

        webDriver.get("https://www.hepsiburada.com/ara?q=iphone");
        webDriver.findElement(By.className("hb-pl-cn")).click();

        WebElement addButton = webDriver.findElement(By.id("addToCart"));
        addButton.click();
        sleep(3);

        WebElement completeButton = webDriver.findElement(By.className("cart-proceed-container"));
        completeButton.click();
        sleep(3);

        driver.findElement(By.id("first-name")).sendKeys(name);
        driver.findElement(By.id("last-name")).sendKeys(surname);
        driver.findElement(By.id("address")).sendKeys(adres);
        driver.findElement(By.id("address-name")).sendKeys(adres_2);
        driver.findElement(By.id("phone")).sendKeys(telefon);
        sleep(3);

        webDriverWait.withTimeout(15000, TimeUnit.MILLISECONDS);
        System.out.println("alisveris bitti");

    }

    public void sleep(int second){
        try {
            Thread.sleep(second*1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
