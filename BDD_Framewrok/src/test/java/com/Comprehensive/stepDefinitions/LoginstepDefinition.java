package com.Comprehensive.stepDefinitions;

import org.apache.log4j.Logger;

import com.Comprehensive.pageObjects.PageObjectloginPage;
import com.Comprehensive.utilities.Exceltakesvalue;
import com.Comprehensive.utilities.ExtentLogUtilities;
import com.Comprehesive.reusablecomponents.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginstepDefinition extends Baseclass {
	PageObjectloginPage lp = new PageObjectloginPage(driver);
	public static Logger log;

	@Before("@1Login")
	public void getl() {
		test = report.startTest("Login page");
		log = Logger.getLogger(Baseclass.class.getName());
	}

	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
		driver = BaseSettings();
		driver.get(prop.getProperty("url"));
		log.info("driver initilaize");
	}

	@And("^User will land to Home page and click on sign in$")
	public void user_will_land_to_home_page_something_and_click_on_sign_in() throws Throwable {
		lp.getSignInButton().click();
		test.log(LogStatus.PASS, "Click on sign in");
		log.info("Click on sign in");
	}

	@When("^User enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
		String path=System.getProperty("user.dir");
		Exceltakesvalue exc = null;
		try {
			exc=new Exceltakesvalue(path+"\\TestData\\Comp1.xlsx","Sheet1");
			log.info("ExcelSheet opened");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Excel sheet noe accessible");
		}
		
		String name=exc.getData(0, 0);
		String pass=exc.getData(0, 1);
		log.info("Entering username");
		lp.getEmail().sendKeys(name);
		lp.getPassword().sendKeys(pass);
		test.log(LogStatus.PASS, "Credential enter");
    }

	@Then("^Click to login button$")
	public void click_to_login_button() throws Throwable {
		lp.getSignIn().click();
		test.log(LogStatus.PASS, "Login succssfully");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
		log.info("Login succssfully");
	}

	@After("@1Login")
	public void getll() {
		report.endTest(test);
		report.flush();
	}

	@Then("^browser close$")
	public void browser_close() throws Throwable {
		driver.quit();
	}

}
