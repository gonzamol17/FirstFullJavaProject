package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.JavaScriptDelayPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class test_AN_jsDelays extends TestBase {
    HomePage hp;
    JavaScriptDelayPage jsdp;
    JavascriptExecutor jse;



    @Test
    public void testDelays() throws InterruptedException {
        hp = new HomePage(driver);
        //WebElement cookies = hp.getCookies();
        //WebDriverWait wait = new WebDriverWait(driver, 4);
        //wait.until(ExpectedConditions.elementToBeClickable(cookies));
        //hp.acceptCookies();
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        hp.selectJSDealys();
        jsdp = new JavaScriptDelayPage(driver);
        System.out.println("El título de la página principal es: " + jsdp.mainTitle());
        Assert.assertEquals(jsdp.btnStartColor(), "rgba(0, 170, 239, 1)");
        System.out.println("El color del botón start es celeste");
        System.out.println("El texto dentro del campo antes de seleccionar el botón Start: "+jsdp.getTextOnTextField());
        jsdp.clickBtnStart();
        System.out.println("El texto dentro del campo despues de seleccionar el botón Start: "+jsdp.getTextOnTextField());
        Thread.sleep(2000);
    }
}
