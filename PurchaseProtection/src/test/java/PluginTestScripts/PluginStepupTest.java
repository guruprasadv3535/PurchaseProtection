package PluginTestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genricLibraries.BaseClassWithoutProfile;

//This class contains TC 1 to 16
public class PluginStepupTest extends BaseClassWithoutProfile {

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

//	This method contains TC-1
	@Test
	public void checkPGWithoutInstallingPlugin() throws InterruptedException {
		SoftAssert assert1 = new SoftAssert();
		Thread.sleep(2000);
		website.sendUserName("user");
		website.sendPassword("YaYBvFS4Hbr+");
		website.clickOnLogin();

		Thread.sleep(2000);
//		web.switchToFrame(website.getFrameElement());
//		website.closeTheFrame();
//		web.switchBackFromFrame();

		web.scrollToElement(website.getPluginElement());
		Thread.sleep(1000);
		website.getPluginElement().click();
		Thread.sleep(2000);
		web.scrollToElement(website.getSearchInstalledPluginElement());
		Thread.sleep(1000);
		website.getSearchInstalledPluginElement().sendKeys("vouch");
		Thread.sleep(2000);
		if (website.getListOfInstalledPluginElement().getAttribute("class").equals("no-items")) {

			navigateToCheckout();
			
			String paymentMode = product.getCheckoutNoteElement().getText();

			assert1.assertTrue(paymentMode.contains("Sorry, it seems that there are no available payment methods."),
					"Note not matched");
		} else {

			List<WebElement> columns = website.getListOfInstalledPluginElement().findElements(By.tagName("td"));
			WebElement pluginName = columns.get(0).findElement(By.tagName("strong"));
			if (pluginName.getText().equals("Vouch - Release on delivery for WooCommerce")) {
				try {
					/*
					 * Check the Deactivate option in 'installed plugin' if the plugin is activated
					 */
					assert1.assertTrue(website.deactivateElement().isDisplayed(),"Deactive is not displayed for active plugin");
					website.deactivateElement().click();
					website.clickOnDelete();
					if (driver.switchTo().alert().getText().contains("Are you sure you want to delete Vouch")) {
						driver.switchTo().alert().accept();
					}

				} catch (Exception e) {
					/* Uninstal the plugin without deactivating it */
					website.clickOnDelete();
					if (driver.switchTo().alert().getText().contains("Are you sure you want to delete Vouch")) {
						driver.switchTo().alert().accept();
					}
				}
				Thread.sleep(2000);
				navigateToCheckout();

				String paymentMode = product.getCheckoutNoteElement().getText();
				
				assert1.assertTrue(paymentMode.contains("Sorry, it seems that there are no available payment methods."),
						"Note not matched");
			} else {
				System.out.println("plugin not matched");
			}

		}

		Thread.sleep(2000);
		assert1.assertAll();
	}

