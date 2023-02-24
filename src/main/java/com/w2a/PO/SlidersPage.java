package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SlidersPage {

    WebDriver driver;


    @FindBy(css = "#top-wrap h1")
    WebElement mainTitle;
    @FindBy(id = "slideMe")
    WebElement slider;
    @FindBy(id = "value")
    WebElement result;


    public SlidersPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String mainTitle(){
        return mainTitle.getText();
    }

    public void moveSlider(int cor){
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider,cor, 0).perform();

    }

    public String getResultNumber(){
        return result.getText();
    }

}
