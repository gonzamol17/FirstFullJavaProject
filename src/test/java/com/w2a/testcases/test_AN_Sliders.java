package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.JavaScriptDelayPage;
import com.w2a.PO.SlidersPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_Sliders extends TestBase {

    HomePage hp;
    SlidersPage sp;

    @Test
    public void testSliders() throws InterruptedException {
        hp = new HomePage(driver);
        WebElement cookies = hp.getCookies();
        hp.acceptCookies();
        Thread.sleep(2000);
        hp.selectSliders();
        sp = new SlidersPage(driver);
        Assert.assertEquals(sp.mainTitle(),"Slider");
        sp.moveSlider(150);
        Thread.sleep(2000);
        System.out.println("El resultado de pixeles desplazados es: "+sp.getResultNumber());

    }
}
