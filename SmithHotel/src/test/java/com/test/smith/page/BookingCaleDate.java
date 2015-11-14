package com.test.smith.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by sewadeus on 02/11/2015.
 */
public class BookingCaleDate {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.mrandmrssmith.com/beta");
        driver.findElement(By.cssSelector("#opt-in")).click();
        driver.findElement(By.cssSelector("#checkin-checkout")).click();
        //selectDate("10/12/2015");
    }

        public static void selectDate(String date) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(date);
        Date dateToBeSelected = df.parse(date);
        Date currentDate = new Date();
            String month = new SimpleDateFormat("MMMM").format(dateToBeSelected);
            String year = new SimpleDateFormat("yyyy").format(dateToBeSelected);
            String monthYearDisplayed = driver.findElement(By.cssSelector(".label")).getText();
            String monthYearToBeSelected=month+""+year;
            System.out.println( monthYearToBeSelected );

            while (true)
            if(monthYearToBeSelected.equals(monthYearDisplayed)){
               // selcte date;

            }else {// navigate to correct month and year
               // if (dateToBeSelected(currentDate)){
                driver.findElement(By.cssSelector(".calendar.checking-in>caption>button")).click();
            }
    }
       // driver.findElement(By.cssSelector(".calendar-update")).click();

    }


