package com.servicenow.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import com.servicenow.pages.IncidentNewRecordPage;
import com.servicenow.pages.LoginPage;
import com.servicenow.pages.NavigationPanelPage;
import com.servicenow.utils.UtilityHelper;

public class SN_MainTest extends TestBase{

		
	
	
	@Test(dataProvider = "Data")
	
	
	public void sn_IncidentTest() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitForPageToLoad();
		loginPage.invoke();
		
		
		
		NavigationPanelPage nPage = new NavigationPanelPage(driver);
		nPage.waitForPageToLoad();
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Homepage 1 | ServiceNow";
		UtilityHelper.verifyTitle(actualTitle, expectedTitle);
		nPage.txtboxFilterNavigator.sendKeys("Incident");
		UtilityHelper.waitForElement(nPage.linkCreateNew);
		nPage.linkCreateNew.click();
		
		IncidentNewRecordPage incidentNewRecordPage = new IncidentNewRecordPage(driver);
		incidentNewRecordPage.waitForPageToLoad();
		
		
		
		
		
		
			
		
	}
	
	
}
