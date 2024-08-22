package com.w2a.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


public class BrokenImagesPage {

    WebDriver driver;

    @FindBy(xpath = "//h1[contains(text(),'Calendars')]")
    WebElement lbl_Title;
    @FindBy(id = "g1065-selectorenteradate")
    WebElement lbl_Date;
    @FindBy(tagName = "img")
    List<WebElement> image_list;



    public BrokenImagesPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyNumberOfImages() throws IOException {
        System.out.println("The page under test has " + image_list.size() + " images");
        for (WebElement img: image_list) {
             String imgSrc = img.getAttribute("src");

            try {
                URL url = new URL(imgSrc);
                URLConnection urlConnection = url.openConnection();
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();
                if(httpURLConnection.getResponseCode()==200){
                    System.out.println(imgSrc+ " "+httpURLConnection.getResponseCode()+" "+httpURLConnection.getResponseMessage());

                }
                else
                    System.err.println(imgSrc+ " "+httpURLConnection.getResponseCode()+" "+httpURLConnection.getResponseMessage());
                httpURLConnection.disconnect();
            } catch (IOException e) {
           System.err.println(imgSrc);

            }
            //if (img.getAttribute("naturalWidth").equals("0")) {
            //    System.out.println(img.getAttribute("outerHTML") + " is broken.");
            }

        }



    }




