package PluginPom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

//	Declaration

	@FindBy(xpath = "//div[text()='Amount to be paid before charges']/preceding-sibling::div")
	private WebElement amountPaying;

	@FindBy(xpath = "//div[@class='css-1rynq56 r-lrvibr']")
	private WebElement checkoutBackwardButton;

	/*
	 * UPI payment mode declaration
	 */
	@FindBy(xpath = "//div[text()='ADD NEW UPI']/parent::div")
	private WebElement addUpi;
	
	@FindBy(xpath = "(//div[@style='flex-direction: row; justify-content: space-between;']/div)[1]")
	private WebElement amountOnUpiCard;
	
	@FindBy(xpath = "(//div[@style='flex-direction: row; justify-content: space-between;']/div)[2]")
	private WebElement taxShownOnUpiCard;
	
	@FindBy(xpath = "//div[@style='font-size: 62.8364px; font-family: Roboto_400Regular; color: rgb(0, 0, 0);']")
	private WebElement upiCardTitle;
	
	//Upi page
	@FindBy(xpath = "//div[contains(@style,'font-size: 69.8182px; font-family: Roboto_400Regular')]/preceding-sibling::div")
	private WebElement upiBackwardButton;
	
	@FindBy(xpath = "//div[contains(@style,'font-size: 69.8182px; font-family: Roboto_400Regular')]")
	private WebElement pageHeader;

	@FindBy(xpath = "//div[contains(@style,'font-size: 55.8545px; font-family: Roboto_400Regular')]")
	private WebElement upiFormatText;
	
	@FindBy(xpath = "//div[contains(@style,'font-family: Roboto_400Regular; font-size: 55.8545px;')]")
	private WebElement upiFieldNameText;
	
	@FindBy(xpath = "//input[@placeholder='xyz@abc']")
	private WebElement upiID;

	@FindBy(xpath = "//div[text()='CONFIRM']")
	private WebElement confirmButton;

	/*
	 * Credit card payment mode declaration
	 */
//	@FindBy(xpath = "//div[text()='Credit Card Payment']/parent::div/parent::div/descendant::div[text()='Pay']")
//	private WebElement payButtonForCredit;
//
//	@FindBy(xpath = "//div[text()='Credit Card Number']/parent::div/descendant::input")
//	private WebElement creditCardNum;
//
//	@FindBy(xpath = "//div[text()='Name on card']/parent::div/descendant::input")
//	private WebElement nameOnCreditCard;
//
//	@FindBy(xpath = "//div[text()='Valid till (MM/YYYY)']/parent::div/descendant::input")
//	private WebElement creditCardValidTill;
//
//	@FindBy(xpath = "//div[text()='CVV']/parent::div/descendant::input")
//	private WebElement creditCardCvvNum;
//
//	@FindBy(xpath = "//div[text()='Credit Card Details']/parent::div/parent::div/following-sibling::div/descendant::div[text()='Pay']")
//	private WebElement creditCardPayButton;

	/*
	 * Debit card payment mode declaration
	 */
//	@FindBy(xpath = "//div[text()='Debit Card Payment']/parent::div/parent::div/descendant::div[text()='Pay']")
//	private WebElement payButtonForDebit;
//
//	@FindBy(xpath = "//div[text()='Debit Card Number']/parent::div/descendant::input")
//	private WebElement debitCardNum;
//
//	@FindBy(xpath = "//div[text()='Name on card']/parent::div/descendant::input")
//	private WebElement nameOnDebitCard;
//
//	@FindBy(xpath = "//div[text()='Valid till (MM/YYYY)']/parent::div/descendant::input")
//	private WebElement debitCardValidTill;
//
//	@FindBy(xpath = "//div[text()='CVV']/parent::div/descendant::input")
//	private WebElement debitCardCvvNum;
//
//	@FindBy(xpath = "//div[text()='Debit Card Details']/parent::div/parent::div/following-sibling::div/descendant::div[text()='Pay']")
//	private WebElement debitCardPayButton;

	/*
	 * NetBnking payment mode declaration
	 */
//	@FindBy(xpath = "//div[text()='MORE BANKS']")
//	private WebElement moreBanks;
//
//	@FindBy(xpath = "//div[text()='Select Your Bank']/preceding-sibling::div/child::div")
//	private WebElement netbankBackward;
//
//	@FindBy(xpath = "//div[text()='Select Your Bank']/parent::div/following-sibling::div/descendant::div[contains(text(),'SBI')]")
//	private WebElement bankSbi;
//	
//	@FindBy(xpath = "//div[text()='Select Your Bank']/parent::div/following-sibling::div/div/div[@class='css-175oi2r']")
//	private List<WebElement> allBank;
	
	
	/*
	 * Payment accept and failure declaration
	 */
	@FindBy(xpath = "//td[contains(text(),'SUCCESS')]/input")
	private WebElement paymentSuccess;
	
	@FindBy(xpath = "//td[contains(text(),'FAILURE')]/input")
	private WebElement paymentFailure;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement paymentSubmit;
	
	/*
	 * bankValidation elements
	 */
