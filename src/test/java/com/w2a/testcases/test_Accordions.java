package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.AccordionsPage;
import com.w2a.PO.BrokenImagesPage;
import com.w2a.PO.BrokenLinksPage;
import com.w2a.PO.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class test_Accordions extends TestBase {

    HomePage hp;
    JavascriptExecutor jse;
    AccordionsPage ap;

    @Test
    public void testAccordionsLinks() throws InterruptedException, IOException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(1000);
        hp.selectAccordionsLinks();
        ap = new AccordionsPage(driver);
        ap.selectIconAccordion();
        String text = ap.getTextFromAccordionComponent();
        Assert.assertEquals(text, "This is an accordion item.");
        Thread.sleep(2000);

    }
}
