package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class FileUploadPage extends BasePage{

    WebDriver driver;

    @FindBy(css = "input[type='file']")
    WebElement btn_SelectFile;
    @FindBy(id = "upload-btn")
    WebElement btn_UploadFile;
    @FindBy(css = "div.wpcf7-response-output")
    WebElement successMsg;




    public FileUploadPage(WebDriver driver){
        super(driver);
    }

    public void selectBtnUploadFile() throws InterruptedException {
        File uploadFile = new File("src\\test\\resources\\testData\\wise.jpeg");
        btn_SelectFile.sendKeys(uploadFile.getAbsolutePath());
        btn_UploadFile.click();
    }

    public String getSuccessfullyMsg(){
        return successMsg.getText();
    }



}
