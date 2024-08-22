package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinksPage {


    WebDriver driver;

    @FindBy(tagName = "a")
    List<WebElement> image_links;





    public BrokenLinksPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyNumberOfLinksBroken() throws IOException {

        // Iterating each link and checking the response status

        for (WebElement link : image_links) {
            String url = link.getAttribute("href");
            try {
                URL linke = new URL(url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) linke.openConnection();
                httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    System.out.println(url + " - " + httpURLConnection.getResponseMessage());
                } else {
                    System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
                    //String brokenUrl = url;
                }
            } catch (Exception e) {
                System.out.println(url + " - " + "is a broken link");
            }
        }

    }


}
