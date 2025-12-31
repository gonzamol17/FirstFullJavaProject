package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class FileUploadPage extends BasePage {

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
        waitForClickable(btn_UploadFile).click();

    }

    public String getSuccessfullyMsg(){
       return waitForVisibility(successMsg).getText();
    }



}
