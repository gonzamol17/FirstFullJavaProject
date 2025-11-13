package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccordionsPage extends BasePage{
    WebDriver driver;

    @FindBy(css="summary.wp-block-coblocks-accordion-item__title")
    WebElement iconAccordion;
    @FindBy(xpath="//p[normalize-space()='This is an accordion item.']")
    WebElement textFromAccordion;


    public AccordionsPage(WebDriver driver){
        super(driver);
    }

    public void selectIconAccordion(){
        iconAccordion.click();
    }

    public String getTextFromAccordionComponent(){
        return textFromAccordion.getText();
    }


}
