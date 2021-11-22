package com.Comprehensive.stepDefinitions;

import org.apache.log4j.Logger;

import com.Comprehensive.pageObjects.CorporateGiftsPOM;
import com.Comprehensive.utilities.ExtentLogUtilities;
import com.Comprehesive.reusablecomponents.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class CorporatestepDefinition extends Baseclass{
	
	CorporateGiftsPOM co = new CorporateGiftsPOM(driver);
	public static Logger log;

	@Before("@Corporategift")
	public void getCor() {
		test = report.startTest("Corporate page");
		log = Logger.getLogger(Baseclass.class.getName());
	}

	    @Then("^User will land to homepage and Select Corporate Gifts from Navigation Bar$")
	    public void user_will_land_to_homepage_and_select_corporate_gifts_from_navigation_bar() throws Throwable {
	       co.getCorporategifts().click();
	       Thread.sleep(3000L);
	       test.log(LogStatus.PASS, "Select Corporate Gifts");
		   log.info("Select Corporate Gifts");
	    }

	    @Then("^Enter the Details in the form (.+) and (.+) and (.+) and (.+)$")
	    public void enter_the_details_in_the_form_and_and_and(String name, String email, String phone, String inquiry) throws Throwable {
	       co.getName().sendKeys(name);
	       test.log(LogStatus.PASS, "User enter name");
		   log.info("User enter name");
	       co.getEmail().sendKeys(email);
	       test.log(LogStatus.PASS, "User enter email");
		   log.info("User enter email");
	       co.getPhoneNo().sendKeys(phone);
	       test.log(LogStatus.PASS, "User enter phone");
		   log.info("User enter phone");
	       co.getinquiry().sendKeys(inquiry);
	       test.log(LogStatus.PASS, "User enter enquiry");
		   log.info("User enter enquiry");
	       
	    }

	    @Then("^Hit the inquire now$")
	    public void hit_the_inquire_now() throws Throwable {
	    	co.getSubmit().click();
	    	test.log(LogStatus.PASS, "User hit submit");
			ExtentLogUtilities.pass(driver, test, "Task Done", log);
			log.info("User hit submit");
	    	
	       
	    }
	    
	    @After("@Corporategift")
	    public void getCorp() {
	    	report.endTest(test);
	   	    report.flush();
	    }

}
