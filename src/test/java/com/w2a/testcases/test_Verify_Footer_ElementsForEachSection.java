package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.LoginPage;
import com.w2a.PO.MyAccountPage;
import org.openqa.selenium.JavascriptExecutor;

public class test_Verify_Footer_ElementsForEachSection extends TestBase {
    HomePage hp;
    LoginPage lp;
    MyAccountPage map;
    JavascriptExecutor jse;

    /*@Test
    public void verifyFooterElementsForEachSection() throws InterruptedException {
        hp = new HomePage(driver);
        jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(1000);
        System.out.println("\nLas subsecciones de Categories son:");
        hp.getAllCategories();
        System.out.println("\nLas subsecciones de Information son:");
        hp.getAllInformation();
        System.out.println("\nLas subsecciones de My Account son:");
        hp.getAllAccount();
    }*/

}
