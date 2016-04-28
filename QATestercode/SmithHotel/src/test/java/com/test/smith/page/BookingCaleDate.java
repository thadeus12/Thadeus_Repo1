package com.test.smith.page;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Thadeuss on 02/12/2015.
 */
public class BookingCaleDate {

     WebDriver driver;
    static String current_month_year_runtime;
    static String current_month_year_displayed_on_calender;
    Actions builder;
    String dateFrom="td[data-value='%s']";
    String dateTo="td[data-value='%s']";
    String dateToValue="2016-03-20";
    String dateFromValue="2016-03-23";
    WebDriverWait wait;

    @Before
    public void setUp() throws ParseException {
        driver = new FirefoxDriver();
        builder=new Actions(driver);
        wait=new WebDriverWait(driver,30);
        driver.manage().window().maximize();
        driver.get("https://www.mrandmrssmith.com/beta");
        WebElement opt_in=driver.findElement(By.cssSelector("#opt-in"));
        wait.until(ExpectedConditions.elementToBeClickable(opt_in)).click();
    }

    public String get_the_month_year_as_a_string(String date) {
            String [] dateSplitArray= date.split("-");
            List<String> dateSplitList= Arrays.asList(dateSplitArray);
            return Month.of(Integer.parseInt(dateSplitList.get(1))).name()+" "+dateSplitList.get(0);
        }

        public String get_current_month_year_on_calender(){
            WebElement calenderLabel=driver.findElement(By.cssSelector(".label"));
            wait.until(ExpectedConditions.visibilityOf(calenderLabel));
            return calenderLabel.getText().toUpperCase();
        }

      public String generateRunTime_month_year(){
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date currentRunTimeDate=new Date();
        return get_the_month_year_as_a_string(dateFormat.format(currentRunTimeDate));
     }

     public List<Integer>dateValues(String date){
         String [] splitter=date.split(" ");
         List<String> splitterList=Arrays.asList(splitter);
         List<Integer> values= new ArrayList<>();
         values.add(Month.valueOf(splitterList.get(0)).getValue());
         values.add(Integer.parseInt(splitterList.get(1)));
         return values;
     }

       public int return_click_iteration_for_selected_date(String dateToBeSelected ){
           int yeartoselect=0;
           int monthtoselect=0;
           String month_year_to_be_selected=get_the_month_year_as_a_string(dateToBeSelected);
           List<Integer>month_year_to_select=dateValues(month_year_to_be_selected);
           List<Integer>current_month_year_display=dateValues(get_current_month_year_on_calender());
           if(month_year_to_select.get(1)-current_month_year_display.get(1)!=0){
               yeartoselect=(month_year_to_select.get(1)-current_month_year_display.get(1))*12;
           }
           if(month_year_to_select.get(0)-current_month_year_display.get(0)!=0){
               monthtoselect=(month_year_to_select.get(0)-current_month_year_display.get(0));
           }
           return monthtoselect+yeartoselect;
       }

    public void selectDate(String date) throws ParseException {
        int clickOnCalender = return_click_iteration_for_selected_date(date);
        while(clickOnCalender>0){
        driver.findElement(By.cssSelector("button[data-trigger='next-month']")).click();
            clickOnCalender--;
        }

    }

    @Test
    public void testCalender() throws ParseException {
        WebElement checkin_checkout=driver.findElement(By.cssSelector("#checkin-checkout"));
        wait.until(ExpectedConditions.elementToBeClickable(checkin_checkout));
        builder.moveToElement(checkin_checkout).click().perform();
        Assert.assertEquals(generateRunTime_month_year(),get_current_month_year_on_calender());
        selectDate(dateFromValue);
        WebElement dateIn=driver.findElement(By.cssSelector(String.format(dateFrom,dateFromValue)));
        builder.moveToElement(dateIn).click().perform();
        selectDate(dateToValue);
        WebElement dateOut=driver.findElement(By.cssSelector(String.format(dateTo,dateToValue)));
        builder.moveToElement(dateOut).click().perform();
        WebElement calender_update=driver.findElement(By.cssSelector(".calendar-update"));
        wait.until(ExpectedConditions.elementToBeClickable(calender_update));
        builder.moveToElement(calender_update).click().perform();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
    }


