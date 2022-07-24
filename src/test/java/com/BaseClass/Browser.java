package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver driver;

	public static void main(String[] args) {

		Launch_Chrome();
		//Launch_Firefox();
		//Launch_Edge();

	}

	public static void Launch_Chrome() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

	public static void Launch_Firefox() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	
	public static void Launch_Edge() {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	public static void Open_URL(String URL) 
	{ 
		driver.get(URL);

	}	

}
