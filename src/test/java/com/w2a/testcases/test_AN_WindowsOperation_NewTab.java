package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.WindowsOperationPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_WindowsOperation_NewTab extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    WindowsOperationPage wop;


    @Test
    public void testWindowsOperation_NewTab() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)");
        Thread.sleep(1000);
        hp.selectWindowsOperation();
        Thread.sleep(1000);
        wop = new WindowsOperationPage(driver);
        wop.selectNewBtn();
        String originHandle = wop.showTheURLFromNewWindows();
        wop.selectConsentirBtn();
        Assert.assertEquals(wop.verifyTheTitleForSecondWindow(), "Start learning");
        Thread.sleep(1000);
        Assert.assertEquals(wop.showTheOriginalUrl(originHandle), "https://practice-automation.com/window-operations/");
        Thread.sleep(1000);

    }
}
