package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdsPage extends BasePage {

    @FindBy(xpath = "//p[normalize-space()='I am an ad.']")
    WebElement lbl_Popup;
    @FindBy(xpath = "(//button[@aria-label='Close'])[2]")
    WebElement iconToClose;
    @FindBy(xpath = "//h1[normalize-space()='Ads']")
    WebElement titleAdsPage;




    public AdsPage(WebDriver driver){
        super(driver);
    }

    public String lblMessage(){
        return waitForVisibility(lbl_Popup).getText();
    }

    public void closePopUp(){

        waitForClickable(iconToClose).click();
    }

    public String titleOfAdsPage(){

        return waitForVisibility(titleAdsPage).getText();
    }

}
