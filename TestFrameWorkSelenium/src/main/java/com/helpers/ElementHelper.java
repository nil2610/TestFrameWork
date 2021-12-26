package com.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHelper{
	
	private WebDriver driver;
		
	public ElementHelper(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		waitForElementPresent(locator);
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		}catch (Exception e) {
			System.out.println("Some exception occurred while creating webelement " + locator);
		}
		return element;
	}
	
	public java.util.List<WebElement> getElements(By locator) {
		waitForElementPresent(locator);
		java.util.List<WebElement> elements  = null;
		try {
			elements = driver.findElements(locator);
						
		}catch (Exception e) {
			System.out.println("Some exception occurred while creating webelement " + locator);
		}
		return elements;
	}
	
	public void waitForElementPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
}
