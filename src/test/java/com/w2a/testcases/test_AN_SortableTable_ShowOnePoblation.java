package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.TablesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class test_AN_SortableTable_ShowOnePoblation extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    TablesPage tp;


    @Test
    public void testSortableTableShowOnePoblation() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)");
        Thread.sleep(1000);
        hp.selectTables();
        jse.executeScript("window.scrollBy(0,700)");
        Thread.sleep(1000);
        tp = new TablesPage(driver);
        String country = "Nigeria";
        System.out.println(tp.showQuantityOfPoblation(country));
        Thread.sleep(1000);

    }
}
