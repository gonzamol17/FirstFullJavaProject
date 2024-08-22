package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.BrokenImagesPage;
import com.w2a.PO.BrokenLinksPage;
import com.w2a.PO.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class test_AN_BrokenLinks extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    BrokenLinksPage blp;

    @Test
    public void testBrokenLinks() throws InterruptedException, IOException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1800)");
        Thread.sleep(1000);
        hp.selectBrokenLinks();
        blp = new BrokenLinksPage(driver);
        blp.verifyNumberOfLinksBroken();
        //System.out.println(code);
        //Assert.assertEquals(code, 400);
        Thread.sleep(1000);

    }
}
