package com.hakan.hepsiburadaProje;

import org.junit.Test;

public class pageTests extends pageSetUps {

    @Test
    public void shoppingTest(){
        new loginPage(driver).login("asdas@das.com", "asdasasdas");
        new loginPage(driver).addToBasket("hakan", "erkan", "shire", "baggend", "23212333");

    }

    @Test
    public void search() {
        new searchPage(driver).search("iphone");

    }

}