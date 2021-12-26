package com.helpers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHelper {
	
	private WebDriver driver;
		
	public AlertHelper(WebDriver driver){
		this.driver = driver;
	}
	
	public Alert getAlert(){
		return driver.switchTo().alert();
	}
	
	public void acceptAlert(){
		getAlert().accept();
	}
	
	public void dismissAlert(){
		getAlert().dismiss();
	}
	
	public String getText(){
		String alertText = getAlert().getText();
		return alertText;
	}
	
	public void sendKeyToAlert(String textToAlert){
		getAlert().sendKeys(textToAlert);
	}

}
