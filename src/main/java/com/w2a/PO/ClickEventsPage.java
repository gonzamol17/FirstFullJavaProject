package com.w2a.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickEventsPage {

    WebDriver driver;

    @FindBy(css = "[onclick='catSound()']")
    WebElement btn_Cat;
    @FindBy(css = "[onclick='pigSound()']")
    WebElement btn_Pig;
    @FindBy(css = "[onclick='dogSound()']")
    WebElement btn_Dog;
    @FindBy(css = "[onclick='cowSound()']")
    WebElement btn_Cow;
    @FindBy(id = "demo")
    WebElement soundFromAnimal;





    public ClickEventsPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void selectBtnCat(){
        btn_Cat.click();
    }

    public String getSoundFromAnimal(){
        return soundFromAnimal.getText();
    }
    public void selectBtnPig(){
        btn_Pig.click();
    }

    public void selectBtnDog(){
        btn_Dog.click();
    }

    public void selectBtnCow(){
        btn_Cow.click();
    }

}