	//This method contains TC-1 to 16
	@Test(dependsOnMethods = "checkPGWithoutInstallingPlugin")
	public void pluginInstalVerification() throws InterruptedException {
		SoftAssert assert1 = new SoftAssert();
		Thread.sleep(2000);
		website.sendUserName("user");
		website.sendPassword("YaYBvFS4Hbr+");
		website.clickOnLogin();
		Thread.sleep(2000);
		web.scrollToElement(website.getPluginElement());
		Thread.sleep(1000);
		website.getPluginElement().click();
		Thread.sleep(2000);
		web.scrollToElement(website.getSearchInstalledPluginElement());
		Thread.sleep(1000);
		website.getSearchInstalledPluginElement().sendKeys("vouch");
		Thread.sleep(2000);
		assert1.assertEquals(website.getListOfInstalledPluginElement().getAttribute("class"), "no-items");
		
		/*
		 * Check the purchase protection plugin is available to instal in merchant
		 * 'WooCommerce'
		 */
		website.getAddNewElement().click();
		Thread.sleep(2000);
		website.getSearchForNewPluginElement().sendKeys("vouch");
		Thread.sleep(2000);
		assert1.assertEquals(website.getPluginLinkElement().getText(), "Vouch – Release on delivery for WooCommerce");

		/*
		 * Check user able to install the purchase protection plugin in there WooCommerce
		 * website
		 */
		if(website.getPluginLinkElement().getText().equals("Vouch – Release on delivery for WooCommerce")) {
			website.clickOnInstallPlugin();
		}
		Thread.sleep(5000);
		assert1.assertTrue(website.getActivatePluginElement().isDisplayed(),"Activate button not displayed in new plugin");
		website.getInstalledPluginsMenuElement().click();
		Thread.sleep(2000);
		web.scrollToElement(website.getSearchInstalledPluginElement());
		Thread.sleep(1000);
		website.getSearchInstalledPluginElement().sendKeys("vouch");
		Thread.sleep(2000);
		List<WebElement> columns = website.getListOfInstalledPluginElement().findElements(By.tagName("td"));
		WebElement pluginName = columns.get(0).findElement(By.tagName("strong"));
		assert1.assertEquals(pluginName.getText(), "Vouch - Release on delivery for WooCommerce");


		/*
		 * Activate the plugin in installed plugin page to enable the purchase protection in payment options of
		 * merchant woocommerce website
		 */
		website.clickOnActivateAtInstalledPlugin();
		web.scrollToElement(website.deactivateElement()); 
		Thread.sleep(2000);
		assert1.assertTrue(website.deactivateElement().isDisplayed(),"Plugin not activated");

		/*
		 * Validate the Thumbnail and Discription details mentioned on purchase
		 * protection plugin
		 */
		//Thumbnail validation
		List<WebElement> thumbNailList = website.getListOfInstalledPluginElement().findElements(By.tagName("td"));
		WebElement thumbNail = thumbNailList.get(0).findElement(By.tagName("strong"));
		assert1.assertEquals(thumbNail.getText(), "Vouch - Release on delivery for WooCommerce");
		
		//Description validation
		List<WebElement> descriptionList = website.getListOfInstalledPluginElement().findElements(By.tagName("td"));
		WebElement description=descriptionList.get(1).findElement(By.tagName("p"));
		assert1.assertEquals(description.getText(), "Allows you to use Vouch - Release on delivery payment gateway with the WooCommerce plugin.");
		

		/* Validate the 'More Details' on plugin in add new plugin section. */
		website.clickOnViewDetailsButton();
		Thread.sleep(5000);
		driver.switchTo().frame(website.getViewDetailsFrameElement());
		assert1.assertEquals(website.getViewDetailsHeader(), "Vouch – Release on delivery for WooCommerce");
		driver.switchTo().defaultContent();
		website.clickOnCloseViewDetailsScreen();

		/*
		 * Validate the installed purchase protection are showing in the 'Installed
		 * Plugins'
		 */
		Thread.sleep(2000);
		website.getInstalledPluginsMenuElement().click();
		Thread.sleep(2000);
		web.scrollToElement(website.getSearchInstalledPluginElement());
		Thread.sleep(1000);
		website.getSearchInstalledPluginElement().sendKeys("vouch");
		Thread.sleep(2000);
		List<WebElement> columns1 = website.getListOfInstalledPluginElement().findElements(By.tagName("td"));
		WebElement pluginName1 = columns1.get(0).findElement(By.tagName("strong"));
		assert1.assertEquals(pluginName1.getText(), "Vouch - Release on delivery for WooCommerce");

		/* Check the details showing in installed plugin */
		//already covered

		/* Check user able to Uninstal the plugin after deactivating the plugin */
		//already covered

		/* Validate user able to update the plugin if any updates available */
		//no updated are available

		/*
		 * Enabling the 'Purchase Protection' payment mode in merchant store by
		 * installing and activating the plugin in WooCommerce
		 */
		navigateToCheckout();
		assert1.assertTrue(product.getPaymentOptionElement().isDisplayed(),"Purchaser protection payment option not displayed");
		

	}
}
