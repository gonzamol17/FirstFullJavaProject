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
            Thread.sleep(500);
            hp.selectPopUp();
            pup = new PopUpPage(driver);
            Assert.assertEquals(pup.getTitle(), "Popups");
            pup.selectAlertBtnPopUp();
            Assert.assertEquals(pup.getMessageFromAlertPopup(), "Hi there, pal!");
            pup.handleAlertPopup();
            pup.selectConfirmBtnPopUp();
            pup.acceptConfirmPopUp();
            Assert.assertEquals(pup.getLabelFromConfirmationAlerts(), "OK it is!");
            pup.selectConfirmBtnPopUp();
            pup.cancelConfirmPopUp();
            Assert.assertEquals(pup.getLabelFromConfirmationAlerts(), "Cancel it is!");
            pup.selectPromptBtnPopUp();
            String name = "Gonzalo";
            pup.completePromptPopUp(name);
            pup.acceptConfirmPopUp();
            Assert.assertEquals(pup.getLabelFromConfirmationPromptAlerts(), "Nice to meet you, "+name+"!");

        }


}
