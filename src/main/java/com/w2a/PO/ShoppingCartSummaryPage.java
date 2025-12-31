package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartSummaryPage extends BasePage {

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
