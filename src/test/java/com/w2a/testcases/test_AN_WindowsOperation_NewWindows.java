package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.WindowsOperationPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_WindowsOperation_NewWindows extends TestBase {

    HomePage hp;
    JavascriptExecutor jse;
    WindowsOperationPage wop;


    @Test
    public void testWindowsOperation_NewWindows() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)");
        Thread.sleep(500);
        hp.selectWindowsOperation();
        wop = new WindowsOperationPage(driver);
        jse.executeScript("window.scrollBy(0,200)");
        Assert.assertEquals(wop.selectNewWindowBtn(), "https://automatenow.io/");
        Assert.assertEquals(wop.handleTwoWindowsOpened(), "https://practice-automation.com/window-operations/");

    }
}
