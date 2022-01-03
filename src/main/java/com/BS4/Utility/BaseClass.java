package com.BS4.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public  WebDriver driver;
public static configDataProvider config;
public static ExcelDataProvider excel;
public static Library Library;
@BeforeSuite
public void configData() throws Exception {
	config=new configDataProvider();
	excel=new ExcelDataProvider();
	Library=new Library();
}
	@Parameters({"browser"})
	@BeforeMethod
public void launchBrowser(String browser) {
  if(browser.equalsIgnoreCase("chrome")) {
	  WebDriverManager.chromedriver().setup();
  
	driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  if(browser.equalsIgnoreCase("firefox")) {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
	
	
	
}
