package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by sewadeus on 12/12/2015.
 */
public class RatedPeople extends HomePage {

    public void validateDisplayedNum() {

        Actions builder=new Actions(driver);

        List<String> numList= new ArrayList<String>();
        List<WebElement> renderNum=driver.findElements(By.cssSelector(".row>ul>li"));

        for(WebElement num:renderNum){
            numList.add(num.getText());}

        WebElement orderButton= driver.findElement(By.cssSelector("#go"));

        builder.click(orderButton).build().perform();

        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#order li")));

        List<String> afterClicknumList= new ArrayList<String>();
        List<WebElement> afterClickrenderNum=driver.findElements(By.cssSelector("#order li"));

        for(WebElement num:afterClickrenderNum){
            afterClicknumList.add(num.getText());}

        assertEquals(numList,afterClicknumList);

    }
}
