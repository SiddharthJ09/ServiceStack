package com.servicenow.utils;






import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.servicenow.pages.BasePage;

import junit.framework.Assert;

public  class UtilityHelper extends BasePage {

	
	public static Logger log = Logger.getLogger("devpinoyLogger"); 
	
	UtilityHelper(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void waitForElement(WebElement webElement){
		
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(webElement));
		
	}
	
	
	public static void verifyText(String actual, String expected){
		
		 log.info("Comparing "+actual+" with "+expected);
		 if(actual.equalsIgnoreCase(expected)){
			 log.info(actual+" matching with "+expected);
			
		 }else{
			 log.info(actual+" not matching with "+expected);
			 Assert.assertEquals(expected, actual);
			 
		 }
		
		
	}
	
	public static void verifyTitle(String actual, String expected){
		
		 log.info("Comparing title"+actual+" with "+expected);
		 if(actual.contains(expected)){
			 log.info(actual+" Title verified");
			
		 }else{
			 log.info(actual+" Title not matching with "+expected);
			 Assert.assertEquals(expected, actual);
			 
		 }
		
		
	}

	@Override
	public void waitForPageToLoad() {
				
	}
	 	
}
