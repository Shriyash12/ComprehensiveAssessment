package com.Comprehensive.runnerClass;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = "com.Comprehensive.stepDefinitions")
public class TestrunnerClass extends AbstractTestNGCucumberTests {

}