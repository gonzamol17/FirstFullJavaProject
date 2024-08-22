package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.CalendarsPage;
import com.w2a.PO.FormsFieldPage;
import com.w2a.PO.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_Calendars extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    CalendarsPage cp;

    @Test
    public void testCalendars() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)");
        Thread.sleep(1000);
        hp.selectCalendars();
        Thread.sleep(1000);
        System.out.println();
        cp = new CalendarsPage(driver);
        Assert.assertEquals(cp.verifyTitleCalendars(), "Calendars");
        cp.selectLblCalendar();
        Thread.sleep(1000);
        String year = "2025";
        String month = "may";
        Integer day = 16;
        cp.verifyCurrentYear(year, month, day);
        Thread.sleep(1000);
        cp.sendDateSelected();
        Thread.sleep(1000);
        System.out.println(cp.getDateSelected());
        Thread.sleep(1000);
        Assert.assertTrue(cp.getDateSelected().toLowerCase().contains(year));
        Assert.assertTrue(cp.getDateSelected().toLowerCase().contains(day.toString()));
        Thread.sleep(1000);








    }
}
