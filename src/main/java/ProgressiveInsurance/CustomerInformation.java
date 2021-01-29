package ProgressiveInsurance;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerInformation {
	
	WebDriver driver;
	
	// locating elements using by objects
	
	
	
	
	By FirstNameField = By.xpath("//input[@Analytics-id='NameAndAddressEdit_FirstName']");	
	//By FirstNameField = By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_FirstName']");
	By MiddleNameField = By.xpath("//input[@Analytics-id='NameAndAddressEdit_MiddleInitial']");
	By LastNameField = By.xpath("//input[@Analytics-id='NameAndAddressEdit_LastName']");
	By SuffixButton = By.xpath("//select[@Analytics-id='NameAndAddressEdit_Suffix']");
	By DOBField = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']");
	By StreetNameField = By.xpath("//input[@Analytics-id='NameAndAddressEdit_MailingAddress']");
	By AptUnitField = By.xpath("//input[@Analytics-id='NameAndAddressEdit_ApartmentUnit']");
	By PostBoxField = By.xpath("//span[@ class='label ng-star-inserted']");
	By startQuoteButton = By.xpath("//loading-button[@data-Automation-id='forwardNavigation']");
	
	//@FindBy(xpath ="//input[@Analytics-id='NameAndAddressEdit_FirstName']" )
	//WebElement FirstNameField;
	//@FindBy(xpath ="//input[@Analytics-id='NameAndAddressEdit_MiddleInitial']" )
	//WebElement MiddleNameField;
	//@FindBy(xpath ="//input[@Analytics-id='NameAndAddressEdit_LastName']" )
	//WebElement LastNameField;
	//@FindBy(xpath ="//select[@Analytics-id='NameAndAddressEdit_Suffix']" )
	//WebElement SuffixButton;
	//@FindBy(xpath ="//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']" )
	//WebElement DOBField;
	//@FindBy(xpath ="//input[@Analytics-id='NameAndAddressEdit_MailingAddress']" )
	//WebElement StreetNameField;
	//@FindBy(xpath ="//input[@Analytics-id='NameAndAddressEdit_ApartmentUnit']" )
	//WebElement AptUnitField;
	//@FindBy(xpath ="//span[@ class='label ng-star-inserted']" )
	//WebElement PostBoxField;
	//@FindBy(xpath ="//loading-button[@data-Automation-id='forwardNavigation']" )
	//WebElement StartQuoteButton;
	
	
	
			
		
			
		public CustomerInformation (WebDriver driver) {
			this.driver = driver;
		}
  // public CustomerInformation() {
			 //PageFactory.initElements(driver, this);
		 

	//Creating a method that lets us interact with elements
		
		//FirstName
		
		public void FirstName ( String firstname) {
			driver.findElement(FirstNameField).sendKeys(firstname);
		
			//FirstNameField.sendKeys(firstname);
			
		}
       
		//Middle Name
		public void MiddleName ( String Midname) {
			driver.findElement(MiddleNameField).sendKeys(Midname);
			
			//MiddleNameField.sendKeys(Midname);
			
			
		}
		
		//LastNAme
		public void LastName ( String lastname) {
		driver.findElement(LastNameField).sendKeys(lastname);
			
			//LastNameField.sendKeys(lastname);
			
		}
		
	   //Suffix
		
		public void Suffix (int index) {
				
		WebElement element = driver.findElement(SuffixButton);
		Select chooseSuffix = new Select(element);
		chooseSuffix.selectByIndex(index);
			//SuffixButton.click();
		}
		//SuffixButton.clear();
		//SuffixButton.
						
		
	
		//DOB
		public void DateOfBirth ( String BirthDate) {
		driver.findElement(DOBField).sendKeys(BirthDate);
		driver.findElement(DOBField).sendKeys(Keys.TAB);
				
		
		}

      //Mailing Address
		public void MailingAddress (String Address) {
	    WebElement StreetNameField = driver.findElement(By.xpath("//input[@Analytics-id='NameAndAddressEdit_MailingAddress']"));
	    StreetNameField.click();
		StreetNameField.sendKeys(Keys.RETURN);
		//StreetNameField.sendKeys("3456 Crosby Street");
		StreetNameField.sendKeys(Address);
		
		StreetNameField.sendKeys(Keys.TAB);
		
		
		//driver.findElement(By.id("NameAndAddressEdit_embedded_questions_list_MailingAddress"));
		
			
			 //StreetNameField.sendKeys(Keys.ENTER);
			 //StreetNameField.sendKeys(StreetName);
						
					
			//driver.findElement(By.xpath("//input[@Analytics-id='NameAndAddressEdit_MailingAddress']")).sendKeys(StreetName);
			//StreetNameField.sendKeys(Keys.CLEAR);
			//StreetNameField.sendKeys(Keys.TAB);
			//StreetNameField.sendKeys(StreetName);
			
		}
			
			
		

      //Unit
		public void Unitnumber (String unitnumber) {
			driver.findElement(AptUnitField).sendKeys(unitnumber);
			//AptUnitField.sendKeys(Keys.CLEAR);
			//AptUnitField.sendKeys(Keys.TAB);
			//AptUnitField.sendKeys(unitnumber);
			
			
			
		}
		//P.O.Box
		public void POB (){
			WebElement element = driver.findElement(PostBoxField);
			element.click();
		}
		//Start My quote
		public void MyQuote() {
			WebElement element = driver.findElement(startQuoteButton);
			element.click();
		}
}


