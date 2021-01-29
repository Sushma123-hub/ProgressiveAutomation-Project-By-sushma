package ProgressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriversPage {
	
	WebDriver driver;
	
	// locating elements using by objects
	
	By selectgender = By.xpath("//input[@ value ='F']");
	By maritialstatus= By.xpath("//select[@analytics-id='DriversAddPniDetails_MaritalStatus']");
	By educationlevel=By.xpath("//select[@analytics-id='DriversAddPniDetails_HighestLevelOfEducation']");
	By Empstatus= By.xpath("//select[@analytics-id='DriversAddPniDetails_EmploymentStatus']");
	By ssn = By.xpath("//input[@input-format='ssn']");
	By primaryresidence = By.xpath("//select[@analytics-id='DriversAddPniDetails_PrimaryResidence']");
	By moveoption = By.xpath("//select[@analytics-id='DriversAddPniDetails_HasPriorAddress']");
	By licensestatus = By.xpath("//select[@analytics-id='DriversAddPniDetails_LicenseStatus']");
	By yearlicensed = By.xpath("//select[@analytics-id='DriversAddPniDetails_DriverYearsLicensed']");
	By accidentclaims = By.xpath("//input[@analytics-id='DriversAddPniDetails_HasAccidentsOrClaims_N']");
	By ticketsorviolations = By.xpath("//input[@analytics-id='DriversAddPniDetails_HasTicketsOrViolations_N']");
	By continueoption = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
	
	
		
	// OverLoaded
		
	public DriversPage (WebDriver driver) {
		this.driver = driver;
	}
	//Creating a method that lets us interact with elements
	
	public void SelectGender () {
		WebElement element = driver.findElement(selectgender);
		element.click();
		
	}
	
	public void MaritialStatus (int Index) {
		WebElement element = driver.findElement(maritialstatus);
		Select choosestatus = new Select(element);
		choosestatus.selectByIndex(Index);
	}

	public void Educationlevel (int Index) {
		WebElement element = driver.findElement(educationlevel);
		Select chooseEdulevel = new Select(element);
	     chooseEdulevel.selectByIndex(Index);
			
	}
	
	public void EmploymentStatus (int Index) {
		WebElement element = driver.findElement(Empstatus);
		Select chooseEmpstatus = new Select(element);
	     chooseEmpstatus.selectByIndex(Index);
		
	}
	
	public void SocialSecurity (String SSN) {
		driver.findElement(ssn).sendKeys(SSN);
	}
	
	public void PrimaryResidence (int Index) {
		WebElement element = driver.findElement(primaryresidence);
		Select chooseResidence = new Select(element);
	     chooseResidence.selectByIndex(Index);
	}
	public void MoveClickOption (int Index) {
		WebElement element = driver.findElement(moveoption);
		Select chooseMoveOption = new Select(element);
	     chooseMoveOption.selectByIndex(Index);
	}
	public void LicencedYears (String LDyear) {
		WebElement yearlicensed = driver.findElement(By.xpath("//select[@analytics-id='DriversAddPniDetails_DriverYearsLicensed']"));
		 yearlicensed.click();
			yearlicensed.sendKeys(Keys.RETURN);
			yearlicensed.sendKeys(LDyear);
			
			yearlicensed.sendKeys(Keys.TAB);	
		
		//WebElement element = driver.findElement(licensestatus);
		//Select chooseLicense = new Select(element);
	    // chooseLicense.selectByIndex(Index);
	}
	public void AccidentalClaims () {
		WebElement element = driver.findElement(accidentclaims);
		element.click();
	}
	public void TicketsOrViolations () {
		WebElement element = driver.findElement(ticketsorviolations);
		element.click();
	}
	 public void ContinuePage() {
		 WebElement element = driver.findElement(continueoption);
			element.click();
	 }
	
}
