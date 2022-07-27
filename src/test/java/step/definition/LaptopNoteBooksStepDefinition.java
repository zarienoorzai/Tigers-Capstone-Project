package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;

public class LaptopNoteBooksStepDefinition extends Base{
	
	LaptopNoteBooksPageObject laptopNotebooksPageObj = new LaptopNoteBooksPageObject();
	
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws InterruptedException {
	    laptopNotebooksPageObj.clickOnLaptopsAndNotebooksTab();
	    logger.info("Laptops and Notebooks tab clicked successfully");
	    Thread.sleep(3000);
	    
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws InterruptedException {
		laptopNotebooksPageObj.clickOnShowAllLaptopsAndNotebooksLink();
		logger.info("Show All Laptops and Notebooks Link clicked successfully");
		 Thread.sleep(3000);
	    
	}
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() throws InterruptedException {
		laptopNotebooksPageObj.clickOnMacbookItem();
		logger.info("Macbook Item clicked successfully");
		 Thread.sleep(3000);
		 
	}
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’") 
		public void User_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws InterruptedException {
		String expectedText = "Success: You have added MacBook to your shopping cart!";
		String actualText =	laptopNotebooksPageObj.getMacbookAddedToCartSuccessMssg();
		logger.info("Macbook added to cart success message displayed");
		Thread.sleep(3000);
	    
	}
	@Then("User should see {int} item\\(s){double} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(Integer int1, Double double1) throws InterruptedException {
	    laptopNotebooksPageObj.getMacbookInCartText();
	    logger.info("1 Item, Macbook showing in cart text displayed");
	    Thread.sleep(3000);
	    
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
	    laptopNotebooksPageObj.clickOnCartLink();
	    logger.info("Cart option clicked successfully");
	    Thread.sleep(3000);
	    
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws InterruptedException {
	    laptopNotebooksPageObj.clickOnRemoveFromCartBttn();
	    logger.info("Macbook item removed from cart successfully");
	    Thread.sleep(3000);
		
	}
	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) throws InterruptedException {
	    laptopNotebooksPageObj.getCartEmptyText();
	    logger.info("Item removed and cart showing 0 items displayed");
	    Thread.sleep(3000);
	    
	}
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
		laptopNotebooksPageObj.clickOnProductCompareBttnMac();
		logger.info("Macbook Product Comparison icon clicked successfully");
		Thread.sleep(3000);
		
	}
	@When("User click on product comparison icon on ‘MacBook Air’")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
		laptopNotebooksPageObj.clickOnProductCompareBttnMacAir();
		logger.info("Macbook Air Product Comparison icon clicked successfully");
		Thread.sleep(3000);
		
	}
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void User_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws InterruptedException {
		String expectedText = "Success: You have added MacBook Air to your product comparison!";
		String actualText = laptopNotebooksPageObj.getProductCompareSuccessMssg();
	    logger.info("Product Comparison added success message displayed!");
	    Thread.sleep(3000);
		
	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		laptopNotebooksPageObj.clickOnProductComparisonLink();
		logger.info("Product Comparison link clicked successfully");  
		Thread.sleep(3000);
		
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws InterruptedException {
		Assert.assertTrue(laptopNotebooksPageObj.verifyProductComparisonPageText());
		logger.info("Product Comparison Chart page displayed!");		
		Thread.sleep(3000);
		
	}
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() throws InterruptedException {
	    laptopNotebooksPageObj.clickOnAddToWishListBttn();
	    logger.info("Sony Vaio item added to wishlist successfully");
	    Thread.sleep(3000);
	    
	}
	
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) throws InterruptedException {
		String expectedText = "You must login or create an account to save Sony VAIO to your wish list!";
		String actualText = laptopNotebooksPageObj.getWishListAlertMssg();
		logger.info("Wish list alert displayed successfully");
		Thread.sleep(3000);
		
	}
	@When("User click on MacBook Pro' item")
	public void user_click_on_mac_book_pro_item() throws InterruptedException {
	    laptopNotebooksPageObj.clickOnMacbookProLink();
	    logger.info("Macbook Pro item clicked successfully");
	    Thread.sleep(3000);
	    
	}
	@Then("User should see ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) throws InterruptedException {
	    Assert.assertTrue(laptopNotebooksPageObj.isMacbookProPriceDisplayed());
	    logger.info("Macbook Pro price displayed successfully");
	    Thread.sleep(3000);
	}



}
