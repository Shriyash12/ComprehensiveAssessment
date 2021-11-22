package com.Comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive.uiStore.LoginPageui;
import com.Comprehesive.reusablecomponents.Baseclass;



public class PageObjectloginPage extends Baseclass{
	
	
	public PageObjectloginPage(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getSignInButton() {
		return driver.findElement(LoginPageui.signinButton);
	}

	public WebElement getEmail() {
		return driver.findElement(LoginPageui.email);
	}

	public WebElement getPassword() {
		return driver.findElement(LoginPageui.password);
	}

	public WebElement getSignIn() {
		return driver.findElement(LoginPageui.signin);
	}

}
