package com.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {
	
	private WebDriver driver;
	
	public FrameHelper(WebDriver driver) {
		this.driver = driver;
	}
		
//	Switching to frame by frame index
	public void switchToFrame(int frameIndex){
		driver.switchTo().frame(frameIndex);
	}
	
//	Switching to frame by frame name
	public void switchToFrame(String frameName){
		driver.switchTo().frame(frameName);
	}
	
//	Switching to frame by WebElement of frame
	public void switchToFrame(WebElement element){
		driver.switchTo().frame(element);
	}
}
