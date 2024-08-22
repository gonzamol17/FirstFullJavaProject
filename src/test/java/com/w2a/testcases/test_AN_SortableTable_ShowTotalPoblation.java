package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.TablesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_SortableTable_ShowTotalPoblation extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    TablesPage tp;


    @Test
    public void testSortableTablesShowTotalPoblation() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)");
        Thread.sleep(1000);
        hp.selectTables();
        jse.executeScript("window.scrollBy(0,700)");
        Thread.sleep(1000);
        tp = new TablesPage(driver);
        tp.showTotalOfPoblationFromCountries();
        Thread.sleep(1000);

    }
}
