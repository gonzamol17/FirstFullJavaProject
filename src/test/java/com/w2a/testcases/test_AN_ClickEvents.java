package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.ClickEventsPage;
import com.w2a.PO.FileDownloadPage;
import com.w2a.PO.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_ClickEvents extends TestBase {

    HomePage hp;
    JavascriptExecutor jse;
    ClickEventsPage cep;

    @Test
    public void testClickEvents() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1400)");
        Thread.sleep(1000);
        hp.selectClickEvents();
        cep = new ClickEventsPage(driver);
        cep.selectBtnCat();
        Assert.assertEquals(cep.getSoundFromAnimal(), "Meow!");
        System.out.println("Se está visualizando el sonido del gato: "+cep.getSoundFromAnimal());
        Thread.sleep(1000);
        cep.selectBtnPig();
        Assert.assertEquals(cep.getSoundFromAnimal(), "Oink!");
        System.out.println("Se está visualizando el sonido del Chancho: "+cep.getSoundFromAnimal());
        Thread.sleep(1000);
        cep.selectBtnDog();
        Assert.assertEquals(cep.getSoundFromAnimal(), "Woof!");
        System.out.println("Se está visualizando el sonido del Perro: "+cep.getSoundFromAnimal());
        Thread.sleep(1000);
        cep.selectBtnCow();
        Assert.assertEquals(cep.getSoundFromAnimal(), "Moo!");
        System.out.println("Se está visualizando el sonido de la Vaca: "+cep.getSoundFromAnimal());
        Thread.sleep(1000);





    }
}
