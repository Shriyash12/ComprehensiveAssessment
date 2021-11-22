package com.Comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive.uiStore.GiftCardui;
import com.Comprehesive.reusablecomponents.Baseclass;

public class PageObjectgiftCard extends Baseclass{

	
	public PageObjectgiftCard(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickGift() {
		return driver.findElement(GiftCardui.clickGift);
	}
	
	public WebElement getClickMoney() {
		return driver.findElement(GiftCardui.clickM);
	}
	
	public WebElement getClickAddtoBag() {
		return driver.findElement(GiftCardui.clickAdd);
	}

}
