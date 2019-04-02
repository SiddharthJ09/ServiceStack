package com.servicenow.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.servicenow.pages.OHRM_AddEmployeePage;
import com.servicenow.pages.OHRM_LoginPage;
import com.servicenow.pages.OHRM_MenuBar;

public class OHRM_AddEmployee extends TestBase{
	

	@Test
	public void fnOHRM_AddEmployee() throws IOException {
		
		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			OHRM_LoginPage login = new OHRM_LoginPage(driver);
			login.OHRM_Login();
			
			
			OHRM_MenuBar menu = new OHRM_MenuBar(driver);
			
			menu.lblPIM.click();
			Thread.sleep(2000);
			menu.btnAdd.click();
			
			OHRM_AddEmployeePage addEmployee = new OHRM_AddEmployeePage(driver);
			addEmployee.txtFirstName.sendKeys("Siddharth");
			addEmployee.txtLastName.sendKeys("Jadhav");
			addEmployee.btnSave.click();
					
			
			
		}
		
		catch(Exception e) {
			
		}
		
		finally {
			OHRM_LoginPage.OHRM_Logout();
		}
		
		
		
		
		
	}

	
	

}
