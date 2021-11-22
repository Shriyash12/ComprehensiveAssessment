package com.Comprehensive.stepDefinitions;

import com.Comprehesive.reusablecomponents.Baseclass;

import io.cucumber.java.BeforeAll;
public class HookforExtentreport extends Baseclass{
	
	@BeforeAll
	public static void init()
	{
		initializeReport();
	}


}
