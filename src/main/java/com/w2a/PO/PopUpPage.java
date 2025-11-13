package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PopUpPage extends BasePage {


    WebDriver driver;

    @FindBy(xpath = "//h1[contains(text(),'Popups')]")
    WebElement lblTitle;
    @FindBy(id = "alert")
    WebElement btnAlertPopUp;

    @FindBy(id = "confirm")
    WebElement btnConfirmPopUp;

    @FindBy(id = "confirmResult")
    WebElement lblResults;

    @FindBy(id = "prompt")
    WebElement btnPromptPopUp;

    @FindBy(id = "promptResult")
    WebElement lblPromptResults;



    public PopUpPage(WebDriver driver){
        super(driver);
    }

    public String getTitle(){
        return lblTitle.getText();
    }

    public void selectAlertBtnPopUp(){
        btnAlertPopUp.click();
    }

    public void handleAlertPopup () {
      driver.switchTo().alert().accept();
    }

    public String getMessageFromAlertPopup () {
        return driver.switchTo().alert().getText();

    }

    public void selectConfirmBtnPopUp(){
        btnConfirmPopUp.click();
    }

    public String getLabelFromConfirmationAlerts(){
        return lblResults.getText();
    }

    public void acceptConfirmPopUp(){
        driver.switchTo().alert().accept();
    }

    public void cancelConfirmPopUp(){
        driver.switchTo().alert().dismiss();
    }

    public void selectPromptBtnPopUp(){
        btnPromptPopUp.click();
    }

    public void completePromptPopUp(String name){
        driver.switchTo().alert().sendKeys(name);
    }

    public String getLabelFromConfirmationPromptAlerts(){
        return lblPromptResults.getText();
    }



}
