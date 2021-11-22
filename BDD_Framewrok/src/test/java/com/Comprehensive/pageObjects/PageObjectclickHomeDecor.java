package com.Comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive.uiStore.HomeDecorui;
import com.Comprehesive.reusablecomponents.Baseclass;

public class PageObjectclickHomeDecor extends Baseclass{
	
	public PageObjectclickHomeDecor(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getHomeDecor() {
		return driver.findElement(HomeDecorui.clickHomeD);
	}
	
	public WebElement getProd() {
		return driver.findElement(HomeDecorui.clickFpro);
	}
	
	public WebElement getClickAddtoBag() {
		return driver.findElement(HomeDecorui.clickAdd);
	}
	
	

}
