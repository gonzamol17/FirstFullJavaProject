package com.w2a.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdsPage {

    WebDriver driver;

    @FindBy(xpath = "//p[normalize-space()='I am an ad.']")
    WebElement lbl_Popup;
    @FindBy(xpath = "(//button[@aria-label='Close'])[1]")
    WebElement iconToClose;
    @FindBy(xpath = "//h1[normalize-space()='Ads']")
    WebElement titleAdsPage;




    public AdsPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String lblMessage(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='I am an ad.']")));
        return lbl_Popup.getText();
    }

    public void closePopUp(){

        iconToClose.click();
    }

    public String titleOfAdsPage(){

        return titleAdsPage.getText();
    }

}
