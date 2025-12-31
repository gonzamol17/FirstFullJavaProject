package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SpinnerPage extends BasePage {

    @FindBy(css = "div.spinner")
    WebElement spinner;

    public SpinnerPage(WebDriver driver) {
        super(driver);
    }

   /* public SpinnerPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }*/

    public Boolean ifSpinnerIsVisibleOrNot(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.spinner")));
        return spinner.isDisplayed();
    }



}
