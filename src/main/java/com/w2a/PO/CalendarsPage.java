package com.w2a.PO;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Month;


public class CalendarsPage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Calendars')]")
    WebElement lbl_Title;
    @FindBy(css = "label.grunion-field-label.date")
    WebElement lbl_Date;
    @FindBy(css = "#body header > button.dp-focusable.dp-cal-month")
    WebElement lbl_month;
    @FindBy(css = "#body header > button.dp-focusable.dp-cal-year")
    WebElement lbl_year;
    @FindBy(css = "#body header > button.dp-focusable.dp-next")
    WebElement arrowNext;
    @FindBy(css = "#body header > button.dp-focusable.dp-prev")
    WebElement arrowPrevious;
    @FindBy(css = "input[data-format='yy-mm-dd']")
    WebElement lblDateSelected;
    @FindBy(css = "div[class='entry-content'] button[type='submit']")
    WebElement btnSubmitDate;






    public CalendarsPage(WebDriver driver){
        super(driver);
    }

    public String verifyTitleCalendars(){
        return waitForVisibility(lbl_Title).getText();
    }

    public void selectLblCalendar(){
        waitForClickable(lbl_Date).click();
    }


    public String getMonthCalendar(){
        return lbl_month.getText();
    }

    public String getYearCalendar(){
        return lbl_year.getText();
    }

    public void verifyCurrentYear(String year, String month, Integer day){
        waitForVisibility(lbl_year);

        int currentYear = Integer.parseInt(lbl_year.getText());
        int targetYear = Integer.parseInt(year);

        // 🔹 CASO 1: Año futuro
        if (currentYear < targetYear) {

            while (currentYear < targetYear || !month.equalsIgnoreCase(getMonthCalendar())) {
                waitForClickable(arrowNext).click();
                waitForVisibility(lbl_year);
                currentYear = Integer.parseInt(lbl_year.getText());
            }

        }
        // 🔹 CASO 2: Año pasado
        else if (currentYear > targetYear) {

            while (currentYear > targetYear || !month.equalsIgnoreCase(getMonthCalendar())) {
                waitForClickable(arrowPrevious).click();
                waitForVisibility(lbl_year);
                currentYear = Integer.parseInt(lbl_year.getText());
            }

        }
        // 🔹 CASO 3: MISMO AÑO  ✅ (acá estaba el bug)
        else {

            int currentMonth = Month.valueOf(getMonthCalendar().toUpperCase()).getValue();
            int targetMonth = Month.valueOf(month.toUpperCase()).getValue();

            if (currentMonth < targetMonth) {
                while (!month.equalsIgnoreCase(getMonthCalendar())) {
                    waitForClickable(arrowNext).click();
                }
            } else {
                while (!month.equalsIgnoreCase(getMonthCalendar())) {
                    waitForClickable(arrowPrevious).click();
                }
            }
        }

        // 🔹 Selección del día
        By dayLocator = By.xpath("//button[normalize-space()='" + day + "']");
        wait.until(ExpectedConditions.elementToBeClickable(dayLocator)).click();

    }

    public void sendDateSelected(){
        waitForClickable(btnSubmitDate).click();
    }

    public String getDateSelected(){
        return waitForVisibility(lblDateSelected).getAttribute("value");
    }



}
