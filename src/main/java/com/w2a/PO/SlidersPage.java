package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SlidersPage extends BasePage {

    @FindBy(css = "#top-wrap h1")
    WebElement mainTitle;
    @FindBy(id = "slideMe")
    WebElement slider;
    @FindBy(id = "value")
    WebElement result;


    public SlidersPage(WebDriver driver){
        super(driver);
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
