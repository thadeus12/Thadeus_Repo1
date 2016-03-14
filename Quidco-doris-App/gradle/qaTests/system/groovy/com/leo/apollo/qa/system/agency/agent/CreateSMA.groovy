package com.leo.apollo.qa.system.agencymanagement

/**
 * Created by Charles.Moga on 13/02/2016.
 */
import com.leo.apollo.qa.system.helpers.BaseTest
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
//import com.leo.apollo.qa.functional.utils.Helper
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
//import org.testng.annotations.Test

public class CreateSMA extends BaseTest {

    public String website
    public String[] sma = {"SS20"}

    public CreateSMA() {
        super("COY user creates an SMA and ensures that the new SMA can login to Agency site")
     }

    public void createAnSMA() throws Exception {

        website = "http://localhost:8080/company.html"
        driver.get(website)

        driver.getPageSource().contains("Enter Username:")
        driver.getPageSource().contains("Enter Password:")


        WebElement usr = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("username")))
        usr.sendKeys("admin.user")

        WebElement pwd = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("password")))
        pwd.sendKeys("pass1234")

        WebElement btn = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("submit")))
        btn.submit()

        WebElement link = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Agency Management")))
        link.click()

        WebElement createSma = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("createAgent")))
        createSma.click()

        WebElement name1 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='item.char']")))
        name1.sendKeys("s")

        WebElement name2 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@value='item.char'])[2]")))
        name2.sendKeys("s")

        WebElement name3 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@value='item.char'])[3]")))
        name3.sendKeys("2")

        WebElement name4 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@value='item.char'])[4]")))
        name4.sendKeys("0")

        WebElement password = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='password']")))
        password.sendKeys("pass1234")

        WebElement password2 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='password'])[2]")))
        password2.sendKeys("pass1234")

        WebElement firstname = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[5]")))
        firstname.sendKeys("Vladimir")

        WebElement lastname = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[6]")))
        lastname.sendKeys("Putin")

        WebElement phone = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[7]")))
        phone.sendKeys("911")

        WebElement credit = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='number']")))
        credit.sendKeys("50000")

        WebElement credit2 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[2]")))
        credit2.sendKeys("40000")

        WebElement credit3 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[3]")))
        credit3.sendKeys("30000")

        WebElement com1 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[4]")))
        com1.sendKeys("7")

        WebElement com2 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[6]")))
        com2.sendKeys("7")

        WebElement com3 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[8]")))
        com3.sendKeys("7")

        WebElement com4 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[5]")))
        com4.sendKeys("6")

        WebElement com5 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[7]")))
        com5.sendKeys("6")

        WebElement com6 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[9]")))
        com6.sendKeys("6")

        WebElement minbet1 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[10]")))
        minbet1.sendKeys(Keys.CONTROL, "a")
        minbet1.sendKeys(Keys.DELETE)
        minbet1.sendKeys("2")

        WebElement minbet2 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[13]")))
        minbet2.sendKeys(Keys.CONTROL, "a")
        minbet2.sendKeys(Keys.DELETE)
        minbet2.sendKeys("2")

        WebElement minbet3 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[16]")))
        minbet3.sendKeys(Keys.CONTROL, "a")
        minbet3.sendKeys(Keys.DELETE)
        minbet3.sendKeys("2")

        WebElement maxbet1 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[11]")))
        maxbet1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10")

        WebElement maxbet2 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[14]")))
        maxbet2.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10")

        WebElement maxbet3 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[17]")))
        maxbet3.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10")

        WebElement maxpermatch1 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[12]")))
        maxpermatch1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "100")

        WebElement maxpermatch2 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[15]")))
        maxpermatch2.sendKeys(Keys.chord(Keys.CONTROL, "a"), "100")

        WebElement maxpermatch3 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[18]")))
        maxpermatch3.sendKeys(Keys.chord(Keys.CONTROL, "a"), "100")

        WebElement pt1 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[19]")))
        pt1.sendKeys("60")

        WebElement pt2 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[20]")))
        pt2.sendKeys("60")

        WebElement pt3 = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='number'])[21]")))
        pt3.sendKeys("60")

        WebElement submit = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.-action.qa-submit-button")))

        submit.click()
        WebDriverWait wait = new WebDriverWait(driver,10)
        wait.until(ExpectedConditions.alertIsPresent())
        Alert alert = driver.switchTo().alert()
        alert.accept()

        website = "http://localhost:8080/agency.html"
        driver.get(website)

        driver.getPageSource().contains("Enter Username:")
        driver.getPageSource().contains("Enter Password:")


        WebElement user = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("username")))
        user.sendKeys("SS20")

        WebElement passwd = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("password")))
        passwd.sendKeys("pass1234")

        WebElement captcha = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("captcha")))
        captcha.sendKeys("1111")

        WebElement button = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("submit")))
        button.submit()

        assert driver.getTitle().equals("Apollo Agency")
        assert driver.findElement(By.xpath("/html/body/div/div/ng-include/div/div[2]/ng-view/div/div[1]/h1")).isDisplayed()

        String curlCommand = "curl -u afc3ef72ad2d2609ebacb7f44d7e1211:1b55704d22ea11f40512866c84849ac7 https://api.testingbot.com/v1/tests/e6206205bdff5539f2cbefdd879809c -X PUT -d \"test[success]=1\""

        try {
            Runtime.getRuntime().exec(curlCommand)
        }catch(Exception e){System.out.println(e.toString())}

        //delete the sma account
        //helper.deleteUsers(sma)

    }
 }


