package genricLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import MerchantPOM.LoginPage;
import MerchantPOM.OrdersPage;
import MerchantPOM.ProfilePage;
import MerchantPOM.SliderNotificationPage;
import MerchantPOM.ViewTransactionPage;

public class BaseClass {

	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;

//	pom classes need to declared
	protected LoginPage login;
	protected OrdersPage order;
	protected ProfilePage profile;
	protected ViewTransactionPage viewTxn;
	protected SliderNotificationPage sliderNotify;
	

//	@BeforeSuite   because there is no database to connect in this project
//	@BeforeTest    because we are not doing parallel execution in this project

	@BeforeClass
	public void classConfig() {
		property = new PropertiesUtility();
		excel = new ExcelUtility();
		web = new WebDriverUtility();

		property.propertiesInit(UtilitiesPath.PROPERTIES_PATH);
		excel.excelInit(UtilitiesPath.EXCEL_PATH);

	}

//	cross browser testing 
    //	@Parameters("browser")
	
	@BeforeMethod
	public void methodConfig() {

		driver = web.launchBrowser(property.readData("browserProfile"));
		
//		for cross browser testing
		//driver=web.launchBrowser(browser);
		
		web.maximizeBrowser();
//		for  live
		web.navigateToApp(property.readData("url"));
//		for sandbox
		//web.navigateToApp(property.readData("sandBoxUrl"));
		web.waitUntilElementFound(Long.parseLong(property.readData("time")));

		// pom classes initialize
		login=new LoginPage(driver);
		profile=new ProfilePage(driver);
		order=new OrdersPage(driver);
		viewTxn=new ViewTransactionPage(driver);
		sliderNotify=new SliderNotificationPage(driver);
	}

	@AfterMethod
	public void methodTearDown() {
		web.quitAllWindows();
	}

	@AfterClass
	public void classTearDown() {
		excel.closeExcel();
	}
//	@AfterTest
//	@AfterSuite
}
