package com.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptHelper {
	
	private WebDriver driver;
	
	public JavaScriptHelper(WebDriver driver) {
		this.driver = driver;
	}

//	Execute JavaScript 
	public Object executeScript(String script){
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		return exe.executeScript(script);
	}

//	Execute JavaScript with multiple arguments
	public Object executeScript(String script, Object...args){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		return exe.executeScript(script,args);
	}
	
//	Scroll to the element
	public void scrollToElement(WebElement element){
		executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x,element.getLocation().y);
	}

//	Scroll to element and click on that
	public void scrollToElementAndClick(WebElement element){
		scrollToElement(element);
		element.click();
	}
	
//	Scroll till element view
	public void scrollIntoView(WebElement element){
		executeScript("arguments[0].scrollIntoView()",element);
	}
	
//	Scroll till element view and click
	public void scrollIntoViewAndClick(WebElement element){
		scrollIntoView(element);
		element.click();
	}

//	Scroll down vertically
	public void scrollDownVertically(){
		executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

//	Scroll up vertically
	public void scrollUpVertically(){
		executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
	
//	Scroll till to given pixel(e.g. pixel = 1000)
	public void scrollDownByPixel(int pixel){
		executeScript("window.scrollBY(0,"+pixel+")");
	}
	
	public void scrollUpByPixel(int pixel){
		executeScript("window.scrollBY(0,-"+pixel+")");
	}

//	Zooming screen by 100%
	public void zoomInBy100Percentage(){
		executeScript("document.body.style.zoom='100%'");
	}
	
//	Zooming screen by 60%
	public void zoomInBy60Percentage(){
		executeScript("document.body.style.zoom='40%'");
	}
	
//	Click on element by JavaScript
	public void clickElement(WebElement element){
		executeScript("arguments[0].click();", element);
	}
	

}
