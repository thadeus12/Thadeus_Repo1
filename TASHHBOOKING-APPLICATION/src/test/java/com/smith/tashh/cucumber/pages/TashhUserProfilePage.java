package com.smith.tashh.cucumber.pages;

import com.smith.tashh.cucumber.utility.Driver;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sewadeus on 04/10/2015.
 */
public class TashhUserProfilePage extends Driver{
    Actions builder=new Actions(Driver.driver);

    public void validateUserIsLoggedIn(){
        waitForElementDisplay(tashhDashBoard);
        assertTrue(logoutButton.isDisplayed());
    }

    public void clickDropdownEnterSelectAgent(String agentType){
        builder.click(agentTab).
                moveToElement(agentTabSearchField).
                            sendKeys(Keys.chord("Smith")).
                                        click(agentSearchResult).
                                           build().
                                               perform();

    }

    public void clickDropdownSelect(String menu_item){
        builder.click(searchTab).build().perform();
        WebElement searchDropdowMenu= Driver.driver.
                                       findElement(By.linkText(String.format(searchTabItem,menu_item)));

        builder.moveToElement(searchDropdowMenu).
                    click().
                        build().
                             perform();

    }

    public void enterMemberName(String memberName){
        waitForElementDisplay(searchMemberPopUp);
        searchMemberField.sendKeys(memberName);

    }

    public void clickOnFindMemberButton(){
        findMember.click();
    }
    @FindBy(css="#customersearch_search")
    private WebElement searchMemberField;

    @FindBy(css=".findMembers")
    private WebElement findMember;

    @FindBy(css=".hldr>h1:contains('Search members')")
    private WebElement searchMemberPopUp;

    @FindBy(css=".Smith:contains('Logout')")
    private WebElement logoutButton;

    @FindBy(css="#content>h1")
    private WebElement tashhDashBoard;

    @FindBy(css=".chosen-single")
    private WebElement agentTab;

    @FindBy(css="input[type='text']")
    private WebElement agentTabSearchField;

    @FindBy(css=".active-result")
    private WebElement agentSearchResult;

    @FindBy(css=".menu:contains('Search')")
    private WebElement searchTab;

    String searchTabItem= "%s";






}
