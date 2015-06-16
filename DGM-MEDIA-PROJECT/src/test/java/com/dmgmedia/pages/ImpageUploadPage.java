package com.dmgmedia.pages;

import com.dmgmedia.apputility.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * Created by sewadeus on 14/06/2015.
 */
public class ImpageUploadPage extends Driver {
    String loadQueueProgess="//*[@id='anywhere-upload-queue']/li/div[4]/div[1]/b";
    @FindBy(xpath="//*[@id='anywhere-upload-submit']/div[1]/button[2]")
    private  WebElement upload;

    @FindBy(css=".soft-hidden>h2")
    private WebElement uploadComplete;

    @FindBy(css=".progress-bar")
    private WebElement progressBar;


    @FindBy(css=".btn.btn-big.green")
            private WebElement startUpload;

    @FindBy(css=".upload-box-status>div")
            private  WebElement imageUploadOverlay;

    WebDriverWait wait1= new WebDriverWait(driver, 30);
    WebDriverWait wait2= new WebDriverWait(driver, 80);



    public ImpageUploadPage(){

        PageFactory.initElements(driver, this);}




    public void getImageUploadPage() throws IOException {

        HomePage.navigateToImageUploadPage();

    }

    public void clickStartOnUploadButton() throws IOException {

        wait1.until(ExpectedConditions.visibilityOf(startUpload));
       startUpload.click();

    }

    public void validateProgessUpload(){

        wait1.until(ExpectedConditions.visibilityOf(progressBar));
    }

    public void validateUploadComplete(){

        wait2.until(ExpectedConditions.visibilityOf(uploadComplete));
        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loadQueueProgess)));
    }

   public void clickonUpload(){

       wait2.until(ExpectedConditions.visibilityOf(upload));
       upload.click();

   }


    public void selectFilePath() throws AWTException {

        String systempath = System.getProperty("user.dir");
        StringSelection path = new StringSelection(systempath+"\\TechicalPic.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

    public void validateImageUploadOverlay(){

        wait2.until(ExpectedConditions.visibilityOf(imageUploadOverlay));
        Assert.assertTrue(imageUploadOverlay.isDisplayed());
    }

}
