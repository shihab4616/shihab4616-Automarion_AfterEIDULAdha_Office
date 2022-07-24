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
		
		//User Input username
		WebElement Username= driver.findElement(By.name("user_name"));
		Username.sendKeys("imikrof");
		Username.click();
		
		//User Input Password
		WebElement Password= driver.findElement(By.name("password"));
		Password.sendKeys("##imikrof@2021");
		Password.click();
		
		//Click For Login
		WebElement Login= driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
		Login.click();
		
 	}
	

	
}
