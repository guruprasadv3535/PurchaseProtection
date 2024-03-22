package PluginTestScripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genricLibraries.BaseClass;

public class CustomerSidePurchaseProtection extends BaseClass{

	// This method is used for checkout
		private void navigateToCheckout() throws InterruptedException {
			website.getToVistStoreElement().click();
			if (website.getGoToCartElement().getAttribute("data-cart-total").equals("0")) {
				website.clickOnAllProduts();
				Thread.sleep(2000);
				product.orderByElement().click();
				Select select = new Select(product.orderByElement());
				select.selectByIndex(4);
				Thread.sleep(2000);
				product.gethandSanitizerElement().click();
				Thread.sleep(2000);
				product.getAddToCartElement().click();
				website.getGoToCartElement().click();
				Thread.sleep(1000);
				product.getCheckOutElement().click();

			} else if (Integer.parseInt(website.getGoToCartElement().getAttribute("data-cart-total")) == 1) {

				website.getGoToCartElement().click();
				Thread.sleep(1000);
				product.getCheckOutElement().click();

			} else if (Integer.parseInt(website.getGoToCartElement().getAttribute("data-cart-total")) > 1) {
				website.getGoToCartElement().click();
				Thread.sleep(1000);
				product.getViewCartElement().click();
				Thread.sleep(1000);
				product.getQuantityFieldElement().clear();
				Thread.sleep(1000);
				product.getQuantityFieldElement().sendKeys("1");
				product.getUpdateCartButtonElement().click();
				web.scrollToElement(product.getProceedToCheckoutElement());
				Thread.sleep(2000);
				product.getProceedToCheckoutElement().click();

			}

		}
		
		//This method contains 17-24 test cases
		@Test
		public void checkCustomerAbleToUsePP() throws InterruptedException {
			SoftAssert assert1=new SoftAssert();
			Thread.sleep(2000);
			
			/* Look for the 'Purchaser Protection' payment option in payment gateway */
			navigateToCheckout();
			Thread.sleep(2000);
			assert1.assertEquals(product.getPaymentOptionElement().getText(), "Vouch payment");
			
			/* Check customer can select the 'Purchase Protection' payment option available in merchant store checkout page */
		    web.scrollToElement(product.getPurchaseProtectionPaymentRadioElement());
		    Thread.sleep(3000);
		    product.getPurchaseProtectionPaymentRadioElement().click();
		    assert1.assertTrue( product.getPurchaseProtectionPaymentRadioElement().isSelected(),"Not able to select the PP payment");
		   
			/*Check customer can select the 'Purchaser Protection' payment option after selecting other payment method*/
		    web.scrollToElement(product.getCashOnDeliveryRadioElement());
		    Thread.sleep(2000);
		    product.getCashOnDeliveryRadioElement().click();
		    assert1.assertTrue(product.getCashOnDeliveryRadioElement().isSelected(),"Not able to select other payment option");
		    product.getPurchaseProtectionPaymentRadioElement().click();
		    assert1.assertTrue( product.getPurchaseProtectionPaymentRadioElement().isSelected(),"Not able to select the PP payment after selecting other payment");
			
		    /* Refresh the checkout/vouch payment gateway */
		    product.getPlaceOrderButtonElement().click();
		    Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			/*Place the order by selecting Purchase Protection payment option*/
			assert1.assertEquals(driver.getTitle(), "Checkout");
			
			Thread.sleep(5000);
			assert1.assertAll();
		}
		
		public void checkVouchCheckoutPage() throws InterruptedException {
			SoftAssert assert1=new SoftAssert();
			Thread.sleep(2000);
			navigateToCheckout();
			web.scrollToElement(product.getPurchaseProtectionPaymentRadioElement());
			Thread.sleep(2000);
			product.getPurchaseProtectionPaymentRadioElement().click();
			assert1.assertTrue(product.getPurchaseProtectionPaymentRadioElement().isSelected(),"PP payment is not selected");
			product.getPlaceOrderButtonElement().click();
			Thread.sleep(10000);
			assert1.assertEquals(driver.getTitle(), "Checkout");
			
			/*Check the elements need to be there in the desktop version of vouch Payment gateway*/
			assert1.assertTrue(checkout.getAmountDisplayedInHeader().isDisplayed());
			assert1.assertTrue(checkout.getCheckoutBackwardButtonElement().isDisplayed());
			assert1.assertEquals(checkout.getAmountOnUpiCardElement().getText(), "You will Pay ₹1");
			assert1.assertEquals(checkout.getTaxOnUpiCardElement().getText(), "(Including 0% fee)");
			assert1.assertEquals(checkout.getUpiCardTitleElement().getText(), "UPI");
			assert1.assertTrue(checkout.getAddUpiElement().isEnabled(),"Add New UPI button not enabled");
			
			/*Check the logo in the vouch Payment gateway*/
			//Need to check manually
			
			/*Validate the amount showing to pay in the header of vouch Payment gateway with the amount shown in merchant store checkout price details*/
			assert1.assertEquals(checkout.getAmountDisplayedInHeader().getText(), ""/*need to add dynamic amount*/);
			
			/*Check the payment options available in vouch payment gateway*/
			
			/*Check the UPI payment methods to pay money*/
			
			/*Click on the backward button in landing page of vouch Payment gateway*/
			
			/*Select ENTER UPI & PAY in landing page of vouch payment gateway*/
			
			/*Check the elements need to be there in the 'Enter UPI' screen*/
			
			/*Enter valid UPI ID (valid format i.e abc@xyz) and click on Verify and pay*/
			
			/*Enter valid UPI ID and complete the payment successfully within 10 mins*/
			
			/*Enter valid UPI ID and decline the payment in UPI app*/
			
			/*Enter valid UPI ID and try to complete the payment after 10 mins*/
			
			/*Enter invalid UPI ID and click on Verify and pay*/
			
			/*Click on verify by passing null value in upi filed*/
			
			/*click on backward button in Enter upi page*/
		}
}
