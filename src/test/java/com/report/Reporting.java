package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.base.LibGlobal;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends LibGlobal {

	public static void generateJvmReport(String jsonFile) {

		File file = new File("C:\\Users\\Xtreme\\eclipse-workspace\\Flipkart\\target");

		Configuration configuration = new Configuration(file, "Flipkart Automation");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}
}
