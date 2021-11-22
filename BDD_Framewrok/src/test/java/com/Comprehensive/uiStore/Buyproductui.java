package com.Comprehensive.uiStore;

import org.openqa.selenium.By;

public class Buyproductui {
	
	public static By searchBar = By.xpath("//input[@placeholder='Search the awesome...']");
	public static By selectFirstProduct = By.xpath("//div[@id='snize-search-results-grid-mode']//span[@class='snize-overhidden'] ");
	public static By addToCart = By.xpath("//button[@name='add']");
	public static By clickGoToCheckout = By.xpath("//span[text()='Go To Checkout']");
	public static By cutWhatsapp = By.xpath("//img[@class='wa-optin-widget-close-img']");
	public static By fillEmail = By.xpath("//input[@id='checkout_email']");
	public static By fillFirstName = By.xpath("//input[@id='checkout_shipping_address_first_name']");
	public static By fillLastName = By.xpath("//input[@id='checkout_shipping_address_last_name']");
	public static By fillAddress = By.xpath("//input[@id='checkout_shipping_address_address1']");
	public static By fillLandmark = By.xpath("//input[@id='checkout_shipping_address_address2']");
	public static By fillCity = By.xpath("//input[@id='checkout_shipping_address_city']");
	public static By selectState = By.xpath("//select[@id='checkout_shipping_address_province']");
	public static By fillPinCode = By.xpath("//input[@id='checkout_shipping_address_zip']");
	public static By fillPhoneNo = By.xpath("//input[@id='checkout_shipping_address_phone']");
	public static By clickContinueShipping = By.xpath("//button[@id='continue_button']");

}
