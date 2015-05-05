package com.smithapp.mrcp.PolicyTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class productionTest {
WebDriver driver = null;
@Before

public void beforeProd(){

	driver = new FirefoxDriver();
	
	driver.get("http://mrandmrssmith.com");
}
	
@Test
public void testprod(){
	driver.findElement(By.xpath("//*[@id='hotelSearch']")).sendKeys("3 negas");
}
}//