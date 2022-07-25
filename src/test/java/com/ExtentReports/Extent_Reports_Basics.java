package com.ExtentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Extent_Reports_Basics {

	@Test
	public static void main(String[] args) {

		// This code website source: https://www.extentreports.com/docs/versions/5/java/index.html

		//Create ExtentReports and attached report
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReports.html");
		extent.attachReporter(spark);

		//This test case for PASS
		ExtentTest test1= extent.createTest("Launch Browser")
				//For assign Author Name
				.assignAuthor("Shihab Ahmed")
				//For assign test type
				.assignCategory("Smoke Test")
				//For assign web browser
				.assignDevice("Google Chrome"); 
		//For test passs
		test1.pass("This is passed");

		//This test case for Fail 
		ExtentTest test2= extent.createTest("This is Test-2")
				.assignAuthor("Asmin Khan")
				.assignCategory("Business Test")
				.assignDevice("Edge");
		//This is for fail test case use log
		test2.log(Status.FAIL,"This test case is fail");
		
		//This test case for warning
		ExtentTest test3= extent.createTest("This is Third Test")
				.assignAuthor("Shumul")
				.assignCategory("Functional Test")
				.assignDevice("FireFox");
		//This test is for WARNING
		test3.log(Status.WARNING, "This test case for warning");
		

		extent.flush();

	}

}



