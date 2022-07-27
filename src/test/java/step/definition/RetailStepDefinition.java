package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	
	   RetailPageObject retailWebPage = new RetailPageObject();

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException {
		retailWebPage.clickOnRegisterForAffiliatAccount();
		logger.info("user clicked on register for an Affiliate Account");
		Thread.sleep(5000);
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> Affiliate = dataTable.asMaps(String.class, String.class);
		retailWebPage.enterCompanyName(Affiliate.get(0).get("company"));
		retailWebPage.enterWebSite(Affiliate.get(0).get("website"));
		retailWebPage.enterTaxId(Affiliate.get(0).get("taxID"));
		retailWebPage.choosePaymentMethod(Affiliate.get(0).get("paymentMethod"));
		retailWebPage.chequePayeeName(Affiliate.get(0).get("payeeName"));
		Thread.sleep(5000);
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() throws InterruptedException {
		retailWebPage.clickOnAboutUsButton();
		logger.info("user clicked on about us box");
		Thread.sleep(5000);
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() throws InterruptedException {
		retailWebPage.clickOnContinueButton();
		logger.info("user clicked on continue button");
		Thread.sleep(5000);
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws InterruptedException {
		retailWebPage.successTextIsDisplay();
		logger.info("user can see success taxt");
		Thread.sleep(5000);
	}

	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() throws InterruptedException {
		retailWebPage.clickOnEditYourAffiliateInformation();
		logger.info("user click on edit affiliate info");
		Thread.sleep(5000);

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws InterruptedException {
		retailWebPage.clickOnPayMethodBank();
		logger.info("user choosed bank transfer");
		Thread.sleep(5000);

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> BankInfo = dataTable.asMaps(String.class, String.class);
		retailWebPage.enterBankName(BankInfo.get(0).get("bankName"));
		retailWebPage.enterBankBranch(BankInfo.get(0).get("abaNumber"));
		retailWebPage.enterBankSwiftCode(BankInfo.get(0).get("swiftCode"));
		retailWebPage.enterBankAccountName(BankInfo.get(0).get("accountName"));
		retailWebPage.enterBankAccountNamber(BankInfo.get(0).get("accountNumber"));
		Thread.sleep(5000);

	}
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() throws InterruptedException {
		retailWebPage.clickOnEditYourInfo();
		logger.info("user clicked on edit account info" );
		Thread.sleep(5000);
	}
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> AccountInfo = dataTable.asMaps(String.class, String.class);
		retailWebPage.enterFirstName(AccountInfo.get(0).get("firstname"));
		retailWebPage.enterLastName(AccountInfo.get(0).get("lastName"));
		retailWebPage.enterEmail(AccountInfo.get(0).get("email"));
		retailWebPage.enterTelephone(AccountInfo.get(0).get("telephone"));
		Thread.sleep(5000);

	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(retailWebPage.isEditAccountInfoSuccessMessagePresent());
		logger.info("Edit Account info Success Message is displayed!");
	   
	}


}
