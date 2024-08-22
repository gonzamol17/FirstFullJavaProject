package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormsFieldPage {

    WebDriver driver;

    @FindBy(id = "name")
    WebElement txtName;
    @FindBy(css = "#cookie_action_close_header")
    WebElement modalCookies;
    @FindBy(xpath = "//a[contains(text(),'Sliders')]")
    WebElement btn_Sliders;
    @FindBy(xpath = "//a[contains(text(),'Form Fields')]")
    WebElement btn_Form_Fields;

    @FindBy(xpath = "//input[@name='fav_drink']")
    List<WebElement> listcheckbox;

    @FindBy(xpath = "//label[contains(@for, 'drink')]")
    List<WebElement> listcheckboxNames;

    @FindBy(xpath = "//input[@type='radio']")
    List<WebElement> listradioButton;

    @FindBy(id = "siblings")
    WebElement dropdownSibling;

    @FindBy(css = "#feedbackForm > ul>li")
    List <WebElement> listOfFastAnimals;

    @FindBy(id = "email")
    WebElement txtemail;

    @FindBy(id = "message")
    WebElement txtmessage;

    @FindBy(id = "submit-btn")
    WebElement btnSubmit;



    public FormsFieldPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void completeName(String name){
        txtName.sendKeys(name);
    }

    public void selectSomeCheckboxes(String pro1, String pro2) throws InterruptedException {
        for (WebElement checkbox: listcheckboxNames){
            //System.out.println(checkbox.getText());
            if(checkbox.getText().equalsIgnoreCase(pro1) || checkbox.getText().equalsIgnoreCase(pro2)) {
               checkbox.click();

            }
        }
    }

    public void selectOneRadioButton(String color) throws InterruptedException {
        for (WebElement radiobutton: listradioButton){
            //System.out.println(radiobutton.getAttribute("value"));
            if(radiobutton.getAttribute("value").equalsIgnoreCase(color)) {
                radiobutton.click();

            }
        }
    }

    public void selectSibling(String option){
        Select select = new Select(dropdownSibling);
        select.selectByVisibleText(option);
    }

    public void getListFastAnimals(){

        for (WebElement animal: listOfFastAnimals){
            System.out.println(animal.getText());
        }

    }

    public void sendEmailAddress(String email){
        txtemail.sendKeys(email);

    }

    public void sendMessage(String message){
        txtmessage.sendKeys(message);
    }

    public String selectBtnSubmit(){
        btnSubmit.click();
        return (driver.switchTo().alert().getText());
    }

}
