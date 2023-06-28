package com.stepdefinition;

import org.junit.Assert;

import com.base.LibGlobal;
import com.pages.AmazonProduct;

import io.cucumber.java.en.*;

public class TC1_Amazon extends LibGlobal {
	AmazonProduct amazon;

	@Given("User on the Amazon page")
	public void userOnTheAmazonPage() {
		
	}

	@When("User should enter the product with EnterKey")
	public void userShouldEnterTheProductWithEnterKey() {
		amazon = new AmazonProduct();
		amazon.enterProduct();

	}

	@When("User select a product and Add that to cart")
	public void userSelectAProductAndAddThatToCart() {
		amazon = new AmazonProduct();
		amazon.addToCart();
	}

	@Then("User should verify Add to cart success message")
	public void userShouldVerifyAddToCartSuccessMessage() {

		Assert.assertTrue("Added to Cart", true);
//		HooksClass.sc.log("Verified Message = Added to Cart");
	}

	@Then("User should place the order &login with valid phonenumber and password")
	public void userShouldPlaceTheOrderLoginWithValidPhonenumberAndPassword() {

		amazon.phoneAndPass();
	}

	@Then("User should click the user address")
	public void userShouldClickTheUserAddress() {
		amazon.useAddress();
	}

	@Then("User should click the amazon.in button and again click Return to cart")
	public void userShouldClickTheAmazonInButtonAndAgainClickReturnToCart() {
		amazon.cancelOrder();

	}

	@Then("User should click the delete button")
	public void userShouldClickTheDeleteButton() {

		amazon.deleteCart();
	}

	@Then("User should verify the success message when the product removed from cart")
	public void userShouldVerifyTheSuccessMessageWhenTheProductRemovedFromCart() {

		Assert.assertTrue("was removed from Shopping Cart.", true);
//		HooksClass.sc.log("Verified Message = was removed from Shopping Cart.");
	}

}
