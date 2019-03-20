package com.servicenow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 @FindBy(xpath="//input[@id='user_name']")
	  public  WebElement txtboxUserName;
	 
	 @FindBy(xpath="//input[@id='user_password']")
	  public  WebElement txtboxPassword;
	 
	 @FindBy(xpath="//button[@id='sysverb_login']")
	  public  WebElement btnlogin;
	 
	 public void waitForPageToLoad(){
	 
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(txtboxUserName));
	 }
	 
	public void invoke(){
		
		
		txtboxUserName.sendKeys("rohit.khot");
		txtboxPassword.sendKeys("test");
		btnlogin.click();
	}
	 
	 
}
