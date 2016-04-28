package com.smith.tashh.cucumber.pages;

import com.smith.tashh.cucumber.utility.Driver;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Thadeuss on 04/10/2015.
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
                sendKeys(Keys.chord(agentType)).
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
    public void clickOnCreateEquiryLink(){
        waitForElementDisplay(createEquiry);
        createEquiry.click();

    }
    public void selectBookingContactMedia(String contact_media){
        waitForElementDisplay(bookingContactMedia);
        bookingContactMedia.click();
    }

    public void clickingOnSubmitcontactMedia(){

        waitForElementDisplay(submitContactMedia);
        submitContactMedia.click();
    }
    public void clickingOnsearchButton(){
        waitForElementDisplay(searchHotelLink);
        searchHotelLink.click();
    }
    public void clickOnSearchHotelLink(String searchHotel_link){
        waitForElementDisplay(searchHotelLink);
        WebElement linkToSearchPgae = Driver.driver.findElement(By.cssSelector(String.format(searchLink,searchHotel_link)));
       linkToSearchPgae.click();
    }

    public void clickOnFindMemberButton(){
        findMember.click();
    }


    public void clickOnViewLink(){
        waitForElementDisplay(viewMemberLink);
        viewMemberLink.click();


    }
    public void validateButtonsONuserActivityPopPuP(List<List<String>> tab ){

        waitForElementDisplay(userActivityInfo);
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(1).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(2).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(3).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(4).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(5).get(0))).isDisplayed());

    }

    public void validateTypeOFContactMediaPOpup(){
        waitForElementDisplay(contactMediaTypeForThisBooking);
    }


    public void clickingOnSearchHotelTab(){
        waitForElementDisplay(searchHotelLink);
        searchHotelLink.click();

    }
//Search page

    public void validateBookingTripTypePopUp(){
        waitForElementDisplay(bookingTripTypePop);
        assertTrue(tripeType.isDisplayed());

    }


    public void selectTripTypeDropdown(String trip_type){
        waitForElementDisplay(tripeType);
        // Select trip = new Select(driver.findElement(By.id("#triptype_triptype")));
        new Select(driver.findElement(By.id("triptype_triptype"))).selectByVisibleText("Couple short break");


    }
    public void clickingTripeTypeSubmitButton(){
        waitForElementDisplay(tripTypeSubmit);
        tripTypeSubmit.click();
    }



    public void enterHotelNameLocation(String autoComplete){
        waitForElementDisplay(providerAutoSearch);
        WebElement hotelField=providerAutoSearch;
        builder.click(hotelField).sendKeys(Keys.chord("3 nagas")).build().perform();
        waitForElementDisplay(autoCompleteUi);
        WebElement autoComplete1= driver.findElement(By.cssSelector(".ui-corner-all .normal .autocomplete_link:contains('3 Nagas')"));
        System.out.println(autoComplete1.getText());
        builder.moveToElement(autoComplete1).click().build().perform();


    }
    public void enterStayCalendarDates(String checkIn_Date){
        waitForElementDisplay(stayStartDate);
        stayStartDate.sendKeys(checkIn_Date);
        stayStartDate.click();
    }

    public void enterAdultsAndChildrenStaying(String adults_staying, String children_staying){
        waitForElementDisplay(numberOFAdultsStaying);
        numberOFAdultsStaying.sendKeys(adults_staying);
        waitForElementDisplay(numberOFChildrenStaying);
        numberOFAdultsStaying.sendKeys(children_staying);
    }


    public void clickingOnProviderHotelSearchButton(){
        waitForElementDisplay(providerSearchButton);
        providerSearchButton.click();
    }

    @FindBy(css="#customer_search_search")
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

    @FindBy(xpath = "//*[@id='modal-hotel-info']/div/div/div/div/div/ul[1]/li/a")
    private WebElement createEquiry;

    @FindBy(css = "#contactmedium_contactmedium_2")
    private WebElement bookingContactMedia;

    @FindBy(css = "#submit_contact_media")
    private WebElement submitContactMedia;

    @FindBy(xpath="//*[@id='modal3']/div/div/div[2]/table/tbody/tr[3]/td[7]/a[1]")
    private WebElement viewMemberLink;

    @FindBy(css = ".hldr>h1:contains('Select contact media type for this booking')")
    private WebElement contactmediadtypepop;

    @FindBy(xpath = "//*[@id='modal-hotel-info']/div/ul/li[2]/a")
    private WebElement bookingsTab;

    @FindBy(css=".gtm-topmenu-tracking")
    private WebElement userUsefullButton;

    @FindBy(css = ".content-wrap>ul>li")
    private WebElement userActivityInfo;

    @FindBy(css = ".hldr>h1")
    private WebElement contactMediaTypeForThisBooking;

    @FindBy(linkText="Search for a hotel")
    private WebElement searchHotelLink;
    //Search page
   String searchLink =".search_hotel.gtm-booking-tracking:contains('%s')";

    @FindBy(css = ".hldr>h1")
    private WebElement bookingTripTypePop;

    @FindBy(css = "#triptype_triptype>optgroup>option")
    private WebElement tripeType;

    @FindBy(css = "#submit_trip_types")
    private WebElement tripTypeSubmit;

    @FindBy(id = "provider_search")
    private WebElement providerAutoSearch;

    @FindBy(css = ".ui-autocomplete")
    private WebElement autoCompleteUi;

    @FindBy(css = "#provider_start_date")
    private WebElement stayStartDate;

    @FindBy(css = "#provider_nights")
    private WebElement numberNight;

    @FindBy(css = "#provider_adults")
    private WebElement numberOFAdultsStaying;

    @FindBy(css = "#provider_children")
    private WebElement numberOFChildrenStaying;

    @FindBy(linkText ="SEARCH")
    private WebElement providerSearchButton;

    @FindBy(css ="#room-search-trigger-426>td")
    private WebElement searchResultTab;

    @FindBy(css =".ajax.gtm-searchhotel-tracking")
    private WebElement addToEquiryButton;




    String searchTabItem= "%s";







}
