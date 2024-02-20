package MerchantPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewTransactionPage {

//	Declaration

	/*
	 * Order details (left tab)
	 */
	// To get the txn id text
	@FindBy(id = "TxnID")
	private WebElement txnIdText;

	// To get the txn id value
	@FindBy(id = "TxnIDValue")
	private WebElement txnIdValue;

	// To get the customer ph no value
	@FindBy(id = "CusPhNo")
	private WebElement custPhNoText;

	// To get the customer ph no
	@FindBy(id = "CusPhNoValue")
	private WebElement custPhNo;

	// To get the customer name text
	@FindBy(id = "CusName")
	private WebElement custNameText;

	// To get the customer name
	@FindBy(id = "CusNameValue")
	private WebElement custNameValue;

	// To get the created at text
	@FindBy(id = "CreatedAt")
	private WebElement orderCreatedAtText;

	// To get the order created at time
	@FindBy(id = "CreatedAtDate")
	private WebElement orderCreatedAtDate;

	// To get the Amount text
	@FindBy(id = "Amount")
	private WebElement amountText;

	// To get the order amount
	@FindBy(id = "ViewTxnAmtValue")
	private WebElement orderAmount;

	// To get the product name text
	@FindBy(id = "ProductNames")
	private WebElement productNameText;

	// To get the product names
	@FindBy(id = "ProductList")
	private WebElement productList;

	// To get the txn status text
	@FindBy(id = "TxnStatus")
	private WebElement txnStatusText;

	// To get the txn status
	@FindBy(id = "TxnStatusValue")
	private WebElement txnStatus;

	// To get the order status text
	@FindBy(id = "OrderStatus")
	private WebElement orderStatusText;

	// To get the order status
	@FindBy(id = "OrderStatusValue")
	private WebElement orderStatus;

	// To get the shipment track link text
	@FindBy(id = "ShipmentTrackLink")
	private WebElement shipmentTrackLinkText;

	// To get the field to enter the shipment track link
	@FindBy(id = "TrackingLinkField")
	private WebElement shipmentTrackLinkField;

	// To get the order status drop down
	@FindBy(id = "UpdateOrderStatus")
	private WebElement orderStatusDD;

	// To get the tracking link edit button
	@FindBy(id = "TrackingLinkEdit")
	private WebElement trackLinkEditButton;

	// To get the update button
	@FindBy(id = "Update")
	private WebElement updateButton;

	/*
	 * View - transaction time line(right tab)
	 */
	// To get the current status in time line
	@FindBy(id = "CurrentStatus")
	private WebElement currentStatusInTimeLine;

	// To get the time line drop down button
	@FindBy(id = "TimeLineDD")
	private WebElement timeLineDDButton;

	// To get the order time line
	@FindBy(id = "OrderTimeLine")
	private WebElement orderTimeLine;

	// To get the go to chat button
	@FindBy(id = "GoToChat")
	private WebElement goToChatButton;

	/*
	 * Return pick up time line / extra elements in view transaction screen
	 */
	// To get the header of update return tab
	@FindBy(id = "updateReturn")
	private WebElement updateReturnPickupHeader;

	// To get the return pickup date text in field
	@FindBy(id = "ReturnPickupDate")
	private WebElement returnPickupDateText;

	// To get the return pick up date field
	@FindBy(id = "ReturnPickupDateField")
	private WebElement returnPickupDateField;

	// To get the return pick up date calendar
	@FindBy(id = "ReturnPickupDateCalendar")
	private WebElement returnPickupDateCalendar;

	/*
	 * issue raised
	 */
	// To get the accept button in view transaction screen
	@FindBy(id = "Accept")
	private WebElement acceptButton;

	// To get the reject button in view transaction screen
	@FindBy(id = "Reject")
	private WebElement rejectButton;

	// To get the time to take action text
	@FindBy(id = "TimetoTakeAction")
	private WebElement tiemToTakeActionText;

	// To get the new shipment track link text
	@FindBy(id = "NewShipmentTrackLink")
	private WebElement newShipmentTrackLinkText;

	// To get the new shipment track link field
	@FindBy(id = "NewTrackingLinkField")
	private WebElement newTrackingLinkField;
	
//	Initialization
	public ViewTransactionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	Utilization
	
	/*
	 * Order details (left tab)
	 */
	//This method is used to get the txn ID text
	public String getTxnIdText() {
		return txnIdText.getText();
	}

	//This method is used to get the txn ID value
	public String getTxnIdValue() {
		return txnIdValue.getText();
	}

	//This method is used to get the customer phone number text
	public String getCustPhNoText() {
		return custPhNoText.getText();
	}

	//This method is used to get the customer phone number value
	public String getCustPhNo() {
		return custPhNo.getText();
	}

	//This method is used to get the customer name text
	public String getCustNameText() {
		return custNameText.getText();
	}

	//This method is used to get the customer name
	public String getCustNameValue() {
		return custNameValue.getText();
	}

	//This method is used to get the order created at text
	public String getOrderCreatedAtText() {
		return orderCreatedAtText.getText();
	}

	//This method is used to get the order created at date
	public String getOrderCreatedAtDate() {
		return orderCreatedAtDate.getText();
	}

	//This method is used to get the amount text
	public String getAmountText() {
		return amountText.getText();
	}

	//This method is used to get the order amount
	public String getOrderAmount() {
		return orderAmount.getText();
	}

	//This method is used to get the product name text
	public String getProductNameText() {
		return productNameText.getText();
	}

	//This method is used to get the product list
	public String getProductList() {
		return productList.getText();
	}

	//This method is used to get the status text
	public String getTxnStatusText() {
		return txnStatusText.getText();
	}

	//This method is used to get the txn status of order
	public String getTxnStatus() {
		return txnStatus.getText();
	}

	//This method is used to get the order status text
	public String getOrderStatusText() {
		return orderStatusText.getText();
	}

	//This method is used to get the order status
	public String getOrderStatus() {
		return orderStatus.getText();
	}

	//This method is used to shipment track link text
	public String getShipmentTrackLinkText() {
		return shipmentTrackLinkText.getText();
	}

	//This method is used to send the shipment link
	public void sendShipmentTrackLinkField(String shipmentTrackLink) {
		shipmentTrackLinkField.sendKeys(shipmentTrackLink);
	}

	//This method is used to click on order status drop down
	public void clickOnOrderStatusDD() {
		orderStatusDD.click();
	}

	//This method is used to click edit button to edit the tracking link
	public void clickOnTrackLinkEditButton() {
		trackLinkEditButton.click();
	}

	//This method is used to click on update button
	public void clickOnUpdateButton() {
		updateButton.click();
	}

	//This method is used to get the current status in time line
	public String getCurrentStatusInTimeLine() {
		return currentStatusInTimeLine.getText();
	}

	//This method is used to click on time line drop down method
	public void clickOnTimeLineDDButton() {
		timeLineDDButton.click();
	}

	//This method is used to get the order time line 
	public WebElement getOrderTimeLine() {
		return orderTimeLine;
	}

	//This method is used to click on go to chat button
	public void clickOnGoToChatButton() {
		goToChatButton.click();
	}

	//This method is used to get the return pick up header
	public String getUpdateReturnPickupHeader() {
		return updateReturnPickupHeader.getText();
	}

	//This method is used to get the return pick up date text
	public String getReturnPickupDateText() {
		return returnPickupDateText.getText();
	}

	//This method is used to get the return pick up field
	public void sendToReturnPickupDateField(String returnPickupDate) {
		returnPickupDateField.sendKeys(returnPickupDate);;
	}

	//This method is used to click on return pickup calendar
	public void clickOnReturnPickupDateCalendar() {
		returnPickupDateCalendar.click();
	}

	//This method is used to click on accetp button
	public WebElement getAcceptButtonElement() {
		return acceptButton;
	}

	//This method is used to get the reject button as WebElement
	public WebElement getRejectButtonElement() {
		return rejectButton;
	}

	//This method is used to get the time to take action text
	public WebElement getTiemToTakeActionText() {
		return tiemToTakeActionText;
	}

	//This method is used to get the new shipment track link text
	public String getNewShipmentTrackLinkText() {
		return newShipmentTrackLinkText.getText();
	}

	//This method is used to send new tracking link into field
	public void sendToNewTrackingLinkField(String newTrackLink) {
		newTrackingLinkField.sendKeys(newTrackLink);
	}
	
}
