package com.lumen.runner;


import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;
import com.lumen.pages.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile/Test.feature",                                                                 //the path of the feature files
	  glue={"Stepdef"},                                                                                             //the path of the step definition files
	  format= {"pretty",
			"html:target/cucumber-reports/cucumber-pretty",
			"json:target/cucumber-reports/CucumberTestReport.json", 
			"rerun:target/cucumber-reports/re-run.txt"},                                                           //to generate different types of reporting
	    strict =false,                                                                                             //it will check if any step is not defined in step definition file
	    dryRun =false,                                                                                            //to check the mapping is proper between feature file and step def file
	    monochrome = true,
	    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})



public class Testrunners {

	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 }
	
}
