package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartSummaryPage extends BasePage {

    WebDriver driver;

    @FindBy(css = "#center_column>p")
    WebElement bannerCartEmpty;


    public ShoppingCartSummaryPage(WebDriver driver){
        super(driver);
    }

    public String getBannerCartEmpty(){

        return  bannerCartEmpty.getText();
    }

    public String getColorOfBannerEmpty(){
        return bannerCartEmpty.getCssValue("background-color");
    }
}
