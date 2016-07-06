package com.test.smartfocus.pages;
import com.test.smartfocus.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by sewadeus on 06/07/2016.
 */
public class SearchSmartFocus extends Driver {
    @FindBy(name = "q")
    private WebElement searchField;




public void googlesearchSmartFocus(String s_focus){
    waitForElementDisplay(searchField);
    searchField.clear();
    searchField.sendKeys(s_focus);
    searchField.submit();
}

public void clickOnSearchResult(){

    }

}
