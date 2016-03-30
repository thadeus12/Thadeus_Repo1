package com.test.shoop.cucumber;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sewadeus on 20/03/2016.
 */
public class LocaterNumber {

      static WebDriver driver;


        public static void main(String[] args) {


      driver = new FirefoxDriver();
      driver.get("https://www.shoop.fr");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }


            /*WebElement catTab = driver.findElement(By.cssSelector(".item-inner.ng-binding"));
            catTab.click();


            WebElement catResult = driver.findElement(By.cssSelector("h4 span .ng-scope"));
            System.out.println(catResult.getText());
            String[] num = catResult.getText().split("288 ");
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher((CharSequence) catResult);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }*/
        }



