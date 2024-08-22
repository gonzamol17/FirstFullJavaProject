package com.w2a.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpinnerPage {

    WebDriver driver;

    @FindBy(css = "div.spinner")
    WebElement spinner;




    public SpinnerPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public Boolean ifSpinnerIsVisibleOrNot(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.spinner")));
        return spinner.isDisplayed();
    }



}
