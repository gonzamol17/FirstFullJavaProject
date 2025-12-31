package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordionsPage extends BasePage {

    @FindBy(css="summary.wp-block-coblocks-accordion-item__title")
    WebElement iconAccordion;
    @FindBy(xpath="//p[normalize-space()='This is an accordion item.']")
    WebElement textFromAccordion;


    public AccordionsPage(WebDriver driver){
        super(driver);
    }

    public void selectIconAccordion(){
        waitForClickable(iconAccordion).click();
    }

    public String getTextFromAccordionComponent(){
        return waitForVisibility(textFromAccordion).getText();
    }



}
