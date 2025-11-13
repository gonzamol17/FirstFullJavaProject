package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframesPage extends BasePage{
    WebDriver driver;

    @FindBy(css="[itemprop='headline']")
    WebElement title;
    @FindBy(id="iframe-1")
    WebElement iframeChild;
    @FindBy(css="span.highlight_gXVj")
    WebElement newTitleFromNewIframe;

    public IframesPage(WebDriver driver){
        super(driver);
    }

    public String showTitle(){
        return title.getText();
    }

    public void changeToIframeChild(){
        driver.switchTo().frame(iframeChild);
    }

    public String titleFromNewIframe(){
        return newTitleFromNewIframe.getText();
    }


}
