package com.servicenow.pages;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.servicenow.utils.UtilityHelper;

public class OHRM_LoginPage extends BasePage {

	public OHRM_LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	  public  WebElement txtUsername;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	  public static WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	  public static WebElement btnLogin;
	
	@FindBy(xpath="//a[@id='welcome']")
	  public static  WebElement lnkWelcomeAdmin;
	
	@FindBy(xpath="//a[text()='Logout']")
	  public static WebElement lnkLogout;
	
	
	
	public void OHRM_Login() throws IOException {
		
		try {
//			UtilityHelper.setText(txtUsername, "Admin");
//			UtilityHelper.setText(txtPassword, "admin123")
//			UtilityHelper.Click(btnLogin, "Login Button");
			
			txtUsername.sendKeys("Admin");
			txtPassword.sendKeys("admin123");
			btnLogin.click();
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportStep().log(Status.FAIL, "Exception Occured");
		}
		
	}
	
	
	public static void OHRM_Logout() {
		
		try {
			
			UtilityHelper.Click(lnkWelcomeAdmin, "Click on Welcome Admin");
			Thread.sleep(2000);
			UtilityHelper.Click(lnkLogout, "Click on Logout");
			
		}
		catch(Exception e) {
			
		}
		
	}
	
	
	
	
	

	@Override
	public void waitForPageToLoad() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
