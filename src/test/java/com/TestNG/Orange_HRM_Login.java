package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseClass.Browser;

public class Orange_HRM_Login extends Browser{

	/* Important Note For TestNG
	 * If you use static methood in TestNG your code don't rum show error so you can 
	 * Deny static methood if you don't deny static methood your code does not run
	 * */
	@Test
	public void  alu(){ //deny static methood 
		Launch_Chrome();
		Open_URL("https://opensource-demo.orangehrmlive.com");	
		//Login_TC_001();
		//NavigateToMyInfo();
	}

	//Login HRM Website: https://opensource-demo.orangehrmlive.com
	@Test
	public  void Login_TC_001() {//same here deny static methood
		//User ID For login 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//User password for login 
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
		//Click for login 
		driver.findElement(By.id("btnLogin")).click();	
	}
	
	@Test
	public void NavigateToMyInfo() {
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		driver.quit();
	}
		
	
}
