package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'JavaScript Delays')]")
    WebElement btn_JSDelays;
    @FindBy(css = "#cookie_action_close_header")
    WebElement modalCookies;
    @FindBy(xpath = "//a[contains(text(),'Sliders')]")
    WebElement btn_Sliders;
    @FindBy(xpath = "//a[contains(text(),'Form Fields')]")
    WebElement btn_Form_Fields;
    @FindBy(xpath = "//a[contains(text(),'Popups')]")
    WebElement btn_PopUp;
    @FindBy(xpath = "//a[contains(text(),'Calendars')]")
    WebElement btn_Calendars;
    @FindBy(xpath = "//a[contains(text(),'Modals')]")
    WebElement btn_Modals;
    @FindBy(xpath = "//a[contains(text(),'Tables')]")
    WebElement btn_Tables;
    @FindBy(xpath = "//a[contains(text(),'Window Operations')]")
    WebElement btn_WindowsOperation;
    @FindBy(xpath = "//a[contains(text(),'Hover')]")
    WebElement btn_Hover;
    @FindBy(xpath = "//a[contains(text(),'Ads')]")
    WebElement btn_Ads;
    @FindBy(xpath = "//a[contains(text(),'Gestures')]")
    WebElement btn_Gestures;
    @FindBy(xpath = "//a[contains(text(),'File Download')]")
    WebElement btn_FileDownload;
    @FindBy(xpath = "//a[contains(text(),'Click Events')]")
    WebElement btn_ClickEvents;
    @FindBy(xpath = "//a[contains(text(),'Spinners')]")
    WebElement btn_Spinners;
    @FindBy(xpath = "//a[contains(text(),'File Upload')]")
    WebElement btn_FileUpload;
    @FindBy(xpath = "//a[contains(text(),'Iframes')]")
    WebElement btn_Iframes;
    @FindBy(xpath = "//a[contains(text(),'Broken Images')]")
    WebElement btn_BrokenImages;
    @FindBy(xpath = "//a[contains(text(),'Broken Links')]")
    WebElement btn_BrokenLinks;
    @FindBy(xpath = "//a[contains(text(),'Accordions')]")
    WebElement btn_AccordionsLinks;







    public HomePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void selectJSDealys(){
        btn_JSDelays.click();
    }

    public WebElement getCookies(){
        return modalCookies;
    }

    public void acceptCookies(){
         modalCookies.click();
    }

    public void selectSliders(){
        btn_Sliders.click();
    }

    public void selectFormField(){
        btn_Form_Fields.click();
    }

    public void selectPopUp(){
        btn_PopUp.click();
    }

    public void selectCalendars(){
        btn_Calendars.click();
    }

    public void selectModals(){
        btn_Modals.click();
    }

    public void selectTables(){
        btn_Tables.click();
    }
    public void selectWindowsOperation(){
        btn_WindowsOperation.click();
    }

    public void selectHover(){
        btn_Hover.click();
    }

    public void selectAds(){
        btn_Ads.click();

    }

    public void selectGestures(){
        btn_Gestures.click();

    }

    public void selectFileDownload(){
        btn_FileDownload.click();

    }

    public void selectClickEvents(){
        btn_ClickEvents.click();

    }

    public void selectSpinners(){
        btn_Spinners.click();

    }

    public void selectFileUpload(){
        btn_FileUpload.click();

    }

    public void selectIframes(){
        btn_Iframes.click();

    }

    public void selectBrokenImages(){
        btn_BrokenImages.click();

    }

    public void selectBrokenLinks(){
        btn_BrokenLinks.click();

    }
    public void selectAccordionsLinks(){
        btn_AccordionsLinks.click();

    }


    /*public void selectLoginBtn(){
        btn_Login.click();
    }

    public boolean getLinkSignOut(){
        return btn_Login.isDisplayed();
    }

    public String getIconCallUs(){
        return iconCallUs.getText();
    }
    public String getCategoriesFooterLink(){
        return categoriesLink.getText();
    }
    public String getInformationFooterLink(){
        return informationLink.getText();
    }
    public String getMyAccountFooterLink(){
        return myAccountLink.getText();
    }
    public String getStoreInformationFooterLink(){return storeInformationLink.getText();}
    public void getAllCategories(){
        List<WebElement> categorieList= driver.findElements(By.xpath("//body/div[@id='page']/div[3]/footer[1]/div[1]/section[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
        for (WebElement list:categorieList) {
            String name= list.getText();
            System.out.println(name);
        }
    }

    public void getAllInformation() {
        List<WebElement> informationList = driver.findElements(By.cssSelector("#block_various_links_footer>ul>li"));
        for (WebElement list : informationList) {
            String name = list.getText();
            System.out.println(name);
        }
    }

    public void getAllAccount(){
        List<WebElement> myAccountList = driver.findElements(By.cssSelector("section:nth-child(7)>div>ul>li"));
        for (WebElement list : myAccountList) {
            String name = list.getText();
           System.out.println(name);
           }
    }

    public Boolean getCallUsLeyend(){
       return callUsDetail.isDisplayed();

    }

    public void selectBtnSeleniumFramework(){
        btnSeleniumFramework.click();
    }


    public Boolean verifyCustomBlockTitleIsPresent(){
        return customBlockTitle.isDisplayed();
    }

    public String getCustomBlockTitle(){
        return customBlockTitle.getText();
    }

    public String getSubtitle(){
        return subtitle1.getText();
    }

    public String getColorSubtitle(){
        return subtitle1.getCssValue("color");
    }

    public void sendEmailToSubscribe(String email){
        textBoxNewsletter.click();
        textBoxNewsletter.sendKeys(email);
        btnSendEmail.click();
    }

    public Boolean verificarExistenciaTextBoxNewsletter(){
        return textBoxNewsletter.isDisplayed();
    }

    public String getTitleTextBoxNewsletterSubscribe(){
        return textBoxNewsletter.getAttribute("value");
    }

    public Boolean verificarExistenciaBannerSubscribed(){
        return bannerSubscribed.isDisplayed();
    }
    public String getTitleOfBannerSubscribed(){
        return bannerSubscribed.getText();
    }

    public String getColorBannerSubscribed(){
        return bannerSubscribed.getCssValue("background-color");
    }

    public void selectBtnShopNow(){
        btnShopNow.click();
    }
    public boolean getBtnShopNow(){
        return btnShopNow.isDisplayed();
    }

    public String getExternalTitle(){
        return externalTitle.getText();
    }*/




}


