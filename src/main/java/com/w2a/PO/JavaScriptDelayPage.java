package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptDelayPage extends BasePage {

        @FindBy(css = "#top-wrap h1")
        WebElement mainTitle;
        @FindBy(css = "#start")
        WebElement btnStart;
        @FindBy(id = "delay")
        WebElement textBox;


        public JavaScriptDelayPage(WebDriver driver){
            super(driver);
        }

        public String mainTitle(){
            return mainTitle.getText();
        }

        public String btnStartColor(){
            return btnStart.getCssValue("background-color");
        }

        public String getTextOnTextField(){
            return textBox.getText();
        }

        public void clickBtnStart(){
         btnStart.click();
    }


}
