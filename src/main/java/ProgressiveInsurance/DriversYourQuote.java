package ProgressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriversYourQuote {
	
	WebDriver driver;
	
	//
	By continueclick = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
	
	
  
	public DriversYourQuote(WebDriver driver) {
		this.driver = driver;
	}
	
	// 
	public void ContinueClick() {
		 WebElement element = driver.findElement(continueclick);
			element.click();
	}
}
