package com.Comprehensive.uiStore;

import org.openqa.selenium.By;

public class LoginPageui {
	

	public static By signinButton = By.xpath("//a[@class='site-nav__link site-nav__link--icon signinlink']");
	public static By email = By.xpath("//input[@id='CustomerEmail']");
	public static By password = By.xpath("//input[@id='CustomerPassword']");
	public static By signin = By.xpath("//input[@value='Sign In']");
}
