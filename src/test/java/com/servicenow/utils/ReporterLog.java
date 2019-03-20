package com.servicenow.utils;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReporterLog {
	
	
	@Test
	public void reporter() throws IOException{
		
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter("C:\\Users\\hp-pc\\Desktop\\ServiceStack\\ServiceNow\\Reports\\learn.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		
		ExtentTest logger = extentReports.createTest("CREATE NEW INCIDENT");
		
		logger.log(Status.INFO, "Tc_To Create New Incident");
		
		logger.log(Status.PASS,"Title verified");
		
		logger.pass("This is description", MediaEntityBuilder.createScreenCaptureFromPath("path of acreen shot").build());
		logger.pass("This is description", MediaEntityBuilder.createScreenCaptureFromPath("path of acreen shot").build());
		
	}

}
