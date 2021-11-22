package com.Comprehensive.stepDefinitions;

import org.apache.log4j.Logger;

import com.Comprehensive.pageObjects.PageObjectclickLatest;
import com.Comprehensive.utilities.ExtentLogUtilities;
import com.Comprehesive.reusablecomponents.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class LateststepDefinition extends Baseclass {

	PageObjectclickLatest l = new PageObjectclickLatest(driver);

	public static Logger log;

	@Before("@9Latest")
	public void getL() {
		test = report.startTest("Latest section");
		log = Logger.getLogger(Baseclass.class.getName());
	}

	@Then("^User land to home page and click latest product$")
	public void user_land_to_home_page_and_click_latest_product() throws Throwable {
		l.getClickla().click();
		test.log(LogStatus.PASS, "Select Latest of first product");
		log.info("Select Latest of first product");
	}

	@Then("^User click addtob$")
	public void user_click_addtob() throws Throwable {
		l.getclcika().click();
		test.log(LogStatus.PASS, "Click on add to bag");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
		log.info("Click on add to bag");
	}

	@After("@9Latest")
	public void getLl() {
		report.endTest(test);
		report.flush();
	}

}
