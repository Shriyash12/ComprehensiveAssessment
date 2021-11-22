package com.Comprehensive.stepDefinitions;

import org.apache.log4j.Logger;

import com.Comprehensive.pageObjects.PageObjectclickHomeDecor;
import com.Comprehensive.utilities.ExtentLogUtilities;
import com.Comprehesive.reusablecomponents.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class DecorhomestepDefinition extends Baseclass {

	PageObjectclickHomeDecor hd = new PageObjectclickHomeDecor(driver);
	public static Logger log;

	@Before("@8Decor")
	public void getC() {
		test = report.startTest("Home Decor");
		log = Logger.getLogger(Baseclass.class.getName());
	}

	@Then("^User land to home page and click home decor section$")
	public void user_land_to_home_page_and_click_home_decor_section() throws Throwable {
		hd.getHomeDecor().click();
		test.log(LogStatus.PASS, "Click on Home Decor");
		log.info("Click on Home Decor");
	}

	@Then("^User select product$")
	public void user_select_product() throws Throwable {
		hd.getProd().click();
		test.log(LogStatus.PASS, "Click on product");
		log.info("Click on product");
	}

	@Then("^User click add bag$")
	public void user_click_add_bag() throws Throwable {
		hd.getClickAddtoBag().click();
		test.log(LogStatus.PASS, "Click on add to bag");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
		log.info("Click on add to bag");
		
	}

	@After("@8Decor")
	public void getCc() {
		report.endTest(test);
		report.flush();
	}

}
