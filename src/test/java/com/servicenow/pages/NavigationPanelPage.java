package com.servicenow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationPanelPage extends BasePage {

	public NavigationPanelPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	 @FindBy(xpath="//input[@id='filter']")
	  public  WebElement txtboxFilterNavigator;
	 
	
	 @FindBy(xpath="//li[@id='concourse_module_14641d70c611228501114133b3cc88a1']")
	  public  WebElement linkCreateNew;
	 
	 
	 
	 public void waitForPageToLoad(){
		
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(txtboxFilterNavigator));
	 }

}
