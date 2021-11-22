package com.Comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive.uiStore.ClickLogoUI;
import com.Comprehesive.reusablecomponents.Baseclass;


public class ClickLogoPOM extends Baseclass {

	public ClickLogoPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAllofIt() {
		return driver.findElement(ClickLogoUI.clickAllOfIt);
	}

	public WebElement getFirstProduct() {
		return driver.findElement(ClickLogoUI.selectFirstProduct);
	}

	public WebElement getHomePage() {
		return driver.findElement(ClickLogoUI.backToHomePage);
	}

}
