package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.AdsPage;
import com.w2a.PO.BrokenImagesPage;
import com.w2a.PO.HomePage;
import com.w2a.PO.IframesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.http.HttpClient;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class test_AN_BrokenImages extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    BrokenImagesPage bip;

    @Test
    public void testBrokenImages() throws InterruptedException, IOException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1800)");
        Thread.sleep(1000);
        hp.selectBrokenImages();
        bip = new BrokenImagesPage(driver);
        bip.verifyNumberOfImages();
        Thread.sleep(1000);

   }

}
