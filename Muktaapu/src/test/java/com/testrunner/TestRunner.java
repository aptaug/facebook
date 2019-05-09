package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"features"},
		glue = {"com.stepdef"},

		tags = {"@sampleFeature "}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
