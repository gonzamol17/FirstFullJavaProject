package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.CalendarsPage;
import com.w2a.PO.FormsFieldPage;
import com.w2a.PO.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Month;

public class test_AN_Calendars extends TestBase {
    HomePage hp;
    JavascriptExecutor jse;
    CalendarsPage cp;

    @Test
    public void testCalendars() throws InterruptedException {
        hp = new HomePage(driver);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)");
        Thread.sleep(500);
        hp.selectCalendars();
        cp = new CalendarsPage(driver);
        Assert.assertEquals(cp.verifyTitleCalendars(), "Calendars");
        cp.selectLblCalendar();
        String year = "2026";
        String month = "July";
        Integer day = 27;
        cp.verifyCurrentYear(year, month, day);
        cp.sendDateSelected();
        System.out.println(cp.getDateSelected());
        Assert.assertTrue(cp.getDateSelected().toLowerCase().contains(year));
        Assert.assertTrue(cp.getDateSelected().toLowerCase().contains(day.toString()));


    }
}
