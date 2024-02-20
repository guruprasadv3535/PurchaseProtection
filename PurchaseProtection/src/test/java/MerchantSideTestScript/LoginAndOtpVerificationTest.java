package MerchantSideTestScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genricLibraries.BaseClassWithoutProfile;
import io.restassured.internal.filter.SendRequestFilter;

public class LoginAndOtpVerificationTest extends BaseClassWithoutProfile {

// This method covers Test case : 1, 11, 27, 28, 29(anushree)
	@Test
	public void testWithValidInput() throws InterruptedException {
		SoftAssert assert1 = new SoftAssert();
		// before method execution before method will launch the browser and navigate to
		// application

		/*
		 * Validating the login page by entering valid phone number
		 */
		Thread.sleep(2000);

		// Checking the spelling of login page header
		assert1.assertEquals(login.getLoginHeader1(), excel.readDataFromExcel("Valid data", 1, 1));
		assert1.assertEquals(login.getLoginHeader2(), excel.readDataFromExcel("Valid data", 2, 1));
		assert1.assertEquals(login.clickOnGetOtpElement().getText(), "Get OTP");

		// validating the text inside the 'Enter phone no' field
		assert1.assertEquals(login.getTextInPhoneField(), "Enter Phone No.");
		assert1.assertEquals(login.clickOnGetOtpElement().getText(), "Get OTP");

		// Send the mobile number into enter phone no field
		login.sendPhoneNum(excel.readDataFromExcel("Valid data", 3, 1));
		login.clickOnGetOtpElement().click();

		// validating the OTP sent successful message
		Thread.sleep(1000);
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Valid data", 4, 1));

		/*
		 * Validate the OTP verification screen after entering the valid phone number
		 */
		Thread.sleep(5000);

		// Checking the spelling of OTP verification page header
		assert1.assertEquals(login.getOtpHeader1(), excel.readDataFromExcel("Valid data", 6, 1));

		// Adding 'x' to the mobile number used for login to validate in OTP
		// verification screen
		char[] phoneNum = excel.readDataFromExcel("Valid data", 3, 1).toCharArray();
		String convertedNum = "";
		for (int i = 0; i < phoneNum.length; i++) {
			if (i > 1 && i < 7) {
				phoneNum[i] = 'x';
			}
			convertedNum = convertedNum + phoneNum[i];
		}
		assert1.assertEquals(login.getOtpHeader2(), excel.readDataFromExcel("Valid data", 7, 1) + convertedNum + '.');
		assert1.assertEquals(login.getOtpHeader2line(), excel.readDataFromExcel("Valid data", 8, 1));

		// validating the text inside the OTP field
		assert1.assertEquals(login.getTextInOtpField(), "OTP");
		assert1.assertEquals(login.clickOnResendOtpElement().getText(), "Resend");
		assert1.assertEquals(login.clickOnLoginButtonElement().getText(), "Login");

		// Validating the otp field have 6 entries or not
		login.sendOTP();

		login.clickOnLoginButtonElement().click();

		/*
		 * Validate the landing/home page of application
		 */
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), "Orders");

		order.clickOnProfileIcon();
		Thread.sleep(2000);

		// checking the merchant name
		assert1.assertEquals(order.getMerchantName(), "Bonkers Corners Pvt. Ltd.");
		// checking the merchant id
		assert1.assertEquals(order.getMerchantID(), "#xcrTGlop12352");
		// checking the "Logged in as" user name
		assert1.assertEquals(order.getLoggedInAsName(), "Vouch Merchant");

		/*
		 * validating the logout from the account
		 */
		assert1.assertEquals(order.getLogoutElement().getText(), "Logout");
		order.getLogoutElement().click();
		Thread.sleep(2000);
		assert1.assertEquals(login.getLoginHeader1(), excel.readDataFromExcel("Valid data", 1, 1));

		assert1.assertAll();

	}