//	@FindBy(id = "header-logo")
//	private WebElement dcbBank;
//	
//	@FindBy(xpath = "//img[@alt='bank Logo']")
//	private WebElement deutscheBank;
//	
//	@FindBy(className  = "normal-logo")
//	private WebElement federalBank;
//	
//	@FindBy(xpath = "header-logo")
//	private WebElement jkBank;
//	
//	@FindBy(id = "bank_logo")
//	private WebElement janataBank;
//	
//	@FindBy(xpath = "//img[@class='logo_img']")
//	private WebElement karurBank;
//	
//	@FindBy(className = "oj-lg-2 oj-md-3 oj-sm-4 icon-logo-head")
//	private WebElement yesBank;
//	
//	@FindBy(xpath = "//h2[@class='login_logo']")
//	private WebElement dhanlaxmiBank;

//	Initialization

	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	Utilization

	public WebElement getAmountDisplayedInHeader() {
		return amountPaying;
	}

	public WebElement getCheckoutBackwardButtonElement() {
		return checkoutBackwardButton;
	}

	/*
	 * UPI payment mode utilization
	 */
	public WebElement getAddUpiElement() {
		return addUpi;
	}

	public WebElement getAmountOnUpiCardElement() {
		return amountOnUpiCard;
	}
	
	public WebElement getTaxOnUpiCardElement() {
		return taxShownOnUpiCard;
	}
	
	public WebElement getUpiCardTitleElement() {
		return upiCardTitle;
	}
	
	//upi page
	public void clickUpiBackwardButton() {
		upiBackwardButton.click();
	}
	
	public WebElement getUpiPageHeader() {
		return pageHeader;
	}

	public WebElement getUpiFormatTextElement() {
		return upiFormatText;
	}
	
	public WebElement getUpiFieldNameTextElement() {
		return upiFieldNameText;
	}
	
	public void sendUpiID(String upiID) {
		this.upiID.sendKeys(upiID);
	}

	public void clickConfirm() {
		confirmButton.click();
	}

	/*
	 * Credit card payment mode utilization
	 */
//	public void payButtonThroughCredit() {
//	    payButtonForCredit.click();
//	}
//	
//	public void sendCreditCardNum(String creditCardNum) {
//		this.creditCardNum.sendKeys(creditCardNum);
//	}
//	
//	public void sendNameOnCreditCard(String nameOnCreditCard) {
//		this.nameOnCreditCard.sendKeys(nameOnCreditCard);
//	}
//	
//	public void sendCreditCardValidTill(String creditCardVlidTill) {
//		this.creditCardValidTill.sendKeys(creditCardVlidTill);
//	}
//	
//	public void sendCreditCardCvvNum(String creditCardCvvNum) {
//		this.creditCardCvvNum.sendKeys(creditCardCvvNum);
//	}
//	
//	public void clickOnCreditPay() {
//		creditCardPayButton.click();
//	}

	/*
	 * Debit card payment mode utilization
	 */
//	public void payButtonThroughDebit() {
//		payButtonForDebit.click();
//	}
//	
//	public void sendDebitCardNum(String creditCardNum) {
//		this.debitCardNum.sendKeys(creditCardNum);
//	}
//	
//	public void sendNameOnDebitCard(String nameOnCreditCard) {
//		this.nameOnDebitCard.sendKeys(nameOnCreditCard);
//	}
//	
//	public void sendDebitCardValidTill(String creditCardVlidTill) {
//		this.debitCardValidTill.sendKeys(creditCardVlidTill);
//	}
//	
//	public void sendDebitCardCvvNum(String creditCardCvvNum) {
//		this.debitCardCvvNum.sendKeys(creditCardCvvNum);
//	}
//	
//	public void clickOnDebitPay() {
//		debitCardPayButton.click();
//	}

	/*
	 * NetBanking payment mode utilization
	 */
//	public void clickOnMoreBanks() {
//		moreBanks.click();
//	}
//
//	public void clickNetbankingBackwardButton() {
//		netbankBackward.click();
//	}
//
//	public void selectBank() {
//		bankSbi.click();
//	}
//	
//	public List<WebElement> allBanks() {
//		return allBank;
//	}
	
	/*
	 * Payment accept and failure utilization
	 */
	public void forSuccess() {
		paymentSuccess.click();
	}
	
	public void forFailure() {
		paymentFailure.click();
	}
	
	public void submitPayment() {
		paymentSubmit.click();
	}
	
	/*
	 * bankValidation element utilization
	 */
//	public WebElement dcbBankHeader() {
//		return dcbBank;
//	}
//	
//	public WebElement deutscheBankHeader() {
//		return deutscheBank;
//	}
//	
//	public WebElement federalBankHeader() {
//		return federalBank;
//	}
//	
//	public WebElement jkBankHeader() {
//		return jkBank;
//	}
//
//	public WebElement janataSahakariBankHeader() {
//		return janataBank;
//	}
//	
//	public WebElement karurVysyaBankHeader() {
//		return karurBank;
//	}
//	
//	public WebElement yesBankHeader() {
//		return yesBank;
//	}
//	
//	public WebElement dhanlaxmiBankHeader() {
//		return dhanlaxmiBank;
//	}
}
