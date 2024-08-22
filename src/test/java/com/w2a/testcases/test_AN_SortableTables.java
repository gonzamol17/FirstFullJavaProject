package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.TablesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_SortableTables extends TestBase {

    HomePage hp;
    JavascriptExecutor jse;
    TablesPage tp;


    @Test
    public void testSortableTables() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)");
        Thread.sleep(1000);
        hp.selectTables();
        jse.executeScript("window.scrollBy(0,700)");
        tp = new TablesPage(driver);
        System.out.println("La cantidad total de registros de la tabla x defecto es: "+tp.showTotalOfRecordFromSortableTable());
        tp.showHeaderOfTable();
        tp.showAllSortableTable();
        Thread.sleep(1000);
        String entryQuantity = "25";
        tp.selectEntriesFromSortableTable(entryQuantity);
        Thread.sleep(1000);
        System.out.println("\n");
        System.out.println("La cantidad total de registros de la tabla ahora es: "+tp.showTotalOfRecordFromSortableTable());
        Assert.assertEquals(tp.showTheEntrySelected(), entryQuantity);
        tp.showHeaderOfTable();
        tp.showAllSortableTable();
        Thread.sleep(1000);





    }
}
