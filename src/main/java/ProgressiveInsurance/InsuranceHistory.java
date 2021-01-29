package ProgressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsuranceHistory {
	
	WebDriver driver ;
	
	// locating elements using by objects
	
	By Todayinsurance = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_N']");
	By priorInsurance = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceLastMonth_N']");
	By ProgressiveInsuarnce = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_N']");
	By emailAddress = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress']");
    By NoOfResidents = By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']");
    By currentResidence = By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_CurrentResidence']");
    By totalClaim = By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_TotalPipClaimsCount']");
    By nextContinue = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    
    
    //Overlaoded
    public InsuranceHistory(WebDriver driver) {
    	this.driver= driver;
    }
    
    public void InsuranceToday () {
    	//WebElement Todayinsurance = driver.findElement(By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_N']"));
		//Todayinsurance.click();
			//Todayinsurance.sendKeys(Keys.RETURN);
			//Todayinsurance.sendKeys(Option);
			
			//Todayinsurance.sendKeys(Keys.TAB);
    WebElement element = driver.findElement(Todayinsurance);
    	element.click();
    }
    
    public void PreviousInsurance () {
    	WebElement element = driver.findElement(priorInsurance);
    	element.click();
    	 }
    
        
    
    public void ProgressiveInsuarnceHistory() {
    	WebElement element = driver.findElement(ProgressiveInsuarnce);
    	element.click();
    }
    public void EmailAddress (String EmailId) {
    	driver.findElement(emailAddress).sendKeys(EmailId);
    	driver.findElement(emailAddress).sendKeys(Keys.TAB);
    }
    
    public void TotalResidents(String number) {
    	WebElement NoOfResidents = driver.findElement(By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']"));
		 NoOfResidents.click();		 
		 NoOfResidents.sendKeys(Keys.RETURN);
		//NoOfResidents.sendKeys(Keys.CLEAR);
		NoOfResidents.sendKeys(number);
		NoOfResidents.sendKeys(Keys.TAB);	  	
    	    	
    }
    
    public void CurrentResidence(int Index) {
    	WebElement element = driver.findElement(currentResidence);
    	Select ResidenceYear = new Select (element);
    	ResidenceYear.selectByIndex(Index);    	
    	
    }
    public void InjuryClaims(int index) {
    	WebElement element = driver.findElement(totalClaim);
    	Select chooseclaims = new Select (element);
    	chooseclaims.selectByIndex(index);
    }
    
    public void PageContinue() {
    	WebElement element = driver.findElement(nextContinue);
    	element.click();
    	
    }
}
