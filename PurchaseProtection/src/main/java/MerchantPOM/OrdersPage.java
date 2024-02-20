package MerchantPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {

//	Declaration

	// To get the page header
	@FindBy(id = "PageHeader")
	private WebElement pageHeader;

	// To get the backward button
	@FindBy(id = "BackwardButton")
	private WebElement backwardButton;

	/*
	 * Side navigation elements
	 */
	// To get the vouch logo
	@FindBy(id = "VouchLogo")
	private WebElement vouchLogo;

	// To get the company name
	@FindBy(className = "bRvhow")
	private WebElement companyName;

	// To get the orders menu
	@FindBy(className = "iFXnxi")
	private WebElement ordersMenu;

	// To get the settlements menu
	@FindBy(className = "bbRiSj")
	private WebElement settlementMenu;

	// To get the customer chat menu
	@FindBy(className = "bqSMTw")
	private WebElement customerChatMenu;

	// To get the dispute menu
	@FindBy(className = "hhAMVK")
	private WebElement disputeMenu;

	// To get the return & refund menu
	@FindBy(className = "haUNYS")
	private WebElement returnRefundMenu;

	// To get the issue reported menu
	@FindBy(className = "gKsPec")
	private WebElement issueReportedMenu;

	// To get the cancellation menu
	@FindBy(className = "cSNNDf")
	private WebElement cancellationMenu;

	// To get the notification menu
	@FindBy(className = "ecrGcz")
	private WebElement notificationMenu;

	/*
	 * Order cards declaration
	 */
	// To get the text of total order text
	@FindBy(id = "TO-ValueText")
	private WebElement totalOrderValueText;

	// To get the total order value
	@FindBy(id = "TO-Value")
	private WebElement totalOrderValue;

	// To get the total amount earned text
	@FindBy(id = "TA-Earnedtext")
	private WebElement totalAmtEarnedText;

	// To get the total amount earned
	@FindBy(id = "TA-EarnedValue")
	private WebElement totalAmtEarnedThisMonth;

	// To get the total amount refunded text
	@FindBy(id = "TA-RefundedText")
	private WebElement totalAmtRefundedText;

	// To get the total amount refunded
	@FindBy(id = "TA-RefundedValue")
	private WebElement totalAmtRefundedThisMonth;

	/*
	 * Search filters
	 */
	//To get the search filter header
	@FindBy(id = "FilterHeader")
	private WebElement searchFilterHeader;
	
	// To get the Date range filter text
	@FindBy(id = "DateRangeText")
	private WebElement dateRangeText;

	// To get the Date range filter drop down
	@FindBy(id = "DateRange")
	private WebElement dateRangeDD;

	// need to locate the list of date range

	// To get the Start date calendar text
	@FindBy(id = "StartDateText")
	private WebElement startDateText;

	// To get the start date calendar
	@FindBy(id = "StartDateCalendar")
	private WebElement startDateCalendar;

	// To get the end date text
	@FindBy(id = "EndDateText")
	private WebElement endDateText;

	// To get the end date calendar
	@FindBy(id = "EndDateCalendar")
	private WebElement endDateCalendar;

	// To get the order status drop down
	@FindBy(id = "OrderStatusDD")
	private WebElement orderStatusDD;

	// To get the txn status drop down
	@FindBy(id = "TXNStatusDD")
	private WebElement txnStatusDD;

	// To get the apply button
	@FindBy(id = "ApplyButton")
	private WebElement applyButton;

	// To get the search bar
	@FindBy(id = "SearchBar")
	private WebElement searchBar;

	// To get the refresh button
	@FindBy(id = "RefreshButton")
	private WebElement refreshButton;

	// To get the export button
	@FindBy(id = "ExportButton")
	private WebElement exportButton;

	/*
	 * txn table
	 */
	// To get the table header
	@FindBy(xpath = "//thead/tr/th")
	private List<WebElement> txnHeaderList;

	// To get the table body rows
	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> txnBodyRowList;

	// To get the rows per page
	@FindBy(id = "pagination-rows")
	private WebElement rowPerPage;

	// To get the rows per page list
	@FindBy(xpath = "//ul")
	private List<WebElement> rowsPerPageList;

	// To get the displayed rows number in table footer
	@FindBy(xpath = "//p[contains(@class,'displayedRows')]")
	private WebElement displayedRowsNumber;

	// To get the pagination back
	@FindBy(id = "pagination-back")
	private WebElement paginationBack;

	// To get the pagination next
	@FindBy(id = "pagination-next")
	private WebElement paginationNext;

	/*
	 * Accordian action buttons
	 */
	// To get the chat button
	@FindBy(xpath = "//button[@class='sc-kypfzD dOtQFK']")
	private WebElement accordianChatButton;

	// To get the view button
	@FindBy(xpath = "//button[@class='sc-bRimrq cYyqwB']")
	private WebElement accordianViewButton;

	// To get the issue accept button
	@FindBy(xpath = "//button[@class='sc-hCrRFl kjJtKW']")
	private WebElement accordianAcceptButton;

	// To get the issue reject button
	@FindBy(xpath = "//button[@class='sc-bdlOLf cPEdtm']")
	private WebElement accoridanRejectButton;

	/*
	 * Accept return of product
	 */
	// To get return accept frame header
	@FindBy(id = "ReturnAccept")
	private WebElement returnAcceptHeader;

	// To get the product name text
	@FindBy(id = "ProductNameText")
	private WebElement productNameText;

	// To get the product name value
	@FindBy(id = "ProductNameValue")
	private WebElement productNameValue;

	// To get the amount text
	@FindBy(id = "AmounText")
	private WebElement returnAmtText;

	// To get the amount value
	@FindBy(id = "AmountValue")
	private WebElement returnAmt;

	// To get the accept button
	@FindBy(id = "Accept")
	private WebElement returnAcceptButton;

	// To get the cancel button
	@FindBy(id = "Cancel")
	private WebElement returnCancelButton;
	
	/*
	 * Reject Return of product screen
	 */
	//To get the reject return screen header
	@FindBy(id = "ReturnReject")
	private WebElement returnRejectHeader;
	
	//To get the reason for cancel the return input
	@FindBy(id = ":rj:")
	private WebElement reasonForCancelReturn;
	
	//To get the reject button
	@FindBy(id = "Reject")
	private WebElement returnRejectButton;
	
	/*
	 * Profile icon
	 */
	//To get the merchant name in profile icon pop tab
	@FindBy(id = "TopRightCompanyName")
	private WebElement merchantName;
	
	//To get the merchant ID in profile icon pop tab
	@FindBy(id = "MerchantIDValue")
	private WebElement merchantID;
	
	//To get the logged user for the company in profile icon pop tab
	@FindBy(id = "LoggedInAsValue")
	private WebElement loggedInAs;
	
	//To get the profile button in profile icon pop tab
	@FindBy(id = "GoToProfile")
	private WebElement goToProfile;
	
	//To get the processing statement button in profile icon pop tab
	@FindBy(id = "ProcessingStatement")
	private WebElement pocessingStatement;
	
	//To get the logout button in profile icon pop tab
	@FindBy(id = "Logout")
	private WebElement logout;
	
	//To get the profile icon
	@FindBy(xpath = "//img[@class='sc-doohEh kCkWBs']")
	private WebElement profileIcon;
	
	//To get the top notification bell 
	@FindBy(id = "Top-Notifications")
	private WebElement topNotification;
	
//	Initialization
	
	public OrdersPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

//	Utilization
	
	//This method is used to get the page header
	public String getPageHeader() {
		return pageHeader.getText();
	}

	//This method is used to click on backward button
	public void clickOnBackwardButton() {
		backwardButton.click();;
	}

    /*
     * Side navigation utilization
     */
	//This method is used to get the vouch logo as webelement
	public WebElement getVouchLogo() {
		return vouchLogo;
	}

	//This method is used to get the company name as string
	public String getCompanyName() {
		return companyName.getText();
	}

	//This method is used to click on order menu
	public WebElement clickOnOrdersMenuElement() {
		return ordersMenu;
	}

	//This method is used to click on settlement menu
	public WebElement clickOnSettlementMenuElement() {
		return settlementMenu;
	}

	//This method is used to click on customer chat menu
	public WebElement clickOnCustomerChatMenuElement() {
		return customerChatMenu;
	}

	//This method is used to click on dispute menu
	public WebElement clickOnDisputeMenuElement() {
	    return disputeMenu;
	}

	//This method is used to click on return and refund menu
	public WebElement clickOnReturnRefundMenuElement() {
		return returnRefundMenu;
	}

	//This method is used to click on issue reported menu
	public WebElement clickOnIssueReportedMenuElement() {
		return issueReportedMenu;
	}

	//This method is used to click on cancellation menu
	public WebElement clickOnCancellationMenuElement() {
		return cancellationMenu;
	}

	//This method is used to click on notification menu
	public WebElement clickOnNotificationMenuElement() {
		return notificationMenu;
	}

	/*
	 * orders cards utilization
	 */
	//This method is used to get the total order value text
	public String getTotalOrderValueText() {
		return totalOrderValueText.getText();
	}

	//This method is used to get total order value
	public String getTotalOrderValue() {
		return totalOrderValue.getText();
	}

	//This method is used to get total amount earned text
	public String getTotalAmtEarnedText() {
		return totalAmtEarnedText.getText();
	}

	//This method is used to get total amount earned this method
	public String getTotalAmtEarnedThisMonth() {
		return totalAmtEarnedThisMonth.getText();
	}

	//This method is used to get total amount refunded text
	public String getTotalAmtRefundedText() {
		return totalAmtRefundedText.getText();
	}

	//This method is used to get the total amount refunded in this month
	public String getTotalAmtRefundedThisMonth() {
		return totalAmtRefundedThisMonth.getText();
	}
	
	/*
	 * Search filter utilization
	 */
	//This method is used to get the search filter header
	public String getSearchFilterHeader() {
		return searchFilterHeader.getText();
	}

	//This method is used to get the text in date range drop down
	public String getDateRangeText() {
		return dateRangeText.getText();
	}

	//This method is used to click on date range drop down
	public void clickOnDateRangeDD() {
		dateRangeDD.click();
	}

	//This method is used to get the start date text
	public String  getStartDateText() {
		return startDateText.getText();
	}

	//This method is used to click on start date calendar
	public void clickOnStartDateCalendar() {
		startDateCalendar.click();
	}

	//This method is used to get the end date text
	public String getEndDateText() {
		return endDateText.getText();
	}

	//This method is used to click on end date calendar
	public void clickOnEndDateCalendar() {
		endDateCalendar.click();
	}

	//This method is used to click on order status drop down
	public void clickOnOrderStatusDD() {
		orderStatusDD.click();
	}

	//This method is used to click on txn status drop down
	public void clickOnTxnStatusDD() {
		txnStatusDD.click();
	}

	//This method is used to click on apply button
	public void clickOnApplyButton() {
		applyButton.click();
	}

	//This method is used to send the input into search bar
	public void sendInputToSearchBar(String searchInput) {
		searchBar.sendKeys(searchInput);
	}

	//This method is used to click on refresh button
	public void clickOnRefreshButton() {
		refreshButton.click();
	}

	//This method is used to export the txn shown in the table by click on it
	public void clickOnExportButton() {
		exportButton.click();
	}

	/*
	 * Txn table
	 */
	//To fetch the txn table header
	public List<WebElement> getTxnHeaderList() {
		return txnHeaderList;
	}

	//To fetch the txn body rows
	public List<WebElement> getTxnBodyRowList() {
		return txnBodyRowList;
	}

	//This method is used to click on rows per page drop down
	public void clickOnRowPerPageDD() {
		rowPerPage.click();
	}

	//This method is used to get the rows per page number list
	public List<WebElement> getNumOfRowsPerPageList() {
		return rowsPerPageList;
	}

	//This method is used to get the number of rows displayed or num of entries
	public String getNumOfEtriesInTable() {
		return displayedRowsNumber.getText();
	}

	//This method is used to get the pagination back button as element
	public WebElement getPaginationBackElement() {
		return paginationBack;
	}

	//This method is used to get the pagination next button as element
	public WebElement getPaginationNextElement() {
		return paginationNext;
	}

	/*
	 * Accordian action button
	 */
	//This method is used to click on accordian chat button
	public void clickOnAccordianChatButton() {
		accordianChatButton.click();
	}

	//This method is used to click on accordian view button
	public void clickOnAccordianViewButton() {
		accordianViewButton.click();
	}

	//This method is used to click on accordian accept button
	public void clickOnAccordianAcceptButton() {
		accordianAcceptButton.click();
	}

	//This method is used to click on accordian reject button
	public void clickOnAccoridanRejectButton() {
		accoridanRejectButton.click();
	}

	/*
	 * Return accept screen
	 */
	//This method is used to get the return accept header
	public String getReturnAcceptHeader() {
		return returnAcceptHeader.getText();
	}

	//This method is used to get the product name
	public String getProductNameText() {
		return productNameText.getText();
	}

	//This method is used to get the product name value
	public String getProductNameValue() {
		return productNameValue.getText();
	}

	//This method is used to get the amount text
	public String getReturnAmtText() {
		return returnAmtText.getText();
	}

	//This method is used to get the amount
	public String getReturnAmt() {
		return returnAmt.getText();
	}

	//This method is used to click on return accept button
	public void clickOnReturnAcceptButton() {
		returnAcceptButton.click();
	}

	//This method is used to click on cancel button
	public void clickOnReturnCancelButton() {
		returnCancelButton.click();
	}

	//This method is used to get the reject screen header
	public String getReturnRejectHeader() {
		return returnRejectHeader.getText();
	}

	//This method is used to reason for cancel the return
	public void sendReasonForCancelReturn(String reasonForcancel) {
		reasonForCancelReturn.sendKeys(reasonForcancel);;
	}

	//This method is used to reject the return
	public void clickOnReturnRejectButton() {
		returnRejectButton.click();
	}

	//This method is used to get the merchant name
	public String getMerchantName() {
		return merchantName.getText();
	}
	
    //This method is used to get the merchant id
	public String getMerchantID() {
		return merchantID.getText();
	}

	//This method is used to get the logged in as
	public String getLoggedInAsName() {
		return loggedInAs.getText();
	}

	//This method is used to return the profile element
	public WebElement getProfileElement() {
		return goToProfile;
	}

	//This method is used to return the processing statement element
	public WebElement getProcessingStatementElement() {
		return pocessingStatement;
	}

	//This method is used to return the logout element
	public WebElement getLogoutElement() {
		return logout;
	}
	
	//This method is used to click on profile icon
	public void clickOnProfileIcon() {
	    profileIcon.click();
	}
	
	//This method is used to click on top notification bell icon
	public void clickOnBellNotification() {
		topNotification.click();
	}

}
