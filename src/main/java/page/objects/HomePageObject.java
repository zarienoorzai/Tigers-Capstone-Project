package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import core.Base;


public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement userOnHomepage;
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyBttn;
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement euroBttn;
	@FindBy(xpath = "//button//strong[text()='€']")
	private WebElement euroValueText;
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCartBttn;
	@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement shoppingCartEmptyMssg;
	
	
	public void userOnHomepage() {
		userOnHomepage.click();
	}
	
	public void clickOnCurrencyBttn() {
		currencyBttn.click();
		
	}
	public void chooseEuroCurrencyOption() {
		euroBttn.click();
		
	}
	public boolean isCurrencyChangedToEuro() {
		if(euroValueText.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	public void clickOnShoppingCartBttn() {
		shoppingCartBttn.click();
		
	}
	public String getShoppingCartEmptyText() {
		String cartEmpty = shoppingCartEmptyMssg.getText();
		return cartEmpty;
	}

}
