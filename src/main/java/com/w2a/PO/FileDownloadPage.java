package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class FileDownloadPage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Sandbox Download Form - .pdf')]")
    WebElement link_NormalDownload;

    @FindBy(xpath = "//a[@class='wpdm-download-link download-on-click btn btn-primary ']")
    WebElement btn_NormalDownload;



    public FileDownloadPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public Boolean getLinkFromNormalFile(){
        return link_NormalDownload.isDisplayed();
    }

    public void downloadNormalFile(){
        btn_NormalDownload.click();
    }

    public Boolean isFileAvailable(){
        String filePath = "C:\\Users\\User\\Downloads\\Test.pdf";
        File downloadedFile = new File(filePath);
        return downloadedFile.exists();


    }
}