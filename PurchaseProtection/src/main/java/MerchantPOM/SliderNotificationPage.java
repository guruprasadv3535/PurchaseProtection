package MerchantPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderNotificationPage {

//	Declaration
	
	// To get the notification slider header
	@FindBy(xpath = "//div[@id=\"notificationFrame\"]/div[@class='div-3']/div")
	private WebElement sliderNotificationHeader;
	
	// To get the 'x' button element
	@FindBy(className = "x-close")
	private WebElement closeNotificationSlider;
	
//	Initialization
	
	public SliderNotificationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
//	Utilization
	
	// This method is used to get the notification slider header
	public String getNotificationSliderHeader() {
		return sliderNotificationHeader.getText();
	}
	
	// This method is used to click on the notification slider 'x' button
	public void clickOnCloseNotificationSlider() {
		closeNotificationSlider.click();
	}

}
