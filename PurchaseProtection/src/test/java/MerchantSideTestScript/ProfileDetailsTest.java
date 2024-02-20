package MerchantSideTestScript;

import java.awt.AWTException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genricLibraries.BaseClass;
import genricLibraries.BaseClassWithoutProfile;

public class ProfileDetailsTest extends BaseClassWithoutProfile {

//	This method contains 34-57 test cases(nethaji)
//	@Test(priority = 0)
	public void profileDetailsVerification() throws InterruptedException, AWTException {
		SoftAssert assert1 = new SoftAssert();
		// before method execution before method will launch the browser and navigate to
		// application

//		Login in to merchant dashboard (Only for demo purpose)
//		Thread.sleep(2000);
//		// Send the mobile number into enter phone no field
//		login.sendPhoneNum(excel.readDataFromExcel("Valid data", 3, 1));
//		login.clickOnGetOtpElement().click();
//		Thread.sleep(2000);
//		login.getPhoneNumFieldElement().sendKeys("000000");
//		login.clickOnLoginButtonElement().click();

		/*
		 * Validating the landing or home page after login
		 */
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), "Orders");

		/*
		 * Validating the profile pop details by clicking on profile icon
		 */
		order.clickOnProfileIcon();
		Thread.sleep(2000);
		// checking the merchant name
		assert1.assertEquals(order.getMerchantName(), excel.readDataFromExcel("Profile page", 17, 1));
		// checking the merchant id
		assert1.assertEquals(order.getMerchantID(), excel.readDataFromExcel("Profile page", 18, 1));
		// checking the "Logged in as" user name
		assert1.assertEquals(order.getLoggedInAsName(), excel.readDataFromExcel("Profile page", 19, 1));
		// checking the profile text
		assert1.assertEquals(order.getProfileElement().getText(), "Profile");
		// checking the processing statement text
		assert1.assertEquals(order.getProcessingStatementElement().getText(), "Processing Statement");
		// checking the logout text
		assert1.assertEquals(order.getLogoutElement().getText(), "Logout");
		order.getProfileElement().click();

		/*
		 * Validating the notification bell icon
		 */
		Thread.sleep(2000);
		order.clickOnBellNotification();
		Thread.sleep(2000);
		assert1.assertEquals(sliderNotify.getNotificationSliderHeader(), "Notifications");
		sliderNotify.clickOnCloseNotificationSlider();

		/*
		 * Validating the profile photo by uploading less the 2MB and 512x512 resolution
		 */
		Thread.sleep(2000);
		assert1.assertEquals(profile.getLogoText(), excel.readDataFromExcel("Profile page", 0, 1));
		profile.getUploadProfilePhotoElement().click();
		Thread.sleep(3000);
		web.uploadFile("C:\\Users\\Guruprasad V\\Pictures\\Signature.jpg");

		/*
		 * Validating the profile photo by uploading less the 2MB and less then this
		 * 512x512 resolution
		 */
//		profile.getMerchatnLogoUploaderElement().click();
//		web.uploadFile("File path");

		/*
		 * Validating the profile photo by uploading less the 2MB and more then this
		 * 512x512 resolution
		 */
//		profile.getMerchatnLogoUploaderElement().click();
//		web.uploadFile("File path");

		/*
		 * Validating the profile photo by uploading more then 2MB and 512x512
		 * resolution
		 */
//		profile.getMerchatnLogoUploaderElement().click();
//		web.uploadFile("File path");

		/*
		 * Validating the business details in profile page
		 */
		// Checking the business name
		assert1.assertEquals(profile.getBusinessName(), excel.readDataFromExcel("Profile page", 1, 1));

		// Checking the Registered Company Name
		assert1.assertEquals(profile.getRegCompanyName(), excel.readDataFromExcel("Profile page", 2, 1));

		// Checking the GSTIN
		assert1.assertEquals(profile.getGstNum(), excel.readDataFromExcel("Profile page", 3, 1));

		// Checking the Settlement Ac/no
		assert1.assertEquals(profile.getSettlementAccNo(), excel.readDataFromExcel("Profile page", 4, 1));

		// Checking the mobile number
		assert1.assertEquals(profile.getMobileNum(), excel.readDataFromExcel("Profile page", 5, 1));

		// Checking the email id
		assert1.assertEquals(profile.getEamilID(), excel.readDataFromExcel("Profile page", 6, 1));

		// Checking the address
		assert1.assertEquals(profile.getAddress(), excel.readDataFromExcel("Profile page", 7, 1));

		// Checking the Website link
		assert1.assertEquals(profile.getWebsiteLink(), excel.readDataFromExcel("Profile page", 8, 1));

		/*
		 * Validating the payments methods exists in profile by selecting the check box
		 */
		// Checking the header
		assert1.assertEquals(profile.getPaymentMethodsHeader(), excel.readDataFromExcel("Profile page", 10, 1));

		// Checking the UPI check box is enabled or not
		if (profile.UpiCheckboxElement().getAttribute("value").equals("false")) {
			profile.UpiCheckboxElement().click();
		}
		assert1.assertEquals(profile.UpiCheckboxElement().getAttribute("value"), "true");

		// Checking the Credit card check box is enabled or not
		if (profile.CreditCheckboxElement().getAttribute("value").equals("false")) {
			profile.CreditCheckboxElement().click();
		}
		assert1.assertEquals(profile.CreditCheckboxElement().getAttribute("value"), "true");

		// Checking the Debit card check box is enabled or not
		if (profile.DebitCheckboxElement().getAttribute("value").equals("false")) {
			profile.DebitCheckboxElement().click();
		}
		assert1.assertEquals(profile.DebitCheckboxElement().getAttribute("value"), "true");

		// Checking the netbanking card check box is enabled or not
		if (profile.NetbankingCheckboxElement().getAttribute("value").equals("false")) {
			profile.NetbankingCheckboxElement().click();
		}
		assert1.assertEquals(profile.NetbankingCheckboxElement().getAttribute("value"), "true");

		/*
		 * Validating the payment method by deselecting the checkbox
		 */
		// Checking the UPI check box is enabled or not
		profile.UpiCheckboxElement().click();
		assert1.assertEquals(profile.UpiCheckboxElement().getAttribute("value"), "false");

		// Checking the Credit card check box is enabled or not
		profile.CreditCheckboxElement().click();
		assert1.assertEquals(profile.CreditCheckboxElement().getAttribute("value"), "false");

		// Checking the Debit card check box is enabled or not
		profile.DebitCheckboxElement().click();
		assert1.assertEquals(profile.DebitCheckboxElement().getAttribute("value"), "false");

		// Checking the netbanking card check box is enabled or not
		profile.NetbankingCheckboxElement().click();
		assert1.assertEquals(profile.NetbankingCheckboxElement().getAttribute("value"), "false");

		/*
		 * Validating the processing account details
		 */
		// Checking the header of processing account
		assert1.assertEquals(profile.getProcessingAccHeader(), excel.readDataFromExcel("Profile page", 9, 1));

		// Checking the processing account number
		assert1.assertEquals(profile.getProcessingAccNum(), excel.readDataFromExcel("Profile page", 9, 1));

		// Checking the processing account ifsc
		assert1.assertEquals(profile.getProcessingAccIFSC(), excel.readDataFromExcel("Profile page", 10, 1));

		// Checking the processing account number
		assert1.assertEquals(profile.getReserveBal(), excel.readDataFromExcel("Profile page", 11, 1));

		// Checking the note in processing account
		assert1.assertEquals(profile.getProcessingAccNote(), excel.readDataFromExcel("Profile page", 12, 1));

	}

