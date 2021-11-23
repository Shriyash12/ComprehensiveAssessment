package com.Comprehensive.stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.Comprehensive.pageObjects.BuyproductpageObject;
import com.Comprehensive.utilities.ExtentLogUtilities;
import com.Comprehesive.reusablecomponents.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyproductstepDefinition extends Baseclass{
	
	BuyproductpageObject by = new BuyproductpageObject(driver);
	
	public static Logger log;

	@Before("@Buyproduct")
	public void getCl() {
		test = report.startTest("Buy Product");
		log = Logger.getLogger(Baseclass.class.getName());
	}

    @When("^User will land to homepage and Search for (.+) by entering keys in Search bar$")
    public void user_will_land_to_homepage_and_search_for_by_entering_keys_in_search_bar(String product) throws Throwable {
    	by.getclickSearchBar().sendKeys(product, Keys.ENTER);
    	Thread.sleep(3000L);
	    test.log(LogStatus.PASS, "User enter data in search bar");
		log.info("User enter data in search bar");
    }

    @Then("^Select the product$")
    public void select_the_product() throws Throwable {
    	by.getFirstProduct().click();
    	test.log(LogStatus.PASS, "Click on first product");
 		log.info("Click on first product");
        
    }

    @Then("^Add product to cart to buy$")
    public void add_product_to_cart_to_buy() throws Throwable {
    	by.getCart().click();
    	test.log(LogStatus.PASS, "Click to cart");
 		log.info("Click to cart");
       
    }
    
    @Then("^Add to checkout$")
    public void add_to_checkout() throws Throwable {
        by.getCheckout().click();
        test.log(LogStatus.PASS, "Click to checkout");
 		log.info("Click to checkout");
    }

    @Then("^User cut the whatsapp login$")
    public void user_cut_the_whatsapp_login() throws Throwable {
    	by.getWhatsapp().click();
    	test.log(LogStatus.PASS, "Click on whatsapp cut");
 		log.info("Click on whatsapp cut");
       
    }

    @Then("^Fill the Delivery details (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) and (.+) continue$")
    public void fill_the_delivery_details_and_continue(String mail, String fname, String lname, String add, String landmark, String state, String city, String pin, String phone) throws Throwable {
        by.getEmail().sendKeys(mail);
        test.log(LogStatus.PASS, "User enter mail");
 		log.info("User enter mail");
        by.getFirstNmae().sendKeys(fname);
        test.log(LogStatus.PASS, "User enter name");
 		log.info("User enter name");
        by.getLastNmae().sendKeys(lname);
        test.log(LogStatus.PASS, "User enter lname");
 		log.info("User enter lname");
        by.getAddress().sendKeys(add);
        test.log(LogStatus.PASS, "User enter add");
 		log.info("User enter add");
        by.getLandmark().sendKeys(landmark);
        test.log(LogStatus.PASS, "User enter landmark");
 		log.info("User enter landmark");
        by.getCity().sendKeys(city);
        Select sel = new Select(by.getState());
		sel.selectByIndex(22);
        by.getPinCode().sendKeys(pin);
        test.log(LogStatus.PASS, "User enter pin");
 		log.info("User enter pin");
        by.getPhoneNo().sendKeys(phone);
        test.log(LogStatus.PASS, "User enter phone");
 		log.info("User enter phone");
    }
    
    @Then("^Continue shopping order placed$")
    public void continue_shopping_order_placed() throws Throwable {
    	by.getContinueShipping().click();
    	test.log(LogStatus.PASS, "User hit submit");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
		log.info("User hit submit");
        
    }
    
    @After("@Buyproduct")
    public void getCorp() {
    	report.endTest(test);
   	    report.flush();
    }

}
