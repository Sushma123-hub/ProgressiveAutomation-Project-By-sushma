package GooGlePageTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import GooglePage.GoogleHomePage;
import SnapShotUtilities.GooglesnapShotUtils;


 public class GoogleHomePageTest {
 WebDriver driver ;
 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport_google.html");
 
	   
	
@BeforeTest
	public void BeforeTest() {
		
		//Set System Path
		
		System.setProperty("webdriver.chrome.driver", ".\\Libs\\chromedriver.exe");
		
		driver = new ChromeDriver();		
		}
	
   public void navigateToGoogleHomePage() {	    
   	   try {
		   GoogleHomePage homepage = new GoogleHomePage(driver);
		   GooglesnapShotUtils utils = new GooglesnapShotUtils();       
		   		   
		   driver.get("https://google.com");
		  Thread.sleep(5000);		   
		  driver.manage().window().maximize();
		   
		  Assert.assertTrue(homepage.isPageOpened());
		   		  
		   utils.takeSnapShot(driver, "Google Homepage");
		   
		   
	   } catch(Exception e) {
		   e.printStackTrace();
		   
			   
		   }
	   }
		   
 @Test
	   public void GoogleSearch() {
		   navigateToGoogleHomePage();
		   ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			ExtentTest test1 = extent.createTest(" Google home page test");
			test1.info("Successfully executing Google page");
			test1.pass("sucessfully Navigate to Google page");
	   
  
	   try {
		  	   
		   GoogleHomePage homepage = new GoogleHomePage(driver);
		GooglesnapShotUtils utils = new GooglesnapShotUtils();
		    homepage.search("What is TestNg?");
		   utils.takeSnapShot(driver, "Searching TestNg Results");   
		  
		
		   
		   
	   } catch(Exception e) {
		 e.printStackTrace();
		   e.getCause();
		   e.getMessage();
		   
		   
	   }
	   extent.flush();
}

	  
	   @org.testng.annotations.AfterTest
	   public void AfterTest() {
	  
		   
			// driver.quit();
		   
	   }
}
