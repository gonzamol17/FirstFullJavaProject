package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.FormsFieldPage;
import com.w2a.PO.HomePage;
import com.w2a.PO.JavaScriptDelayPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_FormField extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    FormsFieldPage ffp;

    @Test
    public void testFormField() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        Thread.sleep(500);
        hp.selectFormField();
        ffp = new FormsFieldPage(driver);
        ffp.completeName("Pedro");
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
        String pro1 = "Milk";
        String pro2 = "Ctrl-Alt-Delight";
        ffp.selectSomeCheckboxes(pro1, pro2);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
        String color = "Green";
        ffp.selectOneRadioButton(color);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
        String option = "Yes";
        ffp.selectSibling(option);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
        ffp.getListFastAnimals();
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
        ffp.sendEmailAddress("pepe@gmail.com");
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(200);
        ffp.sendMessage("Esto es para completar una prueba, pero que no es lo definitivo");
        String messageText = ffp.selectBtnSubmit();
        driver.switchTo().alert().accept();
        Assert.assertEquals(messageText, "Message received!");

    }
}
