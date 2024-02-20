package MerchantPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

//	Declaration
	
	/*
	 * Business details
	 */
	
	//To upload the image
	@FindBy(id = "UploadPorfilePhoto")
	private WebElement uploadProfilePhoto;

	//To get the image upload details
	@FindBy(id = "ProfileImageDetails")
	private WebElement imageDetails;
	
	//To get the business details in array list which present in left side
	@FindBy(xpath = "//div[@id='ProfileImageDetails']/div")
	private WebElement leftSideProfileDetailsList;
	
	//To get the business name
	@FindBy(id = "BusinessNameValue")
	private WebElement businessName;
	
	//To get the registered company name 
	@FindBy(id = "RegisteredCNValue")
	private WebElement regCompanyName;
	
	//To get the gst num
	@FindBy(id = "GSTIN-Value")
	private WebElement gstNum;
	
	//To get the business details in array list which present in right side
	@FindBy(id = "RightBD")
	private WebElement rightSideProfileDetailsList;
	
	//To get the settlement A/c no value
	@FindBy(id = "SettlementAccValue")
	private WebElement settlementAccNo;
	
	//To get the mobile number
	@FindBy(id = "MobileNum-Value")
	private WebElement mobileNum;
	
	//To get the email id
	@FindBy(id = "EmailID-Value")
	private WebElement eamilID;
	
	//To get the address
	@FindBy(id = "Address-Value")
	private WebElement address;
	
	//To get the website link
	@FindBy(id = "Website-Link")
	private WebElement websiteLink;
	
	/*
	 * Payment methods list
	 */
	
	//To get the payment method header
	@FindBy(id = "PM-header")
	private WebElement paymentMethodsHeader;
	
	//To select the upi
	@FindBy(xpath = "//span[text()='UPI']/parent::div/label/span[contains(@class,'MuiCheckbox-root')]/input")
	private WebElement upiCheckbox;
	
	//To select the credit card
	@FindBy(xpath = "//span[text()='Credit Card']/parent::div/label/span[contains(@class,'MuiCheckbox-root')]/input")
	private WebElement creditCheckbox;
	
	//To select the debit card 
	@FindBy(xpath = "//span[text()='Debit Card']/parent::div/label/span[contains(@class,'MuiCheckbox-root')]/input")
	private WebElement debitCheckbox;
	
	//To select the netbanking
	@FindBy(xpath = "//span[text()='Netbanking']/parent::div/label/span[contains(@class,'MuiCheckbox-root')]/input")
	private WebElement netbankingCheckbox;
	
	/*
	 * Processing Account details
	 */
	
	//To get the header
	@FindBy(id = "PA-header")
	private WebElement processingAccHeader;
	
	//To get the processing account
	@FindBy(id = "PANum-value")
	private WebElement processingAccNum;
	
	//To get the processing account ifsc
	@FindBy(id = "PAIFSC-Value")
	private WebElement processingAccIFSC;
	
	//To get the reserve balance value
	@FindBy(xpath = "//label[@for='ReserveBal-Value']")
	private WebElement reserveBal;
	
	//To get the processing account note
	@FindBy(id = "PA-Note")
	private WebElement processingAccNote;
	
	//To get the processing account details in list 
	@FindBy(id = "PADetailsList")
	private WebElement PAdetailsList;
	
	/*
	 * Basic Customization
	 */
	
	//To get the customization header
	@FindBy(id = "customizationHeader")
	private WebElement customizationHeader;
	
	//To get the basic customization text
	@FindBy(id = "BasicCustomization")
	private WebElement basicCustomizationText;
	
	//To select the basic customization radio button
	@FindBy(id = "BasicCustomizationRaidoButton")
	private WebElement basicCustomizationRaidoButton;
	
	//To get the advance customization text
	@FindBy(id = "AdvanceCustomization")
	private WebElement advanceCustomizationRaidoButton;
	
	//To get the Logo text
	@FindBy(id = "Logo")
	private WebElement logoText;
	
	//To upload the logo
	@FindBy(id = "MerchantLogoUploader")
	private WebElement merchatnLogoUploader;
	
	//To get the theme text
	@FindBy(id = "Theme")
	private WebElement themeText;
	
	//To select the dark theme
	@FindBy(id = "DarkTheme")
    private WebElement darkTheme;
	
	//To select the light theme
	@FindBy(id = "LightTheme")
	private WebElement lightTheme;
	
	//To get the banner/button text
	@FindBy(id = "Banner-Button")
	private WebElement banner_ButtonText;
	
	//To send the banner/button color code
	@FindBy(id = "BBColorCodeField")
	private WebElement banner_ButtonColorCode;
	
	//To save the customization
	@FindBy(id = "CustomizationSave")
	private WebElement customizationSave;
	
	/*
	 * Advance cusotmization
	 */
	
	//To set the banner/button color
	@FindBy(id = "ABBColorCodeField")
	private WebElement advanceBanner_ButtonColorCode;
	
	//To set the button text
	@FindBy(id = "ButtonTextColor")
	private WebElement buttonTextColor;
	
	//To set the background color
	@FindBy(id = "BackGroundColorField")
	private WebElement backgroundColor;
	
	//To set the card color
	@FindBy(id = "CardColorField")
	private WebElement cardColor;
	
	//To set the header text color
	@FindBy(id = "HeaderTextColorField")
	private WebElement headerTextColor;
	
	//To set the sub text color 
	@FindBy(id = "SubTextField")
	private WebElement subTextColor;
	
	/*
	 * Banner section
	 */
	
	//To get the banner section header
	@FindBy(id = "BannerSelectionHeader")
	private WebElement bannerSelectionHeader;
	
	//To select the landing page
	@FindBy(id = "LandingPage")
	private WebElement landingPageBanner;
	
	//To select the product page
	@FindBy(id = "ProductPage")
	private WebElement productPageBanner;
	
	//To select the payment page
	@FindBy(id = "PaymentPage")
	private WebElement paymentPageBanner;
	
	//To select the cod section banner
	@FindBy(id = "CODSection")
	private WebElement codPageBanner;
	
	//To select post purchase banner
	@FindBy(id = "PostPurchase")
	private WebElement postPurchaseBanner;
	
	//To switch of the banner
	@FindBy(id = "offRaidoButton")
	private WebElement offRaidoButton;
	
	//To select the banner1
	@FindBy(id = "Banner1Button")
	private WebElement banner1RadioButton;
	
	//To select the banner2
	@FindBy(id = "Banner2Button")
	private WebElement banner2RaidoButton;
	
	//To select the custom
	@FindBy(id = "CustomRaido")
	private WebElement customRadioButton;
	
	//To get the custom banner mobile width
	@FindBy(id = "MobileWidth")
	private WebElement customBannnerMobileWidth;
	
	//To get the custom banner mobile height
	@FindBy(id = "MobileHeight")
	private WebElement customBannerMobileHeight;
	
	//To get the custom banner desktop width
	@FindBy(id = "DesktopWidth")
	private WebElement customBannerDesktopWidth;
	
	//To get the custom banner desktop height
	@FindBy(id = "DesktopHeight")
	private WebElement customBannerDesktopHeight;
	
	//To click on browse files
	@FindBy(id = "BrowseFiles")
	private WebElement browserFilesButton;
	
	//To click on update button
	@FindBy(id = "UpdateButton")
	private WebElement updateButton;
	
