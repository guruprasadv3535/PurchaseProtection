package PluginPom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreProductPage {

//	Declaration
	
	//All product list page
	@FindBy(xpath = "//select[@class='orderby']")
	private WebElement orderBy;

	@FindBy(className = "products")
	private List<WebElement> productList;

	@FindBy(xpath = "//h2[text()='Hand Sanitizer']")
	private WebElement handSanitizer;

	@FindBy(xpath = "//button[@name='add-to-cart']")
	private WebElement addToCart;

	// view cart slider frame elements
	@FindBy(xpath = "//div[@id='astra-mobile-cart-drawer']/descendant::a[text()='View cart']")
	private WebElement viewCart;

	@FindBy(xpath = "//div[@id='astra-mobile-cart-drawer']/descendant::a[text()='Checkout']")
	private WebElement checkOut;

	// view cart page to update the cart
	@FindBy(xpath = "//input[contains(@class,'qty text')]")
	private WebElement quantityField;
	
	@FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckout;

	@FindBy(xpath = "//button[text()='Update cart']")
	private WebElement updateCartButton;

	//Checkout page
	@FindBy(id = "place_order")
	private WebElement placeOrder;
	
	@FindBy(xpath = "(//div[@class='woocommerce-info'])[2]")
	private WebElement checkOutNote;
	
	@FindBy(xpath = "//label[@for='payment_method_vouch']")
	private WebElement paymetOption;
	
	@FindBy(id = "payment_method_vouch")
	private WebElement purchaseProtectionPayment;
	
	@FindBy(id = "payment_method_cod")
	private WebElement cashOnDelivery;
	

//    Initialization
	public StoreProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//    Utilization
	
	//All product list page
	public WebElement orderByElement() {
		return orderBy;
	}

	public List<WebElement> getProductListElement() {
		return productList;
	}

	public WebElement gethandSanitizerElement() {
		return handSanitizer;
	}

	public WebElement getAddToCartElement() {
		return addToCart;
	}

	//view cart slider frame elements
	public WebElement getViewCartElement() {
		return viewCart;
	}

	public WebElement getCheckOutElement() {
		return checkOut;
	}

	//view cart page to update the product
	public WebElement getQuantityFieldElement() {
		return quantityField;
	}
	
	public WebElement getProceedToCheckoutElement() {
		return proceedToCheckout;
	}

	public WebElement getUpdateCartButtonElement() {
		return updateCartButton;
	}

	//Checkout page
	public WebElement getPlaceOrderButtonElement() {
		return placeOrder;
	}
	
	public WebElement getCheckoutNoteElement() {
		return checkOutNote;
	}
	
	public WebElement getPaymentOptionElement() {
		return paymetOption;
	}

	public WebElement getPurchaseProtectionPaymentRadioElement() {
		return purchaseProtectionPayment;
	}
	
	public WebElement getCashOnDeliveryRadioElement() {
		return cashOnDelivery;
	}
}
