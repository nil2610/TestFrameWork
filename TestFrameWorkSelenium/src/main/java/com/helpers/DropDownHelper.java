package com.helpers;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public DropDownHelper(WebDriver driver){
		this.driver = driver;
	}
	
	public void selectByVaule(WebElement element, String value){
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void selectByIndex(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectVisibleText(WebElement element, String visibleText){
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public void deselectByVaule(WebElement element, String value){
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	
	public void deselectByIndex(WebElement element, int index){
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	
	public void deselectVisibleText(WebElement element, String visibleText){
		Select select = new Select(element);
		select.deselectByVisibleText(visibleText);
	}
	
	public boolean isMultiple(WebElement element){
		Select select =new Select(element);
		boolean isMultiple = select.isMultiple();
		return isMultiple;
	}
	
	public void deselectAll(WebElement element){
		Select select = new Select(element);
		select.deselectAll();
	}
	
	public WebElement getFirstSelectedOption(WebElement element){
		Select select = new Select(element);
		WebElement getFirstSelectedOption = select.getFirstSelectedOption();
		return getFirstSelectedOption;
	}
	
	public List<String> getAllDropDownData(WebElement element){
		Select select = new Select(element);
		List<WebElement> elementList = select.getOptions();
		List<String> valueList = new LinkedList<String>();
		for(WebElement ele: elementList){
			valueList.add(ele.getText());
		}
		return valueList;
	}
	
	public List<String> getAllSelectData(WebElement element){
		Select select = new Select(element);
		List<WebElement> elementList = select.getAllSelectedOptions();
		List<String> valueList = new LinkedList<String>();
		for(WebElement ele : elementList){
			valueList.add(ele.getText());
		}
		return valueList;
	}
}