//	Initialization
	
	public ProfilePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
//	Utilization
	
	/*
	 * Business details
	 */
	
	//this method is returning the profile photo uploader webelement
	public WebElement getUploadProfilePhotoElement() {
		return uploadProfilePhoto;
	}

	//this method is returning the details of profile image
	public String getImageDetails() {
		return imageDetails.getText();
	}

	//this method is returning the parent element of left side profile details 
	public WebElement getLeftSideProfileDetailsListElement() {
		return leftSideProfileDetailsList;
	}

	//this method is returning the business name
	public String getBusinessName() {
		return businessName.getText();
	}

	//this method is returning the registered company name
	public String getRegCompanyName() {
		return regCompanyName.getText();
	}

	//this method is returning the gst num
	public String getGstNum() {
		return gstNum.getText();
	}

	//this method is returning the parent element of right side profile details
	public WebElement getRightSideProfileDetailsListElement() {
		return rightSideProfileDetailsList;
	}

	//this method is returning the settlement acc no
	public String getSettlementAccNo() {
		return settlementAccNo.getText();
	}

	//this method is returning the mobile num
	public String getMobileNum() {
		return mobileNum.getText();
	}

	//this method is returning the email id
	public String getEamilID() {
		return eamilID.getText();
	}

	//this method is returning the address
	public String getAddress() {
		return address.getText();
	}

	//this method is returning the website link
	public String getWebsiteLink() {
		return websiteLink.getText();
	}

	/*
	 * payment methods
	 */
	//this method is returning the payment method header
	public String getPaymentMethodsHeader() {
		return paymentMethodsHeader.getText();
	}

	//this method is used to select the upi payment option
	public WebElement UpiCheckboxElement() {
		return upiCheckbox;
	}

	//this method is used to select the credit card payment option
	public WebElement CreditCheckboxElement() {
		return creditCheckbox;
	}

	//this method is used to select the debit card payment option
	public WebElement DebitCheckboxElement() {
		return debitCheckbox;
	}

	//this method is used to select the netbanking payment option
	public WebElement NetbankingCheckboxElement() {
		return netbankingCheckbox;
	}

	/*
	 * Processing Account
	 */
	//this method is returning the processing acc header
	public String getProcessingAccHeader() {
		return processingAccHeader.getText();
	}

	//this method is returning the processing acc number
	public String getProcessingAccNum() {
		return processingAccNum.getText();
	}

	//this method is returning the processing acc ifsc
	public String getProcessingAccIFSC() {
		return processingAccIFSC.getText();
	}

	//this method is returning the reserve blc
	public String getReserveBal() {
		return reserveBal.getText();
	}

	//this method is returning the processing acc note
	public String getProcessingAccNote() {
		return processingAccNote.getText();
	}

	//this method is returning webelement of payment methods details
	public WebElement getPAdetailsListElement() {
		return PAdetailsList;
	}

	//this method is returning the customization header
	public String getCustomizationHeader() {
		return customizationHeader.getText();
	}

	//get the basic customization text
	public String getBasicCustomizationText() {
		return basicCustomizationText.getText();
	}

	//this method is used to click on basic customization
	public void clickOnBasicCustomizationRaidoButton() {
		basicCustomizationRaidoButton.click();
	}

	//this method is used to click on advance customization
	public void clickOnAdvanceCustomizationRaidoButton() {
		advanceCustomizationRaidoButton.click();
	}

	//this method is returning the logo text
	public String getLogoText() {
		return logoText.getText();
	}

	//this method is returning the logo uploader element
	public WebElement getMerchatnLogoUploaderElement() {
		return merchatnLogoUploader;
	}

	//this method is returning the theme text
	public String getThemeText() {
		return themeText.getText();
	}

	//this method is used to click on dark theme
	public void clickOnDarkTheme() {
		darkTheme.click();
	}

	//this method is used to click on light theme
	public void getLightTheme() {
		lightTheme.click();
	}

	//this method returning the banner button text
	public String getBanner_ButtonText() {
		return banner_ButtonText.getText();
	}

	//this method is used to send the banner/button color code
	public void sendBanner_ButtonColorCode(String banner_ButtonColorCode) {
		this.banner_ButtonColorCode.sendKeys(banner_ButtonColorCode);
	}

	//this method is used to save the customization
	public void clickOnCustomizationSave() {
		customizationSave.click();
	}

	//this method is used to send the button color code
	public void sendAdvanceBanner_ButtonColorCode(String advanceBanner_ButtonColorCode) {
		this.advanceBanner_ButtonColorCode.sendKeys(advanceBanner_ButtonColorCode);
	}

	//this method is used to send the button text color code
	public void sendButtonTextColorCode(String buttonTextColor) {
		this.buttonTextColor.sendKeys(buttonTextColor);
	}

	//this method is used to send the background color code
	public void sendBackgroundColorCode(String backgroundColor) {
		this.backgroundColor.sendKeys(backgroundColor);
	}

	//this method is used to send the card color code
	public void sendCardColorcode(String cardColor) {
		this.cardColor.sendKeys(cardColor);;
	}

	//this method is used to send the header text color code
	public void sendHeaderTextColorCode(String headerTextColor) {
		this.headerTextColor.sendKeys(headerTextColor);
	}

	//this method is used to send the sub text color code
	public void sendSubTextColorCode(String subTextColor) {
		this.subTextColor.sendKeys(subTextColor);
	}

	//this method is returning the banner select header
	public String getBannerSelectionHeader() {
		return bannerSelectionHeader.getText();
	}

	//this method is used to click on landing page banner selection
	public void clickOnLandingPageBanner() {
		landingPageBanner.click();
	}

	//this method is used to click on product page
	public void clickOnProductPageBanner() {
		productPageBanner.click();
	}

	//this method is used to click on payment page
	public void clickOnPaymentPageBanner() {
		paymentPageBanner.click();
	}

	//this method is used to click on cod section banner
	public void clickOnCodPageBanner() {
		codPageBanner.click();
	}

	//this method is used to click on post purchase screen
	public void clickOnPostPurchaseBanner() {
		postPurchaseBanner.click();
	}

	//this method is used to off the banners
	public void clickOnOffRaidoButton() {
		offRaidoButton.click();;
	}

	//this method is used to select the banner 1
	public void clickOnBanner1RadioButton() {
		banner1RadioButton.click();
	}

	//this method is used to select the banner 2
	public void clickOnBanner2RaidoButton() {
		banner2RaidoButton.click();
	}

	//this method is used to select the custom radio button
	public void clickOnCustomRadioButton() {
		customRadioButton.click();;
	}

	//this method is used to get the mobile banner width
	public String getCustomBannnerMobileWidth() {
		return customBannnerMobileWidth.getText();
	}

	//this method is used to get the mobile banner height
	public String getCustomBannerMobileHeight() {
		return customBannerMobileHeight.getText();
	}

	//this method is used to get the desktop banner width
	public String getCustomBannerDesktopWidth() {
		return customBannerDesktopWidth.getText();
	}

	//this method is used to get the desktop banner height
	public String getCustomBannerDesktopHeight() {
		return customBannerDesktopHeight.getText();
	}

	//this method is used to click on browse filed button
	public void clickOnBrowserFilesButton() {
		browserFilesButton.click();
	}

	//this method is used to click on update
	public void clickOnUpdateButton() {
		updateButton.click();
	}
}
