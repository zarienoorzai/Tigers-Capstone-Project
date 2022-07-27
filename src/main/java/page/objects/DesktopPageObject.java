package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base{
	
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsLink;
	@FindBy(xpath = "//h2[text()='Desktops']")
	private WebElement desktopsPage;
	@FindBy(xpath = "(//span[text()='Add to Cart'] )[3]")
	private WebElement hpAddToCartBttn;
	@FindBy(xpath = "//input[@name='quantity' and @value='1']")
	private WebElement quantityOneOption;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartBttn;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement addedToCartSuccessMssg;
	@FindBy(xpath = "(//span[text()='Add to Cart'] )[2]")
	private WebElement canonEOSAddToCartBttn;
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement canonEOSColorDD;
	@FindBy(xpath = "//option[@value='15']")
	private WebElement canonEOSRedOption;
	@FindBy(xpath = "//h4//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOSItemLink;
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeAReviewLink;
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement nameField;
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement reviewField;
	@FindBy(xpath = "//input[@name='rating' and @value='1']")
	private WebElement badRatingBttn;
	@FindBy(xpath = "//input[@name='rating' and @value='5']")
	private WebElement goodRatingBttn;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueBttn;
	@FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])[1]")
	private WebElement reviewSubmittedSuccessMssg;
	
	
	public void hoverMouseOverElement() {
		Actions actions = new Actions(driver);
		actions.moveToElement(desktopTab);
		
	}
	public void clickOnDesktopTab() {
		desktopTab.click();
		
	}
	public void clickOnShowAllDesktopsLink() {
		showAllDesktopsLink.click();
		
	}
	public String getDesktopTextFromUI() {
		String desktopText = desktopsPage.getText();
		return desktopText;
		
	}
	public void clickOnAddToCartHp() {
		hpAddToCartBttn.click();
		
	}
	public void clickOnQuantity1Hp() {
		quantityOneOption.click();
	}
	
	public void clickOnAddToCartBttnHp() {
		addToCartBttn.click();
		
	}
	public String getHPAddedToCartSuccessMssg() {
		String hpAddedToCart = addedToCartSuccessMssg.getText();
		return hpAddedToCart;
		
	}
	public void clickOnAddToCartCanonEos() {
		canonEOSAddToCartBttn.click();
		
	}
	public void clickOnColorRedOption() {
		canonEOSColorDD.click();
		canonEOSRedOption.click();
		
	}
	public String getCanonEOSAddedToCartSuccessMssg() {
		String CanonEosAddedToCart = addedToCartSuccessMssg.getText();
		return CanonEosAddedToCart;
		
	}
	public void clickOnCanonEosItemLink() {
		canonEOSItemLink.click();
		
	}
	public void clickOnWriteReviewLink() {
		writeAReviewLink.click();
		
	}
	public void enterName(String name) {
		nameField.sendKeys(name);
		
	}
	public void writeReview(String review) {
		reviewField.sendKeys(review);
		
	}
	public void badOrGoodReview(String badOrGood) {
		badRatingBttn.click();
		goodRatingBttn.click();
		
	}
	public void clickOnContinueBttn() {
		continueBttn.click();
		
	}
	
	public boolean isReviewSuccessMessagePresent() {
		if (reviewSubmittedSuccessMssg.isDisplayed()) {
			return true;
		} else {
			return false;
		}

}

}
