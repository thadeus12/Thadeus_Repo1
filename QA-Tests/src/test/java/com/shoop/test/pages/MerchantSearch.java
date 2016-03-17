package com.shoop.test.pages;

import com.shoop.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Thadeus Ssewanyana on 15/03/2016.
 */
public class MerchantSearch extends Driver{
    Actions action = new Actions(Driver.driver);
    WebDriverWait wait = new WebDriverWait(Driver.driver,20);
    @FindBy(css = ".form-control.search-input.ng-valid.ng-touched.ng-dirty.ng-valid-parse")
    private WebElement searchField;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement search;

    @FindBy(css = "h4.ng-binding")
    private WebElement merchantName;
    @FindBy(css = ".styled-rate-text.ng-binding.ng-scope")
    private WebElement merchanBestRates;

String searchMerchant =".ng-binding:contains('%s')";


    public void enteMerchantNameToSearch(String m_name){
        waitForElementDisplay(search);
        search.sendKeys(m_name);

    }

    public void validateSearchedResultsAndOwnBestRates(String name_s){
//      //  waitForElementDisplay(merchantName);
//        WebElement shoopMerchant = Driver.driver.findElement(By.linkText(String.format(searchMerchant,name_s)));
//        wait.until(ExpectedConditions.visibilityOf(shoopMerchant));
//        assertTrue(shoopMerchant.isDisplayed());

        waitForElementDisplay(merchantName);
       assertTrue(merchantName.isDisplayed());
        assertTrue(merchanBestRates.isDisplayed());
        System.out.println(merchantName.getText());


    }
}
