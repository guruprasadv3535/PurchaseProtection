package PluginPom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MerchantWebsitePage {

	// Declaration

	/*
	 * Login page of WooCommerce
	 */
	@FindBy(id = "user_login")
	private WebElement usernameField;

	@FindBy(id = "user_pass")
	private WebElement passwordField;

	@FindBy(id = "wp-submit")
	private WebElement loginButton;

	/*
	 * WooCommerce dashboard
	 */
	@FindBy(xpath = "//button[@title='Close']")
	private WebElement closeFrame;

	@FindBy(className = "lc-iframe")
	private WebElement frameElement;

	@FindBy(xpath = "//a[text()=\"User's blog\"]")
	private WebElement toVistStore;

	@FindBy(xpath = "//div[text()=\"Plugins \"]")
	private WebElement plugin;

	@FindBy(xpath = "//a[text()='Installed Plugins']")
	private WebElement installedPluginsMenu;

	@FindBy(xpath = "//a[text()='Add New Plugin']")
	private WebElement addNew;

	//installed pluging page
	@FindBy(id = "plugin-search-input")
	private WebElement searchInstalledPlugin;

	@FindBy(xpath = "//tbody[@id='the-list']/tr")
	private WebElement listOfInstalledPlugin;
	
	@FindBy(xpath = "//a[text()='Deactivate']")
	private WebElement deactivateButton;
	
	@FindBy(xpath = "//a[text()='Delete']")
	private WebElement deletePlugin;
	
	@FindBy(xpath = "//a[text()='Activate']")
	private WebElement activateAtInstalledPlugin;
	
	//Add new plugin
	@FindBy(id = "search-plugins")
	private WebElement searchForNewPlugin;
	
	@FindBy(xpath = "//div[contains(@class,'vouch-release')]/descendant::h3")
	private WebElement pluginLink;
	
	@FindBy(xpath = "//div[contains(@class,'vouch-release')]/descendant::a[@class='install-now button']")
    private WebElement installPluginButton;
	
	@FindBy(xpath = "//div[contains(@class,'vouch-release')]/descendant::a[text()='More Details']")
	private WebElement pluginMoreDetails;
	
	@FindBy(xpath = "//div[contains(@class,'vouch-release')]/descendant::a[text()='Activate']")
	private WebElement pluginActivate;
	
	// Website home page
	@FindBy(xpath = "(//a[text()='Everything'])[1]")
	private WebElement allProducts;

	@FindBy(xpath = "(//i[contains(@class,'ast-icon-shopping-basket')])[1]")
	private WebElement goToCart;
	
	//View details pop up
	@FindBy(xpath = "//a[text()='View details']")
	private WebElement viewDetailsButton;
	
	@FindBy(id = "TB_closeWindowButton")
	private WebElement closeViewDetailsScreen;
	
	@FindBy(xpath = "//div[@id='plugin-information-title']/h2")
	private WebElement viewDetailsHeader;
	
	@FindBy(id = "TB_iframeContent")
	private WebElement viewDetailsFrame;
	
	

//	Initialization
	public MerchantWebsitePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	Utilization

	/*
	 * Login page of woocommerce
	 */
	public void sendUserName(String username) {
		usernameField.sendKeys(username);
	}

	public void sendPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLogin() {
		loginButton.click();
	}

	/*
	 * WooCommerce dashboard
	 */
	public void closeTheFrame() {
		closeFrame.click();
	}

	public WebElement getFrameElement() {
		return frameElement;
	}

	public WebElement getToVistStoreElement() {
		return toVistStore;
	}

	public WebElement getPluginElement() {
		return plugin;
	}

	public WebElement getInstalledPluginsMenuElement() {
		return installedPluginsMenu;
	}

	public WebElement getAddNewElement() {
		return addNew;
	}

	//Installed pluging page
	public WebElement getSearchInstalledPluginElement() {
		return searchInstalledPlugin;
	}

	public WebElement getListOfInstalledPluginElement() {
		return listOfInstalledPlugin;
	}
	
	public WebElement deactivateElement() {
		return deactivateButton;
	}
	
	public void clickOnDelete() {
		deletePlugin.click();
	}
	
	public void clickOnActivateAtInstalledPlugin() {
		activateAtInstalledPlugin.click();
	}
	
	//Add new plugin
	public WebElement getSearchForNewPluginElement() {
		return searchForNewPlugin;
	}
	
	public WebElement getPluginLinkElement() {
		return pluginLink;
	}
	
	public void clickOnInstallPlugin() {
		installPluginButton.click();
	}
	
	public void clickOnMoreDetails() {
		pluginMoreDetails.click();
	}
	
	public WebElement getActivatePluginElement() {
		return pluginActivate;
	}
	
	//view details screen
	public void clickOnViewDetailsButton() {
		viewDetailsButton.click();
	}
	
	public void clickOnCloseViewDetailsScreen() {
		closeViewDetailsScreen.click();
	}
	
	public String getViewDetailsHeader() {
		return viewDetailsHeader.getText();
	}
	
	public WebElement getViewDetailsFrameElement() {
		return viewDetailsFrame;
	}
	

	// Website home page
	public void clickOnAllProduts() {
		allProducts.click();
	}
	
	public WebElement getGoToCartElement() {
		return goToCart;
	}

}
