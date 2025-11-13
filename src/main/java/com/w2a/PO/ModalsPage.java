package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ModalsPage extends BasePage{
    WebDriver driver;

    @FindBy(id = "simpleModal")
    WebElement btn_SimpleModal;
    @FindBy(id = "formModal")
    WebElement btn_FormModal;
    @FindBy(xpath = "//p[contains(text(),'Hi, I’m a simple modal.')]")
    WebElement simpleModal;
    @FindBy(xpath = "//div[@id='pum_popup_title_1318']")
    WebElement simpleTitleModal;
     @FindBy(css = "div:nth-of-type(5) .popmake-close.pum-close")
    WebElement closeSimpleModal;
    @FindBy(css = "input#g1051-name.name.grunion-field")
    WebElement txtNameModal;
    @FindBy(css = "input#g1051-email.email.grunion-field")
    WebElement txtEmailModal;
    @FindBy(css = "textarea#contact-form-comment-g1051-message")
    WebElement txtMessageModal;
    @FindBy(css = "input#g1051-name.name.grunion-field")
    WebElement btnSubmitModal;
    @FindBy(css = "#post-1051 div.wp-block-group.is-layout-flow> p")
    WebElement textAfterBeenClosedModal;



    public ModalsPage(WebDriver driver){
        super(driver);
    }

    public void selectSimpleModal(){
        btn_SimpleModal.click();
    }

    public void selectFormModal(){
        btn_FormModal.click();
    }

    public String handleSimpleBodyModal () {
        return simpleModal.getText();
    }

    public String handleSimpleTitleModal () {
        return simpleTitleModal.getText();
    }

    public void closeSimpleModal () {
        closeSimpleModal.click();
    }

    public void fillFormModal (String name, String email, String message) throws InterruptedException {
        txtNameModal.sendKeys(name);
        txtEmailModal.sendKeys(email);
        txtMessageModal.sendKeys(message);
        btnSubmitModal.click();
    }

    public String getEvidenceAfterCloseFormModal () {
        return textAfterBeenClosedModal.getText();
    }


}
