package com.test.quidco.system.groovy.com.leo.apollo.qa.system.agency.pages

/**
 * Created by charles.moga on 13/02/2016.
 */
import com.leo.apollo.qa.system.helpers.BaseTest
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

public class agent extends BaseTest {

    private static element = null
    private static WebDriver driver

    static login(String url,String username,String password){
        driver.get(url)
    }

    static username(String usercode){
        //wait until username field is displayed. when displayed all elements would have been displayed
        (new WebDriverWait(driver, 10))
        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@value='item.char']")))
        String[] name = usercode.toCharArray()
        (driver.findElement(By.xpath("//input[@value='item.char']"))).sendKeys(name[0])
        for(int i=1;i<=name.size()-1;i++){
            (driver.findElement(By.xpath("(//input[@value='item.char'])["+i+"]"))).sendKeys(name[i])
        }
    }
    static password(String value){
        (driver.findElement(By.xpath("//input[@type='password']"))).sendKeys(value)
    }
    static confirmpassword(String value){
        (driver.findElement(By.xpath("(//input[@type='password'])[2]"))).sendKeys(value)
    }
    static firstname(String value){
        (driver.findElement(By.xpath("(input[@type='text'])[5]"))).sendKeys(value)
    }
    static lastname(String value){
        (driver.findElement(By.xpath("(input[@type='text'])[6]"))).sendKeys(value)
    }
    static contactnumber(String value){
        (driver.findElement(By.xpath("(input[@type='text'])[7]"))).sendKeys(value)
    }
    static creditlimit(String value){
        (driver.findElement(By.xpath("//input[@type='number']"))).sendKeys(value)
    }
    static agentlimit(String value){
        (driver.findElement(By.xpath("(//input[@type='number'])[2]"))).sendKeys(value)
    }
    static memberlimit(String value){
        (driver.findElement(By.xpath("(//input[@type='number'])[3]"))).sendKeys(value)
    }
    static cricekbets(String min, String max){
        element = driver.findElement(By.xpath("(//input[@type='number'])[4]"))
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), min)
        element = driver.findElement(By.xpath("(//input[@type='number'])[5]"))
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), max)
    }
    static footballbets(String min, String max){
        element = driver.findElement(By.xpath("(//input[@type='number'])[6]"))
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), min)
        element = driver.findElement(By.xpath("(//input[@type='number'])[7]"))
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), max)
    }
    static tennisbets(String min, String max){
        element = driver.findElement(By.xpath("(//input[@type='number'])[8]"))
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), min)
        element = driver.findElement(By.xpath("(//input[@type='number'])[9]"))
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), max)
    }
    static position(String value){
        element = driver.findElement(By.xpath("(//input[@type='number'])[10]"))
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value)
    }
    static parentposition(String value){
        element = driver.findElement(By.xpath("(//input[@type='number'])[11]"))
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value)
    }
    static submit() {
        WebElement submit = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.-action.qa-submit-button")))
        submit.click()
    }
    static dismiss() {
        WebDriverWait wait = new WebDriverWait(driver, 10)
        wait.until(ExpectedConditions.alertIsPresent())
        Alert alert = driver.switchTo().alert()
        alert.accept()
    }
}


