package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.WindowsOperationPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_WindowsOperation_ReplaceWindow extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    WindowsOperationPage wop;


    @Test
    public void testWindowsOperation_ReplaceWindow() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)");
        Thread.sleep(500);
        hp.selectWindowsOperation();
        wop = new WindowsOperationPage(driver);
        wop.selectReplaceWindowBtn();
        wop.selectConsentirBtn();
        Assert.assertEquals(wop.getTitleFromReplaceWindow(), "Start learning");
        System.out.println("Sección: "+wop.getTitleFromReplaceWindow());
        wop.showMeQuantityItemsFirstSection();
        Assert.assertEquals(wop.getSecondTitleFromReplaceWindow(), "Our latest posts");
        System.out.println("Sección" +wop.getSecondTitleFromReplaceWindow());
        wop.showMeQuantityItemsSecondSection();
        Assert.assertEquals(wop.verifyOriginalTitle(), ("Window Operations"));

    }
}
