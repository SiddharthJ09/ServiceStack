package com.servicenow.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.servicenow.utils.PropertyReader;


public class TestBase {
	public static WebDriver driver = null;
  @BeforeMethod
  public void beforeMethod() throws IOException {
//	  String URL = null;
//	 String s = PropertyReader.get(URL);
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\ServiceStack\\ServiceNow\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://dev53617.service-now.com/login.do"); 
//	  driver.get(s); 
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  
  }

}
