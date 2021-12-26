package com.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxRadioButtonHelper {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public CheckBoxRadioButtonHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isSlected(WebElement element){
		boolean flag = element.isSelected();
		return flag;
	}
	
	public void selectCheckBox(WebElement element) {
		if(!isSlected(element))
			element.click();
	}
	
	public void unSelectCheckBox(WebElement element) {
		if(isSlected(element))
			element.click();
	}

}
