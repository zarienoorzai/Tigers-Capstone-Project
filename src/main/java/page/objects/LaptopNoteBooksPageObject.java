package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base{
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksTab;
	@FindBy(xpath= "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksLink;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macbookItem;
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartBttn;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement macAddedToCartSuccessMssg;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotalDisplay;
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement removeItemFromCartBttn;
	@FindBy(xpath = "(//button[@type='button'])[14]")
	private WebElement productComparisonBttnMacbook;
	@FindBy(xpath = "(//button[@type='button'])[18]")
	private WebElement productCompareBttnMacbookAir;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement productCompareSuccessMssg;
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement productComparisonChartPage;
	@FindBy(xpath = "(//button[@type='button'])[22]")
	private WebElement addToWishListBttn;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement wishListAlertMssg;
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macbookProLink;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macbookProPriceText;
	
	
	
	public void hoverMouseOverElement() {
		Actions actions = new Actions(driver);
		actions.moveToElement(laptopsAndNotebooksTab);
	
	}
	public void clickOnLaptopsAndNotebooksTab() {
		laptopsAndNotebooksTab.click();
		
	}
	public void clickOnShowAllLaptopsAndNotebooksLink() {
		showAllLaptopsAndNotebooksLink.click();
		
	}
	public void clickOnMacbookItem() {
		macbookItem.click();
		
	}
	public void clickOnAddToCartBttnMacbook() {
		addToCartBttn.click();
		
	}
	public String getMacbookAddedToCartSuccessMssg() {
		String macbookAddedToCart = macAddedToCartSuccessMssg.getText();
		return macbookAddedToCart;
		
	}
	public String getMacbookInCartText() {
		String macbookInCart = cartTotalDisplay.getText();
		return macbookInCart;
		
	}
	public void clickOnCartLink() {
		cartTotalDisplay.click();
		
	}
	public void clickOnRemoveFromCartBttn() {
		removeItemFromCartBttn.click();
		
	}
	public String getCartEmptyText() {
		String emptyCart = cartTotalDisplay.getText();
		return emptyCart;
		
	}
	public void clickOnProductCompareBttnMac() {
		productComparisonBttnMacbook.click();
		
	}
	public void clickOnProductCompareBttnMacAir() {
		productCompareBttnMacbookAir.click();
		
	}
	public String getProductCompareSuccessMssg() {
		String successMssg = productCompareSuccessMssg.getText();
		return successMssg;
		
	}
	public void clickOnProductComparisonLink() {
		productComparisonLink.click();
		
	}
	public boolean verifyProductComparisonPageText() {
			if (productComparisonChartPage.isDisplayed()) {
				return true;
			} else {
				return false;
			}
			
	}
	public void clickOnAddToWishListBttn() {
		addToWishListBttn.click();
		
	}
	public String getWishListAlertMssg() {
		String wishListAlert = wishListAlertMssg.getText();
		return wishListAlert;
		
	}
	public void clickOnMacbookProLink() {
		macbookProLink.click();
		
	}
	public boolean isMacbookProPriceDisplayed() {
		if (macbookProPriceText.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	

}
