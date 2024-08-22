package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.FormsFieldPage;
import com.w2a.PO.HomePage;
import com.w2a.PO.ModalsPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_Modals extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    ModalsPage mp;


    @Test
    public void testModals() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        hp.selectModals();
        mp = new ModalsPage(driver);
        mp.selectSimpleModal();
        Thread.sleep(1000);
        System.out.println(mp.handleSimpleTitleModal());
        System.out.println(mp.handleSimpleBodyModal());
        Thread.sleep(1000);
        mp.closeSimpleModal();
        Thread.sleep(1000);
        mp.selectFormModal();
        String name = "Pedro";
        String email = "pedro@gmail.com";
        String message = "Este es el primer mensajes agregado";
        mp.fillFormModal(name, email, message);
        Thread.sleep(1000);
        Assert.assertTrue(mp.getEvidenceAfterCloseFormModal().toLowerCase().contains("click to see"));
        Thread.sleep(1000);

    }
}
