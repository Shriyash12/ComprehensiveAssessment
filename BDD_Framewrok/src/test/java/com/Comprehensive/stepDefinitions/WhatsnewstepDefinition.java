package com.Comprehensive.stepDefinitions;

import org.apache.log4j.Logger;

import com.Comprehensive.pageObjects.PageObjecthomeWhatsNew;
import com.Comprehensive.utilities.ExtentLogUtilities;
import com.Comprehesive.reusablecomponents.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class WhatsnewstepDefinition extends Baseclass {

	PageObjecthomeWhatsNew wn = new PageObjecthomeWhatsNew(driver);
	public static Logger log;

	@Before("@9zwhatsnew")
	public void getWn() {
		test = report.startTest("Whats New Section");
		log = Logger.getLogger(Baseclass.class.getName());
	}

	@Then("^User land to home page and click whats new section$")
	public void user_land_to_home_page_and_click_whats_new_section() throws Throwable {
		wn.getWhatsNew().click();
		test.log(LogStatus.PASS, "Click on whats new section");
		log.info("Click on whats new section");
	}

	@Then("^User select f product$")
	public void user_select_f_product() throws Throwable {
		wn.getFProduct().click();
		test.log(LogStatus.PASS, "Click on first product");
		log.info("Click on first product");
	}

	@Then("^User select Monica$")
	public void user_select_monica() throws Throwable {
		wn.getSelectMonica().click();
		test.log(LogStatus.PASS, "Click on amonica model");
	}

	@Then("^User click Ad bag$")
	public void user_click_ad_bag() throws Throwable {
		wn.getClickAddtobag().click();
		test.log(LogStatus.PASS, "Click on add to bag");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
		log.info("Click on add to bag");
	}

	@After("@9zwhatsnew")
	public void getWnn() {
		report.endTest(test);
		report.flush();
	}

}
