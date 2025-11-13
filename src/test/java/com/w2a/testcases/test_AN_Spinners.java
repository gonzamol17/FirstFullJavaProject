package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.PopUpPage;
import com.w2a.PO.SlidersPage;
import com.w2a.PO.SpinnerPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_Spinners extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    SpinnerPage spp;



    @Test
    public void testSpinners() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1400)");
        Thread.sleep(1000);
        hp.selectSpinners();
        spp = new SpinnerPage(driver);
        try {
            Assert.assertTrue(spp.ifSpinnerIsVisibleOrNot());
            System.out.println("El spinner se pudo visualizar, muchas gracias a todos");
        } catch (Exception e) {
            System.out.println("No apareció el spinner");
        }
        Thread.sleep(2000);




    }
}
