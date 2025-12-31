package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.HoverPage;
import com.w2a.PO.IframesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_Iframes extends TestBase {

    HomePage hp;
    JavascriptExecutor jse;
    IframesPage ip;

    @Test
    public void testIframes() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1800)");
        Thread.sleep(500);
        hp.selectIframes();
        ip = new IframesPage(driver);
        Assert.assertEquals(ip.showTitle(), "Iframes");
        ip.changeToIframeChild();
        Assert.assertEquals(ip.titleFromNewIframe(), "Playwright");
        driver.switchTo().defaultContent();
        Assert.assertEquals(ip.showTitle(), "Iframes");

    }

}
