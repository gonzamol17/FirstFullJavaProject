package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.JavaScriptDelayPage;
import com.w2a.PO.PopUpPage;
import com.w2a.PO.SlidersPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AN_PopUp extends TestBase{
        HomePage hp;
        SlidersPage sp;
        JavascriptExecutor jse;
        PopUpPage pup;



        @Test
        public void testPopUp() throws InterruptedException {
            hp = new HomePage(driver);
            jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,400)");
            Thread.sleep(1000);
            hp.selectPopUp();
            Thread.sleep(2000);
            pup = new PopUpPage(driver);
            Assert.assertEquals(pup.getTitle(), "Popups");
            pup.selectAlertBtnPopUp();
            Thread.sleep(2000);
            Assert.assertEquals(pup.getMessageFromAlertPopup(), "Hi there, pal!");
            pup.handleAlertPopup();
            Thread.sleep(1000);
            pup.selectConfirmBtnPopUp();
            Thread.sleep(1000);
            pup.acceptConfirmPopUp();
            Thread.sleep(1000);
            Assert.assertEquals(pup.getLabelFromConfirmationAlerts(), "OK it is!");
            Thread.sleep(1000);
            pup.selectConfirmBtnPopUp();
            Thread.sleep(1000);
            pup.cancelConfirmPopUp();
            Thread.sleep(1000);
            Assert.assertEquals(pup.getLabelFromConfirmationAlerts(), "Cancel it is!");
            Thread.sleep(1000);
            pup.selectPromptBtnPopUp();
            Thread.sleep(1000);
            String name = "Gonzalo";
            pup.completePromptPopUp(name);
            Thread.sleep(1000);
            pup.acceptConfirmPopUp();
            Thread.sleep(1000);
            Assert.assertEquals(pup.getLabelFromConfirmationPromptAlerts(), "Nice to meet you, "+name+"!");
            Thread.sleep(1000);


        }


}
