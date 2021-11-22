package com.Comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive.uiStore.HomeLatestui;
import com.Comprehesive.reusablecomponents.Baseclass;

public class PageObjectclickLatest extends Baseclass{

	public PageObjectclickLatest(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickla() {
		return driver.findElement(HomeLatestui.clicklatest);
	}
	
	public WebElement getclcika() {
		return driver.findElement(HomeLatestui.clickad);
	}
	
	
}
