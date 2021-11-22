package com.Comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive.uiStore.Headerhoverui;
import com.Comprehesive.reusablecomponents.Baseclass;

public class PageObjectheaderhover extends Baseclass {
	
	public PageObjectheaderhover(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getHovergifts() {
		return driver.findElement(Headerhoverui.hover);
	}
	
	public WebElement getFirstHoverPr() {
		return driver.findElement(Headerhoverui.clickfhoverPr);
	}
	
	public WebElement getFirstProduct() {
		return driver.findElement(Headerhoverui.clickFpro);
	}
	
	public WebElement getAddtoBag() {
		return driver.findElement(Headerhoverui.clickAdd);
	}
	

}
