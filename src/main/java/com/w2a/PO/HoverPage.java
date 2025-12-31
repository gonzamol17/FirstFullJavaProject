package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HoverPage extends BasePage {

        @FindBy(id = "mouse_over")
        WebElement lbl_MsgHover;
        @FindBy(id = "formModal")
        WebElement btn_FormModal;




        public HoverPage(WebDriver driver){
            super(driver);
        }

        public String lblMessage(){

            return lbl_MsgHover.getText();
        }

    public void doHoverOverLable(){
        Actions action = new Actions(driver);
        action.moveToElement(lbl_MsgHover).perform();
    }



}
