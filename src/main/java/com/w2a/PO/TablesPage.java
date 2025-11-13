package com.w2a.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TablesPage extends BasePage{

    WebDriver driver;

    @FindBy(css = "#post-1076 > div > figure")
    List<WebElement>  simpleTable;
    @FindBy(css = "#post-1076 figure > table > tbody > tr>td:nth-child(1)")
    List<WebElement>  listItemElements;
    @FindBy(css = "#post-1076 figure > table > tbody > tr>td:nth-child(2)")
    List<WebElement>  listPriceElements;
    @FindBy(css = "#tablepress-1 > tbody")
    List<WebElement>  sortableTable;
    @FindBy(css = "#tablepress-1 > thead > tr")
    WebElement  headerSortableTable;
    @FindBy(xpath = "//select[@name='tablepress-1_length']")
    WebElement  dropdownEntries;
    @FindBy(css = "#tablepress-1 > tbody>tr")
    List<WebElement>  allSortableRows;
    @FindBy(css = "#tablepress-1 > tbody > tr > td.column-2")
    List<WebElement> countryListFromSortableTable;
    @FindBy(css = "#tablepress-1 > tbody > tr > td.column-3")
    List<WebElement> populationListFromSortableTable;


    public TablesPage(WebDriver driver){
        super(driver);
    }

    public void showAllSimpleTable(){
        for(WebElement table: simpleTable){
            System.out.println(table.getText());
        }
    }

    public void searchAndGetProductAndPrice(String product){
        int n = 1;
        for(WebElement table: listItemElements){
            //System.out.println("El producto es: " + table.getText());
            //System.out.println(n);
            //n = n+1;
            if (table.getText().equalsIgnoreCase(product)){
                //System.out.println(table.getText());
                System.out.println(driver.findElement(By.cssSelector("#post-1076 figure > table > tbody > tr:nth-child("+n+")")).getText());
                break;
            }
            else
                n = n+1;

        }
    }

    public void showAndGetTotalPrice(){
        int n = 1;
        int m = 1;
        float tot = 0;
        for(WebElement table: listPriceElements){
            if (n>1){
                String Tot = table.getText();
                tot = tot+(Float.parseFloat(Tot.substring(1)));
                System.out.println("El precio del producto "+m+" es:"+table.getText());
                m = m+1;

            }
            else n = n+1;

        }
        System.out.println("El total del precio de los productos es: "+tot);
    }


    public void showAllSortableTable(){
        for(WebElement table: sortableTable){
           System.out.println(table.getText());
        }
    }

    public void showHeaderOfTable(){
        System.out.println(headerSortableTable.getText());
    }

    public void selectEntriesFromSortableTable(String entry){
        Select selectEntry =new Select(dropdownEntries);
        selectEntry.selectByVisibleText(entry);
    }

    public String showTheEntrySelected(){
        return dropdownEntries.getAttribute("value");
    }

    public int showTotalOfRecordFromSortableTable(){
        return allSortableRows.size();
    }


    public String findCountryFromSortableTable(String country){
        int aux = 1;
        String ctry = null;
        for(WebElement table: countryListFromSortableTable){
            if (table.getText().equalsIgnoreCase(country)){
                System.out.println(table.getText());
                aux = 2;
                return ctry = table.getText();
            }
        }
        if (aux == 1){
            ctry = "No se encuentra el país buscado";
        }
        return ctry;
    }

    public String showQuantityOfPoblation(String country){
       String mensaje = "No se encontró el pais buscado";
       for(WebElement table: countryListFromSortableTable){
            if (table.getText().equalsIgnoreCase(country))
            {
                System.out.println("El País seleccionado es "+table.getText()+" y la población es");
                return driver.findElement(By.xpath("//td[contains(text(),'"+country+"')]/following-sibling::td")).getText();

            }

        }
       return mensaje;
      }

    public void showTotalOfPoblationFromCountries(){
       for(WebElement table: countryListFromSortableTable){
           System.out.println("El País "+table.getText()+" tiene una población de");
           System.out.println(driver.findElement(By.xpath("//td[contains(text(),'"+table.getText()+"')]/following-sibling::td")).getText());

       }


    }



}
