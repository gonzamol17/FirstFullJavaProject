package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickEventsPage extends BasePage {

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
        super(driver);
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
