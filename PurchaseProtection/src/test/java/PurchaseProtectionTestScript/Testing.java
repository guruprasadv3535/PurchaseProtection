package PurchaseProtectionTestScript;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	@Test
	public void test() throws InterruptedException {

//		WebDriverManager.chromedriver().browserVersion("122.0.6261.58").setup();
		
		WebDriverManager.chromedriver().setup();
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.quit();

	}
	
	@Test
	public void date() throws ParseException {
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	        Date creditDate = dateFormat.parse("13-04-2023 15:38:24");
	        Date DebitDate = dateFormat.parse("12-04-2023 15:10:37");
	        
	        if(creditDate.before(DebitDate)) {
	        	System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }
	        
	}

}
