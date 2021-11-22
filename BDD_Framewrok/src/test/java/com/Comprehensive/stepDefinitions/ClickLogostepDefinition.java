package com.Comprehensive.stepDefinitions;

import org.apache.log4j.Logger;

import com.Comprehensive.pageObjects.ClickLogoPOM;
import com.Comprehensive.utilities.ExtentLogUtilities;
import com.Comprehesive.reusablecomponents.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ClickLogostepDefinition extends Baseclass {
	
	ClickLogoPOM lo = new ClickLogoPOM(driver);
	public static Logger log;

	@Before("@Clicklogo")
	public void getCl() {
		test = report.startTest("Logo page");
		log = Logger.getLogger(Baseclass.class.getName());
	}
	    @Then("^User will land to homepage Click All of it from Header Section$")
	    public void user_will_land_to_homepage_click_all_of_it_from_header_section() throws Throwable {
	       lo.getAllofIt().click();
	       Thread.sleep(3000L);
	       test.log(LogStatus.PASS, "Click on All of it");
		   log.info("Click on All of it");
	    }

	    @And("^Select the product from All of it Results$")
	    public void select_the_product_from_all_of_it_results() throws Throwable {
	      lo.getFirstProduct().click();
	      test.log(LogStatus.PASS, "Select product");
		  log.info("Select product");
	    }

	    @And("^Click on the logo on top navigate back to Landing Page$")
	    public void click_on_the_logo_on_top_navigate_back_to_landing_page() throws Throwable {
	      lo.getHomePage().click();
	      test.log(LogStatus.PASS, "Back to Home Page");
		  ExtentLogUtilities.pass(driver, test, "Task Done", log);
		  log.info("Back to Home Page");
	    }
       @After("@Clicklogo") 
       public void getClo() {
    	   report.endTest(test);
   		   report.flush();
       }

}
