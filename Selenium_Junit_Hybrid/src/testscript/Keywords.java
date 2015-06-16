package testscript;
//http://www.vogella.de/articles/JavaRegularExpressions/ar01s05.html
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Keywords extends DriverScript{
	
	
	// navigate
	public static String navigate(){
		System.out.println("Executing Navigate");
		if(wbdv == null){
			if(CONFIG.getProperty("testBrowser").equals("Firefox")){
				wbdv = new FirefoxDriver();
				driver = new EventFiringWebDriver(wbdv);
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			//else
		}
		driver.navigate().to(CONFIG.getProperty(object));
		return "Pass";
		
	}
	
	public static String clickLink(){
		System.out.println("Executing clickLink");
		try{
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		}catch(Throwable t){
			// report error
			System.out.println("Error while clicking on link -"+ object + t.getMessage());
			return "Fail - Link Not Found";
		}
		
		return "Pass";
	}
	
	public static String verifyText(){
		System.out.println("Executing verifyText");
		String expected=APPTEXT.getProperty(object);
		String actual=driver.findElement(By.xpath(OR.getProperty(object))).getText();
		System.out.println(expected);
		System.out.println(actual);
		try{
			Assert.assertEquals(expected.trim(), actual.trim());
					
		}catch(Throwable t){
			// error
			System.out.println("Error in text - "+object);
			System.out.println("Actual - "+actual);
			System.out.println("Expected -"+ expected);
			return "Fail -"+ t.getMessage(); 
			
		}
		
		return "Pass";
		
	}
	
	public static String input(){
		
		System.out.println("Executing input Keyword");
		// extract the test data
		String data =testData.getCellData(currentTest, data_column_name , testRepeat);
		
		
		try{
			driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(data);
			}catch(Throwable t){
				// report error
				System.out.println("Error while wrinting into input -"+ object + t.getMessage());
				return "Fail - "+t.getMessage();
			}
			
			return "Pass";
	}
	
	
	public static String clickButton(){
		System.out.println("Executing clickButton Keyword");
		
		
		try{
			driver.findElement(By.xpath(OR.getProperty(object))).click();
			}catch(Throwable t){
				// report error
				System.out.println("Error while clicking on Button -"+ object + t.getMessage());
				return "Fail - "+t.getMessage();
			}
			
			return "Pass";
	}
	
	public static String select(){
		System.out.println("Executing select Keyword");
		// extract the test data
		String data =testData.getCellData(currentTest, data_column_name , testRepeat);
		
		
		
		try{
			driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(data);
			}catch(Throwable t){
				// report error
				System.out.println("Error while Selecting from droplist -"+ object + t.getMessage());
				return "Fail - "+t.getMessage();
			}
			
			return "Pass";
	}
	
	public static String clickCheckBox(){
     System.out.println("Executing clickCheckBox Keyword");
		
		try{
			driver.findElement(By.xpath(OR.getProperty(object))).click();
			}catch(Throwable t){
				// report error
				System.out.println("Error while clicking on checkbox -"+ object + t.getMessage());
				return "Fail - "+t.getMessage();
			}
			
			return "Pass";
	}
	
	public static String Wait() throws NumberFormatException, InterruptedException{
	     System.out.println("Executing wait Keyword");
	  // extract the test data
			String data =testData.getCellData(currentTest, data_column_name , testRepeat);
			
	     Thread.sleep(Long.parseLong(data));
	     return "Pass";
	}
		
	

}
