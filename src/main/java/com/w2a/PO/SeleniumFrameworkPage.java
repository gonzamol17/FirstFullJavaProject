package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumFrameworkPage extends BasePage {

    @FindBy(css="div>h2>span>strong")
    WebElement titleOfPage;



    public SeleniumFrameworkPage(WebDriver driver){
        super(driver);
    }

    public boolean getTitleOfPage(){
        return titleOfPage.isDisplayed();
    }

}
