package step.definition;


import java.util.List;
import java.util.Map;
import org.junit.Assert;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObject;


public class DesktopPageStepDefinition extends Base{
	
	DesktopPageObject desktopPageObj = new DesktopPageObject();
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() throws InterruptedException {
	    desktopPageObj.hoverMouseOverElement();
	    desktopPageObj.clickOnDesktopTab();
	    logger.info("mouse was moved to Desktop tab successfully");
	    Thread.sleep(3000);
		
	}
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() throws InterruptedException {
		desktopPageObj.clickOnShowAllDesktopsLink();
		logger.info("Show all Desktop link clicked successfully");
		Thread.sleep(3000);
		
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws InterruptedException {
	    String expectedText = "Desktops";
	    String actualText = desktopPageObj.getDesktopTextFromUI();
	    Assert.assertEquals(expectedText, actualText);
	    logger.info("User reached Desktops page successfully");
	    Thread.sleep(3000);
	    
	}
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() throws InterruptedException {
	    desktopPageObj.clickOnAddToCartHp();
	    logger.info("HP LP3065 added to cart successfully");
	    Thread.sleep(3000);
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) throws InterruptedException {
	    desktopPageObj.clickOnQuantity1Hp();
	    Thread.sleep(3000);
	  
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() throws InterruptedException {
	    desktopPageObj.clickOnAddToCartBttnHp();
	    logger.info("Add to cart button clicked successfully");
	    Thread.sleep(3000);
	  
	}
	
	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) throws InterruptedException {
		String expectedText = "Success: You have added HP LP3065 to your shopping cart!";
		String actualText = desktopPageObj.getHPAddedToCartSuccessMssg(); 
		logger.info("HP added to cart success message displayed!");
		Thread.sleep(3000);
		
	}

	@When("And User click ADD TO CART option on Canon EOS 5D item")
	public void and_user_click_add_to_cart_option_on_canon_eos_5d_item() {
	    desktopPageObj.clickOnAddToCartCanonEos();
	    
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	   desktopPageObj.clickOnColorRedOption();
	   logger.info("Red color selected successfully");
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws InterruptedException {
	    String expectedText = "Success: You have added Canon EOS 5D Camera to your shopping cart!";
	    String actualText = desktopPageObj.getCanonEOSAddedToCartSuccessMssg();		
	    logger.info("Canon EOS added to cart success message displayed!");
	    Thread.sleep(3000);
	    
	}
	
	@When("User click on Canon EOS 5D item")
	public void User_click_on_Canon_EOS_5D_item() throws InterruptedException {
		desktopPageObj.clickOnCanonEosItemLink();
		logger.info("Canon EOS item clicked successfully");
		Thread.sleep(3000);
		
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() throws InterruptedException {
	   desktopPageObj.clickOnWriteReviewLink();
	   logger.info("Write a review link clicked successfully");
	   Thread.sleep(3000);
	   
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> reviewData = dataTable.asMaps(String.class, String.class);
	    desktopPageObj.enterName(reviewData.get(0).get("yourname"));
	    desktopPageObj.writeReview(reviewData.get(0).get("yourReview"));
	   desktopPageObj.badOrGoodReview(reviewData.get(0).get("Rating"));
	   Thread.sleep(5000);
	   
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() throws InterruptedException {
	   desktopPageObj.clickOnContinueBttn();
	   logger.info("Continue button clicked successfully");
	   Thread.sleep(3000);
	   
	}

	@Then("User should see a message with {string}”")
	public void user_should_see_a_message_with(String string) {
		Assert.assertTrue(desktopPageObj.isReviewSuccessMessagePresent());
		logger.info("Review submitted success message is displayed!");
	}
	
	
}



