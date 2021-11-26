package com.Comprehensive.stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.Comprehensive.pageObjects.PageObjectheaderLink;
import com.Comprehensive.utilities.ExtentLogUtilities;
import com.Comprehesive.reusablecomponents.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class HeaderlinkstepDefinition extends Baseclass{
   PageObjectheaderLink hl = new PageObjectheaderLink(driver);
   public static Logger log;

	@Before("@3Headerlink")
	public void getHe() {
		test=report.startTest("Header link");
		log=Logger.getLogger(Baseclass.class.getName());
	}
	
    @Then("^User land to home page and click the personalize gifts$")
    public void user_land_to_home_page_and_click_the_personalize_gifts() throws Throwable {
    	//This the Windows Functionality
        hl.getHeaderlink().sendKeys(Keys.CONTROL,Keys.ENTER);
        test.log(LogStatus.PASS, "Click on personalize gift");
        log.info("Click on personalize gift");
        
        //Iterator Window
        Set<String> ab=driver.getWindowHandles();
		Iterator<String> bc=ab.iterator();
		log.info("Handling Multiple Windows");
		String parentid=bc.next();
        driver.switchTo().window(parentid);
    }

    @Then("^User select the first product$")
    public void user_select_the_first_product() throws Throwable {
        hl.getFproduct().click();
        test.log(LogStatus.PASS, "Click on first product");
        log.info("Click on first product");
    }
    
    @Then("^User verify text$")
    public void user_verify_text() throws Throwable {
       Assert.assertTrue(hl.getText().isDisplayed());
       test.log(LogStatus.PASS, "Verify the text");
       ExtentLogUtilities.pass(driver, test, "Task Done", log);
       log.info("Verify the text");
    }
    
    @After("@3Headerlink")
    public void getHea() {
    	report.endTest(test);
    	report.flush();
    }


}
