package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class FileUploadPage {

    WebDriver driver;

    @FindBy(css = "input[type='file']")
    WebElement btn_SelectFile;
    @FindBy(id = "upload-btn")
    WebElement btn_UploadFile;
    @FindBy(css = "div.wpcf7-response-output")
    WebElement successMsg;




    public FileUploadPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void selectBtnUploadFile() throws InterruptedException {
        File uploadFile = new File("C:\\Users\\User\\Downloads\\MacroSolucionesLogo.png");
        btn_SelectFile.sendKeys(uploadFile.getAbsolutePath());
        btn_UploadFile.click();
    }

    public String getSuccessfullyMsg(){
        return successMsg.getText();
    }



}
