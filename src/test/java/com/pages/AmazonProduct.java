package com.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class AmazonProduct extends LibGlobal {

	public AmazonProduct() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBox;

	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")
	private WebElement productClick;

	@FindBy(id = "add-to-cart-button")
	private WebElement addCart;

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement proceedCheckout;

	@FindBy(id = "ap_email")
	private WebElement phoneNumber;

	@FindBy(id = "ap_password")
	private WebElement password;

	@FindBy(xpath = "(//input[@class='a-button-input'])[2]")
	private WebElement useAddress;

	@FindBy(xpath = "//i[@class='a-icon a-icon-logo clickable-heading']")
	private WebElement checkoutCancel;

	@FindBy(xpath = "//a[contains(text(),'Return to Cart')]")
	private WebElement returnToCart;

	@FindBy(xpath = "(//input[@class='a-color-link'])[1]")
	private WebElement cartDelete;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getProductClick() {
		return productClick;
	}

	public WebElement getAddCart() {
		return addCart;
	}

	public WebElement getProceedCheckout() {
		return proceedCheckout;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUseAddress() {
		return useAddress;
	}

	public WebElement getCheckoutCancel() {
		return checkoutCancel;
	}

	public WebElement getReturnToCart() {
		return returnToCart;
	}

	public WebElement getCartDelete() {
		return cartDelete;
	}

	public void enterProduct() {
		insertValueWithEnter(getSearchBox(), "oneplus bluetooth earphones");
		click(productClick);
	}

	public void addToCart() {

		String parWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String eachWindow : allWindow) {
			if (!parWindow.equals(eachWindow)) {
				driver.switchTo().window(eachWindow);
			}
		}

		click(addCart);

	}

	public void phoneAndPass() {

		click(proceedCheckout);
		insertValueWithEnter(getPhoneNumber(), "9790383744");
		insertValueWithEnter(getPassword(), "vikravan");

	}

	public void useAddress() {

		refresh();
		click(useAddress);

	}

	public void cancelOrder() {

		click(checkoutCancel);
		click(returnToCart);

	}

	public void deleteCart() {

		click(cartDelete);

	}

}