package com.w2a.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class WindowsOperationPage {
    WebDriver driver;

    @FindBy(xpath="//b[contains(text(),'New Tab')]")
    WebElement btn_NewTab;

    @FindBy(css="#post-18533 > div > h2 > strong")
    WebElement lbl_TitleNewWindowPage;

    @FindBy(xpath="//p[contains(text(),'Consentir')]")
    WebElement btn_Consentir;

    @FindBy(xpath="//button[@onclick='newWindowSelf()']")
    WebElement btn_ReplaceWindow;
    @FindBy(xpath="//strong[contains(text(),'Start learning')]")
    WebElement title_FromReplaceWindow;
    @FindBy(css="img.tutorial")
    List<WebElement> items_FromReplaceWindow;
    @FindBy(xpath="//strong[contains(text(),'Start learning')]")
    WebElement firstTitle;
    @FindBy(xpath="//a[@class='bg-cover bg-center-center']")
    List<WebElement> items_FromSecondSection;
    @FindBy(xpath="//strong[contains(text(),'Our latest posts')]")
    WebElement secondTitle;
    @FindBy(css="#top-wrap > section > div > h1")
    WebElement windowsOperationTitle;
    @FindBy(xpath="//button[@onclick='newWindow()']")
    WebElement btn_NewWindow;


    public WindowsOperationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void selectNewBtn(){
       btn_NewTab.click();
    }

    public String showTheURLFromNewWindows(){
        Set<String> windowHandles = driver.getWindowHandles();
        String originalwindow = driver.getWindowHandle();
        for (String windowHandle : windowHandles) {
            if(!originalwindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
            }
        }
        return originalwindow;
    }


    public void selectConsentirBtn(){
        WebDriverWait wait = new WebDriverWait(driver,2);
        btn_Consentir.click();
    }

    public String verifyTheTitleForSecondWindow() {
       return lbl_TitleNewWindowPage.getText();
    }


    public String showTheOriginalUrl(String handle) throws InterruptedException {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            Thread.sleep(1000);
            if(!windowHandle.contentEquals(handle)) {
                driver.close();
            }

        }
        driver.switchTo().window(handle);
        return driver.getCurrentUrl();
    }

    public void selectReplaceWindowBtn() {
        btn_ReplaceWindow.click();
    }

    public String getTitleFromReplaceWindow() {
        return title_FromReplaceWindow.getText();
    }

    public void showMeQuantityItemsFirstSection() {
       System.out.println("La cantidad items en esta primera sección es: "+items_FromReplaceWindow.size());
    }

    public String getSecondTitleFromReplaceWindow() {
        return secondTitle.getText();
    }

    public void showMeQuantityItemsSecondSection() {
        System.out.println("La cantidad items en esta segunda sección es: "+items_FromSecondSection.size());
    }

    public String verifyOriginalTitle(){
        driver.navigate().back();
        return windowsOperationTitle.getText();
    }

    public String selectNewWindowBtn(){
        btn_NewWindow.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if(!windowHandle.contentEquals(driver.getWindowHandle())) {
                driver.switchTo().window(windowHandle);
                return driver.getCurrentUrl();
           }
        }
        return driver.getCurrentUrl();
    }

    public String showTheCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public String handleTwoWindowsOpened() throws InterruptedException {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if(!windowHandle.contentEquals(driver.getWindowHandle())) {
                driver.switchTo().window(windowHandle);
                return driver.getCurrentUrl();
            }
        }
        return driver.getCurrentUrl();
    }



}

