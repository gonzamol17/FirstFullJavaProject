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
        Thread.sleep(500);
        hp.selectModals();
        mp = new ModalsPage(driver);
        mp.selectSimpleModal();
        System.out.println(mp.handleSimpleTitleModal());
        System.out.println(mp.handleSimpleBodyModal());
        mp.closeSimpleModal();
        mp.selectFormModal();
        String name = "Pedro";
        String email = "pedro@gmail.com";
        String message = "Este es el primer mensajes agregado";
        mp.fillFormModal(name, email, message);
        Assert.assertTrue(mp.getEvidenceAfterCloseFormModal().toLowerCase().contains("click to see"));

    }
}
