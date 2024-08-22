package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.AdsPage;
import com.w2a.PO.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_Ads extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    AdsPage ad;

    @Test
    public void testAds() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(1000);
        hp.selectAds();
        //Thread.sleep(10000);
        ad = new AdsPage(driver);
        Assert.assertEquals(ad.lblMessage(), "I am an ad.");
        ad.closePopUp();
        Assert.assertEquals(ad.titleOfAdsPage(), "Ads");
        Thread.sleep(1000);



    }
}
