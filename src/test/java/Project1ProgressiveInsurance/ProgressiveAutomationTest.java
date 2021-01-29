package Project1ProgressiveInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import ProgressiveInsurance.ZipCodePage;
import SnapShotUtilities.GooglesnapShotUtils;
import ProgressiveInsurance.AutoClickPage;
import ProgressiveInsurance.ContinueWithAuto;
import ProgressiveInsurance.CustomerInformation;
import ProgressiveInsurance.DriversPage;
import ProgressiveInsurance.DriversYourQuote;
import ProgressiveInsurance.InsuranceHistory;
import ProgressiveInsurance.ReviewDriverPersonalInformation;
import ProgressiveInsurance.SnapShotPage;
import ProgressiveInsurance.TellAboutVehiclePage;

public class ProgressiveAutomationTest {
	
	//public static WebDriver driver ;
	
	 WebDriver driver;
	 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
				
	//public static void main(String[] args) {
		
		//invokebrowser();
		//AutoPage();
		//ZCodePage();
		//CustomerInformation1();
		//VehiclePage();
		//DriversInformation();
		//DriversQuote();
		//VerifyDriverInformation();
		//HistoryofInsurance();
		//snapshot();//
		//ContinueAuto();
						
		//terminatebrowser();
	//}
		
@BeforeTest
	//public static void invokebrowser() {
	public  void invokebrowser() {
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test = extent.createTest(" Progressive insurance actaul page test");
	test.info("Successfully executing Progressive insurance page");
	test.pass("sucessfully Navigate to Progressive Insurance page");

	
	System.setProperty("webdriver.chrome.driver", ".\\Libs\\chromedriver.exe");		
	 driver = new ChromeDriver();
	 GooglesnapShotUtils snap = new GooglesnapShotUtils();
	 snap.takeSnapShot(driver, "Progressive home  page shot");
	 driver.get("https://www.progressive.com/");
	
		 
	  if(driver.getTitle().equals("Quote Auto Insurance, Home-Auto Bundles, & More | Progressive")) {
		 
	  System.out.println(" ProgressiveDirect page is launched------");
	} else {
	System.out.println("Invalid page---------");
			 		 
			}
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
     
			     }

@Test(priority =1)	
	public void AutoPage() {
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test1 = extent.createTest(" Auto Click Option Page");
		test1.info("Successfully clicked Auto Option");
		test1.pass("Suceess as per expected");
		
try {	
			
			AutoClickPage ProgressiveForm = new AutoClickPage(driver);
			ProgressiveForm.AutoClickOption();
			Thread.sleep(3000);
	
		}catch(Exception e) {
			 e.printStackTrace();
			   e.getCause();
			  e.getMessage();
		}
extent.flush();
	}

	
@Test(priority=2)	  
			  
