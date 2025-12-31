package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.CalendarsPage;
import com.w2a.PO.FileDownloadPage;
import com.w2a.PO.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_FileDownloaded extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    FileDownloadPage fp;

    @Test
    public void testFileDownload() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(500);
        hp.selectFileDownload();
        fp = new FileDownloadPage(driver);
        Boolean link = fp.getLinkFromNormalFile();
        Assert.assertTrue(link);
        fp.downloadNormalFile();
        Assert.assertTrue(fp.isFileAvailable());

    }
}
