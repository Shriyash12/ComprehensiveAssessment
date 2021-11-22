package com.Comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive.uiStore.Headerlinkui;
import com.Comprehesive.reusablecomponents.Baseclass;

public class PageObjectheaderLink extends Baseclass{
	
	
	public PageObjectheaderLink(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getHeaderlink() {
		return driver.findElement(Headerlinkui.clickHeaderl);
	}
	
	public WebElement getFproduct() {
		return driver.findElement(Headerlinkui.clickFpro);
	}
	
	public WebElement getText() {
		return driver.findElement(Headerlinkui.clickTex);
	}								
	
}
