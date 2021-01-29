package Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GooglePage.GoogleHomePage;
import SnapShotUtilities.GooglesnapShotUtils;

public class PropertiesConfigTestNgDemo {
	
	public WebDriver driver;
	
	//Store value of browser
	public static String browserName = null;
	
	// Create Instance of Propery Configuration
	//PropertiesConfiguration config = new PropertiesConfiguration();
	
	@BeforeTest
	public void invokebrowser() {
		PropertiesConfiguration.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Libs\\chromedriver.exe");
			driver = new ChromeDriver();
		//}else if(browserName.equalsIgnoreCase("firefox")) {
		//	System.setProperty("webdriver.gecko.driver", ".\\Libs\\geckodriver.exe");
			//driver = new FirefoxDriver();
	//	}else {
			System.out.println("Invalid browser name");
		}
		
	}
	
	public void navigatetoHomePage() {
		driver.get("https://www.progressive.com/");
		String title = driver.getTitle();
		
		if(title.contains("Quote Auto Insurance, Home-Auto Bundles, & More | Progressive")) {
			System.out.println(title +"Progressive page Launched");
		}else {
			System.out.println("Failed Incorrect Title" );
	}
		}
	
	
	@Test(priority=1)
	public void AutoPage() {
		System.out.println("Success AutoClick option test");
	}
	@Test(priority=2)	
	public  void ZCodePage() {
		System.out.println("Successfully Run the ZipCodepage");
	}
	
	
@Test(priority=3)
public   void CustomerInformation1() {
	System.out.println("Successfully Run the CustomerInformation1 page");
}


@Test(priority=4)	
public  void VehiclePage() {
	System.out.println("Successfully Run the VehiclePage page");
}

@Test(priority=5)
public  void DriversInformation() {
	System.out.println("Successfully Run the DriversInformation page");
}
@Test(priority=6)
public  void DriversQuote() {
	System.out.println("Successfully Run the DriversQuote page");
}
@Test(priority=7)	
public  void VerifyDriverInformation() {
	System.out.println("Successfully Run the VerifyDriverInformation page");
}
@Test(priority=8)
public  void HistoryofInsurance() {
	System.out.println("Successfully Run the HistoryofInsurance page");
}

@Test(priority=9)
	public  void snapshot() {
		System.out.println("Successfully Run the snapshot page");
	}
@Test(priority=10)
public  void ContinueAuto() {
	System.out.println("Successfully Run the only Auto page");
}


	  

@AfterTest

public void terminatebrowser() {
	// close the session 
			// driver.quit();
	System.out.println("Terminating the browser");
	PropertiesConfiguration.setproperties();
	
}
}
	