//	This method covers Test case : 3-17(anushree)
	@Test(dependsOnMethods = "testWithValidInput")
	public void testWithInvalidInput() throws InterruptedException {
		SoftAssert assert1 = new SoftAssert();
		// before method execution before method will launch the browser and navigate to
		// application

//		Login page
		/*
		 * Validating the login page by entering invalid phone number
		 */
		Thread.sleep(2000);

		// Checking the spelling of login page header
		assert1.assertEquals(login.getLoginHeader1(), excel.readDataFromExcel("Valid data", 1, 1));
		assert1.assertEquals(login.getLoginHeader2(), excel.readDataFromExcel("Valid data", 2, 1));
		assert1.assertEquals(login.clickOnGetOtpElement().getText(), "Get OTP");

		/*
		 * Validating with empty field
		 */
		login.clickOnGetOtpElement().click();

		// validate the error message
		assert1.assertEquals(login.getTextInPhoneField(), excel.readDataFromExcel("Invalid data", 8, 1));

		/*
		 * Validating with wrong phone/unregistered phone number
		 */
		login.getPhoneNumFieldElement().sendKeys(excel.readDataFromExcel("Invalid data", 6, 1));

		login.clickOnGetOtpElement().click();

		// validate the error message
		Thread.sleep(2000);
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Invalid data", 10, 1));

		/*
		 * Validating with more than 10 digits
		 */
		// Send the mobile number having more then 10 digit into enter phone no field
		login.getPhoneNumFieldElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		Thread.sleep(2000);
		login.getPhoneNumFieldElement().sendKeys(excel.readDataFromExcel("Invalid data", 1, 1));

		login.clickOnLoginHeader();
		Thread.sleep(2000);
		// Removing all other characters except numeric
		String moreThan10Digit = excel.readDataFromExcel("Invalid data", 1, 1);
		String exact10Digit = "";
		for (int i = 0; i < 10; i++) {
			if (moreThan10Digit.charAt(i) >= '0' && moreThan10Digit.charAt(i) <= '9') {
				exact10Digit += moreThan10Digit.charAt(i);
			}
		}
		assert1.assertEquals(login.getPhoneNumFieldElement().getAttribute("value"), exact10Digit);
		assert1.assertEquals(10, login.getPhoneNumFieldElement().getAttribute("value").length());

		/*
		 * Validating with less than 10 digits into enter phone no field
		 */
		login.getPhoneNumFieldElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		Thread.sleep(2000);
		// Send the mobile number having more then 10 digit into enter phone no field
		login.getPhoneNumFieldElement().sendKeys(excel.readDataFromExcel("Invalid data", 2, 1));
		// login.clickOnGetOtpElement().click();

		// validate the error message
		assert1.assertEquals(login.getTextOnFieldBorder(), excel.readDataFromExcel("Invalid data", 9, 1));

		/*
		 * Validating with Alpha Numeric character in enter phone no field
		 */
		// Send the mobile number having Alpha numeric into enter phone no field
		// It should not accept
		login.getPhoneNumFieldElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		Thread.sleep(2000);
		login.getPhoneNumFieldElement().sendKeys(excel.readDataFromExcel("Invalid data", 3, 1));

		login.clickOnLoginHeader();
		Thread.sleep(2000);
		// Removing all other characters except numeric
		String alphNum = excel.readDataFromExcel("Invalid data", 3, 1);
		String newAlphNum = "";
		for (int i = 0; i < alphNum.length(); i++) {
			if (alphNum.charAt(i) >= '0' && alphNum.charAt(i) <= '9') {
				newAlphNum += alphNum.charAt(i);
			}
		}
		assert1.assertEquals(login.getPhoneNumFieldElement().getAttribute("value"), newAlphNum);

		/*
		 * Validating with special character in enter phone no field
		 */
		// Send the mobile number having Alpha numeric into enter phone no field
		// It should not accept
		login.getPhoneNumFieldElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		Thread.sleep(2000);
		login.getPhoneNumFieldElement().sendKeys(excel.readDataFromExcel("Invalid data", 4, 1));

		login.clickOnLoginHeader();
		Thread.sleep(2000);
		// Removing all other characters except numeric
		String num_Spec = excel.readDataFromExcel("Invalid data", 4, 1);
		String new_Num_Spec = "";
		for (int i = 0; i < num_Spec.length(); i++) {
			if (num_Spec.charAt(i) >= '0' && num_Spec.charAt(i) <= '9') {
				new_Num_Spec += num_Spec.charAt(i);
			}
		}
		assert1.assertEquals(login.getPhoneNumFieldElement().getAttribute("value"), new_Num_Spec);

		/*
		 * Validating with space character in enter phone no field
		 */
		// Send the mobile number having Alpha numeric into enter phone no field
		// It should not accept
		login.getPhoneNumFieldElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		Thread.sleep(2000);
		login.getPhoneNumFieldElement().sendKeys(excel.readDataFromExcel("Invalid data", 5, 1));

		login.clickOnLoginHeader();
		Thread.sleep(2000);
		// Removing all other characters except numeric
		String num_Space = excel.readDataFromExcel("Invalid data", 5, 1);
		String new_Num_Space = "";
		for (int i = 0; i < num_Space.length(); i++) {
			if (num_Space.charAt(i) >= '0' && num_Space.charAt(i) <= '9') {
				new_Num_Space += num_Space.charAt(i);
			}
		}
		assert1.assertEquals(login.getPhoneNumFieldElement().getAttribute("value"), new_Num_Space);

//		OTP verification page
		login.getPhoneNumFieldElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		Thread.sleep(2000);
		login.getPhoneNumFieldElement().sendKeys(excel.readDataFromExcel("Valid data", 3, 1));
		login.clickOnGetOtpElement().click();

		Thread.sleep(1000);

		// validating the OTP sent successful message
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Valid data", 4, 1));

		// Checking the spelling of OTP verification page header
		assert1.assertEquals(login.getOtpHeader1(), excel.readDataFromExcel("Valid data", 6, 1));

		// Adding 'x' to the mobile number used for login to validate in OTP
		// verification screen
		char[] phoneNum = excel.readDataFromExcel("Valid data", 3, 1).toCharArray();
		String convertedNum = "";
		for (int i = 0; i < phoneNum.length; i++) {
			if (i > 1 && i < 7) {
				phoneNum[i] = 'x';
			}
			convertedNum = convertedNum + phoneNum[i];
		}

		// Validating the OTP screen for validate mobile number
		assert1.assertEquals(login.getOtpHeader2(), excel.readDataFromExcel("Valid data", 7, 1) + convertedNum + '.');
		assert1.assertEquals(login.getOtpHeader2line(), excel.readDataFromExcel("Valid data", 8, 1));

		// validating the text inside the OTP field
		assert1.assertEquals(login.getTextInOtpField(), "OTP");
		assert1.assertEquals(login.clickOnResendOtpElement().getText(), "Resend");
		assert1.assertEquals(login.clickOnLoginButtonElement().getText(), "Login");

		// validating the OTP screen backward button
		login.clickOnOTPBackButton();
		Thread.sleep(2000);
		assert1.assertEquals(login.getLoginHeader1(), excel.readDataFromExcel("Valid data", 1, 1));

		/*
		 * Validate the by passing null value into OTP field
		 */
		login.getPhoneNumFieldElement().sendKeys(excel.readDataFromExcel("Valid data", 3, 1));
		login.clickOnGetOtpElement().click();
		Thread.sleep(1000);
		// validating the OTP sent successful message
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Valid data", 4, 1));

		// Checking the spelling of OTP verification page header
		assert1.assertEquals(login.getOtpHeader1(), excel.readDataFromExcel("Valid data", 6, 1));

		// Adding 'x' to the mobile number used for login to validate in OTP
		// verification screen
		char[] phoneNum1 = excel.readDataFromExcel("Valid data", 3, 1).toCharArray();
		String convertedNum1 = "";
		for (int i = 0; i < phoneNum1.length; i++) {
			if (i > 1 && i < 7) {
				phoneNum1[i] = 'x';
			}
			convertedNum1 = convertedNum1 + phoneNum1[i];
		}

//		Validating the OTP screen for validate mobile number
		assert1.assertEquals(login.getOtpHeader2(), excel.readDataFromExcel("Valid data", 7, 1) + convertedNum1 + '.');
		assert1.assertEquals(login.getOtpHeader2line(), excel.readDataFromExcel("Valid data", 8, 1));

		login.clickOnLoginButtonElement().click();

		// validate with error message
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Invalid data", 12, 1));

		/*
		 * Validate by passing invalid OTP into OTP field
		 */
		login.getPhoneNumFieldElement().sendKeys("145897");
		login.clickOnLoginButtonElement().click();

		// validate with error message
		Thread.sleep(2000);
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Invalid data", 13, 1));

//		Validate by passing 5 digit into OTP field
		login.getPhoneNumFieldElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		Thread.sleep(2000);
		login.getPhoneNumFieldElement().sendKeys("14589");
		login.clickOnLoginButtonElement().click();

		// validate with error message
		Thread.sleep(2000);
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Invalid data", 12, 1));

//		Validate by passing 7 digit into OTP field
		login.getPhoneNumFieldElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		Thread.sleep(2000);
		login.getPhoneNumFieldElement().sendKeys("1458944");
		login.clickOnLoginButtonElement().click();

		// validate with error message
		Thread.sleep(2000);
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Invalid data", 13, 1));
		assert1.assertEquals(login.getPhoneNumFieldElement().getAttribute("value").length(), 6);

//		Validate by passing Alpha Numeric special characters into OTP field
		login.getPhoneNumFieldElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		Thread.sleep(2000);
		String alphSpecOTP = "145Sas@";
		login.getPhoneNumFieldElement().sendKeys(alphSpecOTP);
		login.clickOnLoginButtonElement().click();

		// validate with error message
		Thread.sleep(2000);
		// Removing all other characters except numeric
		String numOTP = "";
		for (int i = 0; i < alphSpecOTP.length(); i++) {
			if (alphSpecOTP.charAt(i) >= '0' && alphSpecOTP.charAt(i) <= '9') {
				numOTP += alphSpecOTP.charAt(i);
			}
		}
		assert1.assertEquals(login.getPhoneNumFieldElement().getAttribute("value"), numOTP);
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Invalid data", 12, 1));

//		Validate the re-send button
		login.clickOnResendOtpElement().click();

		// validate with error message
		Thread.sleep(2000);
		assert1.assertEquals(login.getErrorMsg(), excel.readDataFromExcel("Valid data", 4, 1));

		assert1.assertAll();
	}

}
