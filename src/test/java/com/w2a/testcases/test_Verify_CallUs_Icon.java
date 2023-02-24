package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.HomePage;
import com.w2a.PO.LoginPage;
import com.w2a.PO.MyAccountPage;

public class test_Verify_CallUs_Icon extends TestBase {
    HomePage hp;
    LoginPage lp;
    MyAccountPage map;


    /*@Test
    public void verifyCallUsIcon() throws InterruptedException {
        hp = new HomePage(driver);
        Thread.sleep(2000);
        String aux = hp.getIconCallUs();
        Assert.assertEquals(aux, "Call us now: 0123-456-789");
        System.out.println("Se encontró el icono con la leyenda : "+aux+" en el Home");



    }*/
}
