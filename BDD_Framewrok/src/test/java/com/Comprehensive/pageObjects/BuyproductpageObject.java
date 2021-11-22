package com.Comprehensive.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive.uiStore.Buyproductui;
import com.Comprehesive.reusablecomponents.Baseclass;

public class BuyproductpageObject extends Baseclass{
	
	public BuyproductpageObject(WebDriver driver) {
		Baseclass.driver = driver;
	}
	
	public WebElement getclickSearchBar() {
		return driver.findElement(Buyproductui.searchBar);
	}

	public WebElement getFirstProduct() {
		return driver.findElement(Buyproductui.selectFirstProduct);
	}

	public WebElement getCart() {
		return driver.findElement(Buyproductui.addToCart);
	}

	public WebElement getCheckout() {
		return driver.findElement(Buyproductui.clickGoToCheckout);
	}

	public WebElement getWhatsapp() {
		return driver.findElement(Buyproductui.cutWhatsapp);
	}

	public WebElement getEmail() {
		return driver.findElement(Buyproductui.fillEmail);
	}

	public WebElement getFirstNmae() {
		return driver.findElement(Buyproductui.fillFirstName);
	}

	public WebElement getLastNmae() {
		return driver.findElement(Buyproductui.fillLastName);
	}

	public WebElement getAddress() {
		return driver.findElement(Buyproductui.fillAddress);
	}

	public WebElement getLandmark() {
		return driver.findElement(Buyproductui.fillLandmark);
	}

	public WebElement getCity() {
		return driver.findElement(Buyproductui.fillCity);
	}

	public WebElement getState() {
		return driver.findElement(Buyproductui.selectState);
	}

	public WebElement getPinCode() {
		return driver.findElement(Buyproductui.fillPinCode);
	}

	public WebElement getPhoneNo() {
		return driver.findElement(Buyproductui.fillPhoneNo);
	}

	public WebElement getContinueShipping() {
		return driver.findElement(Buyproductui.clickContinueShipping);
	}


}
