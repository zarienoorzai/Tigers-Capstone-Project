package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homePageObj = new HomePageObject();
	
	@Given("user is on Retail home Pagee")
	public void user_is_on_retail_home_pagee() throws InterruptedException {
		homePageObj.userOnHomepage();
		logger.info("user on homePage");
		Thread.sleep(3000);
	}
	

	@When("User click on Currency")
	public void user_click_on_currency() throws InterruptedException {
		homePageObj.clickOnCurrencyBttn();
	    logger.info("Currency button clicked successfully");
	    Thread.sleep(3000);
	    
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws InterruptedException {
		homePageObj.chooseEuroCurrencyOption();
		logger.info("Euro currency option clicked successfully");
		Thread.sleep(3000);
		
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws InterruptedException {
		Assert.assertTrue(homePageObj.isCurrencyChangedToEuro());
		logger.info("Currency value changed to Euro successfully");
		Thread.sleep(3000);
		
	}
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws InterruptedException {
		homePageObj.clickOnShoppingCartBttn();
		logger.info("Shopping cart button clicked successfully");
		Thread.sleep(3000);
	    
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws InterruptedException {
	    String expectedText = "Your shopping cart is empty!";
	    String actualText = homePageObj.getShoppingCartEmptyText();
	    logger.info("Shopping cart emtpy message displayed successfully");
	    Thread.sleep(3000);
	    
	}



}
