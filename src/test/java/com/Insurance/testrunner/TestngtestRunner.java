package com.Insurance.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;






@CucumberOptions
(features="Features",
glue="com.Insurance.stepdefs",
tags="@SeeyourQuote",
//format={"pretty","html:test-output" , "json:json_output/cucumber.json"},
monochrome=true,
dryRun=false
)

public class TestngtestRunner extends AbstractTestNGCucumberTests{

}