		public  void ZCodePage() {
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			ExtentTest test2 = extent.createTest(" ZipCode Click Option Page");
			test2.pass("Successfully filled zipcode and start quote");
try {
				ZipCodePage ProgressiveForm1 = new ZipCodePage(driver);
				ProgressiveForm1.ZipCodeElement();
				Thread.sleep(2000);
				
				ProgressiveForm1.GetQuoteOption();
				Thread.sleep(2000);
					
		
		}catch(Exception e) {
			 e.printStackTrace();
			   e.getCause();
			  e.getMessage();
			   
		}
extent.flush();
}
		
	
@Test(priority=3)
		public   void CustomerInformation1() {
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			ExtentTest test3 = extent.createTest(" CustomerInformation Page is executed");
			test3.pass("Successfully filled CustomerInformation");
			

	try {
			Thread.sleep(10000);
		
		CustomerInformation ProgressiveInsuranceForm2 = new CustomerInformation(driver);
		
		ProgressiveInsuranceForm2.FirstName("Rosu");
		Thread.sleep(2000);
		
	    ProgressiveInsuranceForm2.MiddleName(" S ");
		Thread.sleep(2000);
		ProgressiveInsuranceForm2.LastName("Jacobs");
		Thread.sleep(2000);
		ProgressiveInsuranceForm2.Suffix(2);
		Thread.sleep(2000);
		ProgressiveInsuranceForm2.DateOfBirth("02/05/1994");
		Thread.sleep(2000);
		ProgressiveInsuranceForm2.MailingAddress("3456 Crosby Street");
		
		Thread.sleep(2000);
		ProgressiveInsuranceForm2.Unitnumber("1005");
		Thread.sleep(2000);
		ProgressiveInsuranceForm2.POB();
		Thread.sleep(2000);
		ProgressiveInsuranceForm2.MyQuote();
		Thread.sleep(2000);
		
		
		
			}catch(Exception e) {
				 e.printStackTrace();
				 e.getCause();
				  e.getMessage();
			 }
	extent.flush();
	}
		
@Test(priority=4)	
		public  void VehiclePage() {
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test4 = extent.createTest(" Vehicle Information Page is executed");
		test4.pass("Successfully filled Vehicle Information");
		try {
			Thread.sleep(10000);
		
		TellAboutVehiclePage ProgressiveForm3 = new TellAboutVehiclePage(driver);
		ProgressiveForm3.SelectVehicleYear("2019");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	
	    ProgressiveForm3.SelectVehicleMake("Audi");
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		ProgressiveForm3.SelectVehicleModel("A5");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ProgressiveForm3.SelectbodyType(2);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ProgressiveForm3.SelectPrimaryUse(2);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ProgressiveForm3.UseOfVehicle();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ProgressiveForm3.SelectOwnOrLease(2);
		Thread.sleep(2000);
		ProgressiveForm3.SelectOwningTime(3);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ProgressiveForm3.Done();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ProgressiveForm3.Continue();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}catch (Exception e) {
			e.printStackTrace();
			 e.getCause();
			  e.getMessage();
		}
		extent.flush();
		}

@Test(priority=5)
		public  void DriversInformation() {
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test5 = extent.createTest(" Driver Information Page is executed");
	test5.pass("Successfully filled Driver Information");
	
try {
		
				
		DriversPage ProgressiveForm4 = new DriversPage(driver);
		
		ProgressiveForm4.SelectGender();
		Thread.sleep(2000);
		ProgressiveForm4.MaritialStatus(1);
		Thread.sleep(2000);
		ProgressiveForm4.Educationlevel(3);
		Thread.sleep(2000);
		ProgressiveForm4.EmploymentStatus(2);
		Thread.sleep(2000);
		ProgressiveForm4.SocialSecurity("456-456-4567");
		Thread.sleep(2000);
		ProgressiveForm4.PrimaryResidence(1);
		Thread.sleep(2000);
		ProgressiveForm4.MoveClickOption(1);
		Thread.sleep(2000);
		ProgressiveForm4.LicencedYears("3 years or more");
		Thread.sleep(2000);
		ProgressiveForm4.AccidentalClaims();
		Thread.sleep(2000);
		ProgressiveForm4.TicketsOrViolations();
		Thread.sleep(2000);
		ProgressiveForm4.ContinuePage();
		Thread.sleep(2000);
			}catch(Exception e) {
			e.printStackTrace();
			 e.getCause();
			  e.getMessage();
		}
extent.flush();
		}
@Test(priority=6)
		public  void DriversQuote() {
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test6 = extent.createTest(" DriveresQuote Page is executed");
	test6.pass("Successfully click the quote");
try {
			DriversYourQuote Progressiveform5 = new DriversYourQuote(driver);
			Progressiveform5.ContinueClick();
			Thread.sleep(2000);
			
		}catch (Exception e) {
		
		
			e.printStackTrace();
		
			e.getCause();
			e.getMessage();
		}
extent.flush();
}
		    
		
		
		
@Test(priority=7)	
		public  void VerifyDriverInformation() {
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test7 = extent.createTest(" Verify Driver Information Page is executed");
	test7.pass("Successfully Verified Driver Information");
try {
			ReviewDriverPersonalInformation ProgressiveForm6 = new ReviewDriverPersonalInformation(driver);
			ProgressiveForm6.ContinueOption();
			Thread.sleep(3000);
			}catch (Exception e) {
				e.printStackTrace();			
				e.getCause();
				e.getMessage();
			}
extent.flush();
		}
		
@Test(priority=8)
		public  void HistoryofInsurance() {
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test8 = extent.createTest(" Insurance History Page is executed");
	test8.pass("Successfully filled Insurance");
			try {
		InsuranceHistory ProgressiveForm7 = new InsuranceHistory(driver);
		ProgressiveForm7.InsuranceToday();
		Thread.sleep(2000);
		
		ProgressiveForm7.PreviousInsurance();
		Thread.sleep(2000);
		ProgressiveForm7.ProgressiveInsuarnceHistory();
		Thread.sleep(2000);
		ProgressiveForm7.EmailAddress("RS@gmail.com");	
		Thread.sleep(3000);
		ProgressiveForm7.TotalResidents("3");
		Thread.sleep(2000);
		ProgressiveForm7.CurrentResidence(1);
		Thread.sleep(2000);
		ProgressiveForm7.InjuryClaims(2);
		Thread.sleep(2000);
		ProgressiveForm7.PageContinue();
		Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();			
			e.getCause();
			e.getMessage();
		}
	extent.flush();
		}

		
@Test(priority=9)
		public  void snapshot() {
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test3 = extent.createTest(" Taking Snap shot Page is executed");
	test3.pass("Successfully Clicked the button");
	
try {
		SnapShotPage ProgressiveForm8 = new SnapShotPage(driver);
		ProgressiveForm8.SnapShotEnroll();
		Thread.sleep(2000);
		ProgressiveForm8.PageContinue();
		Thread.sleep(2000);
		}catch( Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
extent.flush();
		}
@Test(priority=10)
		public  void ContinueAuto() {
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test10 = extent.createTest(" Final Auto page is executed");
	test10.pass("Successfully Generate the Quote");
try {
		ContinueWithAuto ProgressiveForm9 = new ContinueWithAuto(driver);
		ProgressiveForm9.JustAutoContinue();
		GooglesnapShotUtils snap2 = new GooglesnapShotUtils();
		snap2.takeSnapShot(driver, "Able to generate the quote");
		}catch( Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}

  extent.flush();
		}
		
	@AfterTest

	public void terminatebrowser() {
		
		// driver.quit();
				 
				
	}
	
	
	
	}


