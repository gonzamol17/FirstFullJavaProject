package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.FileUploadPage;
import com.w2a.PO.HomePage;
import com.w2a.PO.SlidersPage;
import com.w2a.PO.SpinnerPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


public class tst_AN_File_Upload extends TestBase {
    HomePage hp;
    SlidersPage sp;
    JavascriptExecutor jse;
    FileUploadPage fup;


    @Test
    public void testFileUpload() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1400)");
        Thread.sleep(1000);
        hp.selectFileUpload();
        fup = new FileUploadPage(driver);
        fup.selectBtnUploadFile();
        Thread.sleep(2000);
        Assert.assertEquals(fup.getSuccessfullyMsg(), "Thank you for your message. It has been sent.");
        Thread.sleep(2000);




    }
}
