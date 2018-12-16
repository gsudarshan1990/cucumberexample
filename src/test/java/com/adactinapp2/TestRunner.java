package com.adactinapp2;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 * {"pretty:output\index.html"}
 *  
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature" , glue="steps" , plugin= {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Reports\\cucumber-extent\\report.html"})
public class TestRunner {
	

	@AfterClass
	public static void reportSetup()
	{

		Reporter.loadXMLConfig("src//test//resources//extent-config.xml");
	}

}
