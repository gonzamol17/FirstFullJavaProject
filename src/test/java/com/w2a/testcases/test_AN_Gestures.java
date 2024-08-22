package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.HoverPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_Gestures extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    HoverPage hop;

    @Test
    public void testGestures() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(1000);
        hp.selectGestures();
        Thread.sleep(1000);


    }
}
