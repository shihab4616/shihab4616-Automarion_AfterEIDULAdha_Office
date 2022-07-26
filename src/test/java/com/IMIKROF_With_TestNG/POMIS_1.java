package com.IMIKROF_With_TestNG;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.Login.imikrorf_Login;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class POMIS_1 extends imikrorf_Login{

	//create a Extent Report for POMIS-1 
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/POMIS-1.html");

	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		extent.attachReporter(spark);
	}


	@Test
	public  void main() {
		Launch_Chrome();
		Open_URL("https://timf.imikrof.com");
		Login_TC_001();
		POMIS2_TC_001();
	}

	@Test
	public void POMIS2_TC_001(){
		//Use extent for assign author and other detail's
		ExtentTest test= extent.createTest("This test for click link text")//For test name
		.assignAuthor("Shihab Ahmed")//For author name 
		.assignCategory("Smoke Test")//Test name
		.assignDevice("Google Chrome");//Browser name
		 
		
		//CLick Reports Menu
		driver.findElement(By.linkText("Reports")).click();
		//For extent report
		test.log(Status.PASS, "Click report is success");

		//CLick Drpodown menu 1 PKSF-POMIS Reports
		driver.findElement(By.linkText("1 PKSF-POMIS Reports")).click();
		//For extent report
		test.log(Status.FAIL, "Click report is Fail");

		//Again clik dropdown menu 1.1 PKSF POMIS-1 Report
		driver.findElement(By.linkText("1.1 PKSF POMIS-1 Report")).click();
		//For extent report
		test.log(Status.SKIP, "Click report is Skipe");

		//Clik Report Level: Branch
		driver.findElement(By.id("report_level")).sendKeys("Branch");
		//For extent report
		test.log(Status.WARNING, "Click report is Warning");

		/*This is another author assign (This author name is Asmin khan)*/
		//Use extent for assign author and other detail's
	    extent.createTest("This test for Click Brach")//For test name
		.assignAuthor("Asmin Khan")//For author name 
		.assignCategory("Regression Test")//Test name
		.assignDevice("Edge");//Browser name
		
		//Clik Branch 0003 Pirob Branch
		driver.findElement(By.id("filter_bazr_info")).click();
		driver.findElement(By.id("filter_bazr_info")).sendKeys("0003 - Pirob Branch");
		driver.findElement(By.id("filter_bazr_info")).click();
		//This is test case pass extent report
		test.log(Status.PASS, "The branch code send success");

		//Clik Month: June
		driver.findElement(By.name("cbo_month")).click();
		driver.findElement(By.name("cbo_month")).sendKeys("June");
		driver.findElement(By.name("cbo_month")).click();
		//This is for extent report 
		test.log(Status.PASS, "MOnth code send success");

		//Clik Year: 2021
		driver.findElement(By.name("cbo_year")).click();
		driver.findElement(By.name("cbo_year")).sendKeys("2021");
		driver.findElement(By.name("cbo_year")).click();
		//This code for extent 
		test.log(Status.FAIL, "Year code send fail");

		/*This is another author assign by TestNG reports*/
		//Use extent for assign author and other detail's
	    extent.createTest("This test for Click Brach")//For test name
		.assignAuthor("Shimul")//For author name 
		.assignCategory("Sanity Test")//Test name
		.assignDevice("Opera");//Browser name
	    
		//Click for search POMIS-2 Reports Data 
		driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/table/tbody/tr[2]/td[7]/button"))
		.click();
		test.log(Status.PASS, "Click login success");

		//Thread.sleep(4000); when i use this code not working i don't find this problem.  
 
	}

	@AfterTest
	public void AfterTest() {
		extent.flush();
	}


}
