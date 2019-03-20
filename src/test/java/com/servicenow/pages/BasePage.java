package com.servicenow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.servicenow.test.TestBase;

public abstract  class BasePage extends TestBase {

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public abstract void waitForPageToLoad();
	

}
