package com.TestNG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_With_TestNG {
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/TestNG.html");

	/*jokhon amra test case k alada alada na likhbo tokhon 
	attach report ta main function er vitore hobe na hoile error asbe*/
	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		System.out.println("This is for spark");
		extent.attachReporter(spark);

	}	
	/* extent.flush use na korle html file create hobe na html file 
	 create kore hoile amder k must be eita use korte hobe.*/
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("This is for flush");
		extent.flush();

	}
	
	
	
	@Test
	public void pass() { 

		//For author name test name and browser name detail's
		ExtentTest test= extent.createTest("Launch Browser & Website").assignAuthor("Shihab Ahmed")
				.assignCategory("Smoke Test").assignDevice("Google Chrome");
		//for user log test
		test.log(Status.PASS, "Launch Browser & Website");
		//for user pass test
		test.pass("User Launced Website Varified");

	}
	
	@Test
	public void warning() {
		//For tester details and browser details
		ExtentTest test= extent.createTest("Login Varify")
				.assignAuthor("Asmin Khan")
				.assignCategory("Sanity Test")
				.assignDevice("Opera");
		//FOr user detalils
		test.log(Status.INFO, "THis is login info");//For info  
		//For Test case pass
		test.log(Status.PASS,"This is for pass test case");
		//For Warning Test case
		test.log(Status.WARNING, "This is for test case warnig");
		
	}

	@Test
	public void skip() {
		//For tester details and browser details
		ExtentTest test= extent.createTest("This is for Dashboard")
				.assignAuthor("Shimul")
				.assignCategory("Regression Test")
				.assignDevice("Edge");
		//For test case info
		test.log(Status.INFO,"This test for skip");
		//For skip any test case
		test.log(Status.SKIP, "SKip this case");
		
	}


	
}