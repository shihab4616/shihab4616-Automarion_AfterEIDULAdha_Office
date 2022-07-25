package com.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Create_Extent_Report {

	public static void main(String[] args) {

		// This code website source: https://www.extentreports.com/docs/versions/5/java/index.html

		//This code for just create a extent report 
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Extent.html");
		extent.attachReporter(spark);

		extent.flush();

	}

}
