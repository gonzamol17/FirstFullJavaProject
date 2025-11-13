package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumFrameworkPage extends BasePage{
    WebDriver driver;

    @FindBy(css="div>h2>span>strong")
    WebElement titleOfPage;



    public SeleniumFrameworkPage(WebDriver driver){
        super(driver);
    }

    public boolean getTitleOfPage(){
        return titleOfPage.isDisplayed();
    }

}
