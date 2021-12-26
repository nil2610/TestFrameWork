package com.helpers;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHelper {
	
	private WebDriver driver;
	
	public WindowHelper(WebDriver driver){
		this.driver = driver;
	}
	
	public void switchToParentWindow() {
		driver.switchTo().defaultContent();
	}
		
//	Switch to child window by index 	
	public void switchToWindow(int index) {
		Set<String> windows = driver.getWindowHandles();
		int i = 1;
		for (String window : windows) {
			if (i == index) {
				driver.switchTo().window(window);
			} else {
				i++;
			}
		}
	}

//	Closed all tab window and switch to main window	
	public void closeAllTabsAndSwitchToMainWindow() {
		Set<String> windows = driver.getWindowHandles();
		String mainwindow = driver.getWindowHandle();
		for (String window : windows) {
			if (!window.equalsIgnoreCase(mainwindow)) {
				driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
	}
}