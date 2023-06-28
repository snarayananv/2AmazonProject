package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.base.LibGlobal;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = (""), snippets = SnippetType.CAMELCASE, dryRun = false, publish = true, plugin = { "pretty",
		"json:target\\output.json" }, features = "src\\test\\resources\\Features", glue = "com.stepdefinition")

public class TestRunnerClass extends LibGlobal {

	@AfterClass

	public static void afterclass() {
		Reporting.generateJvmReport("C:\\Users\\Xtreme\\eclipse-workspace\\Flipkart\\target\\output.json");
	}

}
