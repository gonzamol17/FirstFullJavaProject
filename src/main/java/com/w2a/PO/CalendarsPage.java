package com.w2a.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarsPage {


    WebDriver driver;

    @FindBy(xpath = "//h1[contains(text(),'Calendars')]")
    WebElement lbl_Title;
    @FindBy(id = "g1065-selectorenteradate")
    WebElement lbl_Date;
    @FindBy(xpath = "//span[@class='ui-datepicker-month']")
    WebElement lbl_month;
    @FindBy(xpath = "//span[@class='ui-datepicker-year']")
    WebElement lbl_year;
    @FindBy(xpath = "//a[@title='Next']")
    WebElement arrowNext;
    @FindBy(xpath = "//a[@title='Previous']")
    WebElement arrowPrevious;
    @FindBy(css = ".field-value")
    WebElement lblDateSelected;
    @FindBy(css = "div[class='entry-content'] button[type='submit']")
    WebElement btnSubmitDate;






    public CalendarsPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String verifyTitleCalendars(){
        return lbl_Title.getText();
    }

    public void selectLblCalendar(){
        lbl_Date.click();
    }


    public String getMonthCalendar(){
        return lbl_month.getText();
    }

    public String getYearCalendar(){
        return lbl_year.getText();
    }

    public void verifyCurrentYear(String year, String month, Integer day){
        int currentYear = Integer.parseInt(lbl_year.getText());
        int newYear = Integer.parseInt((year));
        if (currentYear < newYear){
            while (currentYear < newYear || !month.equalsIgnoreCase(getMonthCalendar())) {
                arrowNext.click();
                currentYear = Integer.parseInt(lbl_year.getText());
            }
        }
        else {
            if(currentYear > newYear){
                while (currentYear > newYear || !month.equalsIgnoreCase(getMonthCalendar())) {
                    arrowPrevious.click();
                    currentYear = Integer.parseInt(lbl_year.getText());

                }

            }
            else {
                  while (!month.equalsIgnoreCase(getMonthCalendar())) {

                      arrowNext.click();
                    }

                }
            }

        driver.findElement(By.xpath("//a[contains(text(),'"+day+"')]")).click();

    }

    public void sendDateSelected(){
        btnSubmitDate.click();
    }

    public String getDateSelected(){
        return lblDateSelected.getText();
    }



}
