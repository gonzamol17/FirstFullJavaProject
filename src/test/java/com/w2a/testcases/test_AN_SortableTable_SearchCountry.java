package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.TablesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_SortableTable_SearchCountry extends TestBase {


    HomePage hp;
    JavascriptExecutor jse;
    TablesPage tp;


    @Test
    public void testSortableTablesSearchCountry() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)");
        Thread.sleep(1000);
        hp.selectTables();
        jse.executeScript("window.scrollBy(0,700)");
        Thread.sleep(1000);
        tp = new TablesPage(driver);
        String country = "Brazil";
        String ctry = tp.findCountryFromSortableTable(country);
        try {
            Assert.assertEquals(ctry, country);
        }
        catch(Exception e) {
            System.out.println("No se ha podido encontrar el pais buscado en la tabla");
        }
        Thread.sleep(1000);


    }
}
