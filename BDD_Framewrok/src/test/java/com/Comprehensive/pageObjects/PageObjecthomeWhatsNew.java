package com.Comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive.uiStore.HomeWhatsNewui;
import com.Comprehesive.reusablecomponents.Baseclass;

public class PageObjecthomeWhatsNew extends Baseclass{
	
    public PageObjecthomeWhatsNew(WebDriver driver) {
		this.driver=driver;
		
	}
    
    public WebElement getWhatsNew() {
    	return driver.findElement(HomeWhatsNewui.clickWhats);
    }
    
    public WebElement getFProduct() {
    	return driver.findElement(HomeWhatsNewui.clickFpro);
    }
    
    public WebElement getSelectMonica() {
    	return driver.findElement(HomeWhatsNewui.selectM);
    }
    public WebElement getClickAddtobag() {
    	return driver.findElement(HomeWhatsNewui.clickAdd);
    }
}
