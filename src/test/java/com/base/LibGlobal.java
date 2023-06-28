package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;

	public void getDriver(String browserType) {

		switch (browserType) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Firebox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "Io":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

	public void maximizeWindow() {

		driver.manage().window().maximize();

	}

	public void getUrl(String url) {

		driver.get(url);

	}

	public byte[] screenShot() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		byte[] screenshotAs = ss.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;

	}

	public void quitWindow() {
		driver.quit();

	}



	public void insertValue(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void insertValueWithEnter(WebElement e, String value) {
		e.sendKeys(value, Keys.ENTER);
	}

	public void refresh() {
		driver.navigate().refresh();

	}

	public void click(WebElement element) {

		element.click();
	}

	public void implicitWaits(long seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public void selectVisibleText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public String elementGetAttribute(WebElement element, String name) {

		String attribute = element.getAttribute(name);
		return attribute;
	}

	public Alert alert() {

		Alert alert = driver.switchTo().alert();
		return alert;

	}

	public String elementGetText(WebElement element) {

		String text = element.getText();
		return text;

	}
}
