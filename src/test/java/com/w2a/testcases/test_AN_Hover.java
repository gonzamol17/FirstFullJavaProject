package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.FormsFieldPage;
import com.w2a.PO.HomePage;
import com.w2a.PO.HoverPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_Hover extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    HoverPage hop;

    @Test
    public void testHover() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)");
        Thread.sleep(1000);
        hp.selectHover();
        hop = new HoverPage(driver);
        Assert.assertEquals(hop.lblMessage(), "Mouse over me");
        hop.doHoverOverLable();
        Assert.assertEquals(hop.lblMessage(), "You did it!");
        Thread.sleep(1000);






    }
}
