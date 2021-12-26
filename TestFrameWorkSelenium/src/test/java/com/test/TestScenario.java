package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestScenario {
	
	WebDriver driver;
	BaseClass baseClass;
		
	@BeforeMethod
	public void setUp(){
		baseClass = new BaseClass();
		driver = baseClass.browserLaunch("chrome");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void testing() {
		driver.get("https://www.google.com/");
		System.out.println("Testing");
		driver.quit();
	}
	

}
