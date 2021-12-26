package com.helpers;

import org.openqa.selenium.WebDriver;

public class NavigationHelper {

	private WebDriver driver;
	
	public NavigationHelper(WebDriver driver){
		this.driver = driver;
	}
	
	public String getTitle(){
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public String getCurrentUrl(){
		String currentURL = driver.getCurrentUrl();
		return currentURL;
	}
	
	public void refreshPage(){
		driver.navigate().refresh();
	}
	
	public void navigateBack(){
		driver.navigate().back();
	}
	
	public void navigateForward(){
		driver.navigate().forward();
	}
	
	public void navigateURL(String url){
		driver.navigate().to(url);
	}

}