//	This method contains 25-34
	@Test(priority = 1)
	public void sideNaviMenuTest() throws InterruptedException {
		SoftAssert assert1 = new SoftAssert();

		/*
		 * Validating the side navigation bar
		 */
		// Checking the merchant name in side navigation menu
		Thread.sleep(2000);
		assert1.assertEquals(order.getCompanyName(), excel.readDataFromExcel("Profile page", 17, 1));

//		Checking the spelling of menu

		// checking the orders menu spelling
		assert1.assertEquals(order.clickOnOrdersMenuElement().getText(),
				excel.readDataFromExcel("Profile page", 21, 1));

		// checking the orders menu spelling
		assert1.assertEquals(order.clickOnSettlementMenuElement().getText(),
				excel.readDataFromExcel("Profile page", 22, 1));

		// checking the orders menu spelling
		assert1.assertEquals(order.clickOnCustomerChatMenuElement().getText(),
				excel.readDataFromExcel("Profile page", 23, 1));

		// checking the orders menu spelling
		assert1.assertEquals(order.clickOnDisputeMenuElement().getText(),
				excel.readDataFromExcel("Profile page", 24, 1));

		// checking the orders menu spelling
		assert1.assertEquals(order.clickOnReturnRefundMenuElement().getText(),
				excel.readDataFromExcel("Profile page", 25, 1));

		// checking the orders menu spelling
		assert1.assertEquals(order.clickOnIssueReportedMenuElement().getText(),
				excel.readDataFromExcel("Profile page", 26, 1));

		// checking the orders menu spelling
		assert1.assertEquals(order.clickOnCancellationMenuElement().getText(),
				excel.readDataFromExcel("Profile page", 27, 1));

		// checking the orders menu spelling
		assert1.assertEquals(order.clickOnNotificationMenuElement().getText(),
				excel.readDataFromExcel("Profile page", 28, 1));

//		Checking the menus in side navigation bar

		// Clicking on Settlements menu
		order.clickOnSettlementMenuElement().click();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 31, 1));
		order.clickOnBackwardButton();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 30, 1));

		// Clicking on customer chat menu
		order.clickOnCustomerChatMenuElement().click();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 32, 1));
		order.clickOnBackwardButton();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 30, 1));

		// Clicking on dispute menu
		order.clickOnDisputeMenuElement().click();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 33, 1));
		order.clickOnBackwardButton();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 30, 1));

		// Clicking on return and refund menu
		order.clickOnReturnRefundMenuElement().click();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 34, 1));
		order.clickOnBackwardButton();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 30, 1));

		// Clicking on issue reported menu
		order.clickOnIssueReportedMenuElement().click();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 35, 1));
		order.clickOnBackwardButton();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 30, 1));

		// Clicking on cancellation menu
		order.clickOnCancellationMenuElement().click();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 36, 1));
		order.clickOnBackwardButton();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 30, 1));

		// Clicking on notification menu
		order.clickOnNotificationMenuElement().click();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 37, 1));
		order.clickOnBackwardButton();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 30, 1));

		// Clicking on order menu
		order.clickOnSettlementMenuElement().click();
		Thread.sleep(2000);
		order.clickOnOrdersMenuElement().click();
		Thread.sleep(2000);
		assert1.assertEquals(order.getPageHeader(), excel.readDataFromExcel("Profile page", 30, 1));

	}
}
