package com.stepdefinition;

import com.base.LibGlobal;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends LibGlobal {

	@Before
	public void beforeScnario() {
		getDriver("Chrome");
		getUrl("https://www.amazon.in/");
		maximizeWindow();
		implicitWaits(10);
	}

	@After

	public void afterScenario(Scenario scenario) {

		scenario.attach(screenShot(), "image/png", "Every Scenario");

		quitWindow();

	}
}
