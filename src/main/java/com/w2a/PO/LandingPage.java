package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage{

    WebDriver driver;

    @FindBy(css="div:nth-child(3)>button")
    WebElement btn_BankLogin;

    @FindBy(css="div.borderM.box.padT20>div:nth-child(1)>button")
    WebElement btn_CustomerLogin;


    public LandingPage(WebDriver driver){
        super(driver);
    }

    public void selectBtnBankManagerLogin(){
        btn_BankLogin.click();
    }

    public void selectBtnCustomerLogin(){
        btn_CustomerLogin.click();
    }



}
