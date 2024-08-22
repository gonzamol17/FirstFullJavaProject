package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverPage {

        WebDriver driver;

        @FindBy(id = "mouse_over")
        WebElement lbl_MsgHover;
        @FindBy(id = "formModal")
        WebElement btn_FormModal;




        public HoverPage(WebDriver driver){

            this.driver=driver;
            PageFactory.initElements(driver,this);
        }

        public String lblMessage(){

            return lbl_MsgHover.getText();
        }

    public void doHoverOverLable(){
        Actions action = new Actions(driver);
        action.moveToElement(lbl_MsgHover).perform();
    }



}
