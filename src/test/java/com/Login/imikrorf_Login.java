package com.Login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.BaseClass.Browser;

public class imikrorf_Login extends Browser{

	public static void main(String[] args) {
		Launch_Chrome();
		Open_URL("https://timf.imikrof.com");
		Login_TC_001();
	}


	//Imikrof Login 
	public static void Login_TC_001() {

		//Please enter your emeil address (For login imikrof) 
		driver.findElement(By.name("user_name")).sendKeys("imikrof");
		//Please enter your password (For login imikrof) 
		driver.findElement(By.name("password")).sendKeys("##imikrof@2021");
		//Please click for login IMIKROF 
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"))
		.click();
	}




}
