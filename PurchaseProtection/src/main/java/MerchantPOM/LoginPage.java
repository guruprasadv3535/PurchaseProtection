package MerchantPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//	Declaration

	/*
	 * Login page
	 */

	// vouch logo
	@FindBy(id = "VouchLogo")
	private WebElement vouchLogo;

	// Login page headers
	@FindBy(id = "LoginHeader1")
	private WebElement loginHeader1;

	@FindBy(id = "LoginHeader1")
	private WebElement getLoginHeaderElement;

	@FindBy(id = "LoginHeader2")
	private WebElement loginHeader2;

	// Enter phome number field
	@FindBy(xpath = "//input[@type='number']")
	private WebElement enterPhoneNoField;

	// get otp button
	@FindBy(id = "GetOtp")
	private WebElement getOtpButton;

	// Text inside "Enter Phone No" field
	@FindBy(id = ":r0:-label")
	private WebElement getTextInPhoneField;
	
	// Text in border of field
	@FindBy(id = ":r0:-label")
	private WebElement getTextOnFieldBorder;

	/*
	 * Otp verification screen
	 */

	// otp verification page back button
	@FindBy(id = "OTPBackButton")
	private WebElement otpBackButton;

	// otp verification page headers
	@FindBy(className = "sc-gEvEer")
	private WebElement otpHeader1;

	@FindBy(className = "sc-eqUAAy")
	private WebElement otpHeader2;

	@FindBy(className = "sc-fqkvVR")
	private WebElement otpHeader2line;

	// enter otp field
	@FindBy(xpath = "//input[@type='number']")
	private WebElement enterOtpField;

	// resend otp button
	@FindBy(className = "sc-imWYAI")
	private WebElement resendOtpButton;

	// login button
	@FindBy(id = "LoginBtn")
	private WebElement loginButton;

	// get the text in otp filed
	@FindBy(id = ":r1:-label")
	private WebElement getTextInOtpField;

	@FindBy(xpath = "//input[@type='number']")
	private WebElement getInputFieldAttribute;
	
	// get the error message for wrong entries
	@FindBy(xpath = "//div[@class='MuiSnackbarContent-message']")
	private WebElement getErrorMsg;

//	Initialization

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

//	Utilization

	/*
	 * Login screen
	 */
	// This method is returning the vouch logo
	public WebElement getVouchLogo() {
		return vouchLogo;
	}

	// This method is returning login header1
	public String getLoginHeader1() {
		return loginHeader1.getText();
	}

	// This method is used to click on header
	public void clickOnLoginHeader() {
		getLoginHeaderElement.click();
	}

	// This method is returning login header2
	public String getLoginHeader2() {
		return loginHeader2.getText();
	}

	// This method is used to send the mobile number
	public void sendPhoneNum(String phNum) {
		enterPhoneNoField.sendKeys(phNum);
	}

	// This method is use to get the attribute of input filed
	public WebElement getPhoneNumFieldElement() {
		return enterPhoneNoField;
	}

	// This method is used to click on get otp button
	public WebElement clickOnGetOtpElement() {
		return getOtpButton;
	}

	// This method is used to get the text inside the phone number field
	public String getTextInPhoneField() {
		return getTextInPhoneField.getText();
	}
	
	// This method is used to get the text on field border
	public String getTextOnFieldBorder() {
		return getTextOnFieldBorder.getText();
	}

	/*
	 * Otp verification screen
	 */
	// This method is used to click on OTP back button
	public void clickOnOTPBackButton() {
		otpBackButton.click();
	}

	// This method is used to get otp verification header1
	public String getOtpHeader1() {
		return otpHeader1.getText();
	}

	// This method is used to get otp verification header2
	public String getOtpHeader2() {
		return otpHeader2.getText();
	}

	public String getOtpHeader2line() {
		return otpHeader2line.getText();
	}

	// This method is used to enter the otp
	public void sendOTP() throws InterruptedException {
		while (true) {
			if (enterOtpField.getAttribute("value").length() == 6) {
				break;
			} else {
				Thread.sleep(3000);
				otpHeader2.click();
				continue;
			}
		}
	}

	// This method is used to click on resend otp
	public WebElement clickOnResendOtpElement() {
		return resendOtpButton;
	}

	// This method is used to clik on login
	public WebElement clickOnLoginButtonElement() {
		return loginButton;
	}

	// This method is used to get the text inside the OTP field
	public String getTextInOtpField() {
		return getTextInOtpField.getText();
	}
	
	// This method is used to get the error message of both phone number and OTP field
	public String getErrorMsg() {
		return getErrorMsg.getText();
	}

}