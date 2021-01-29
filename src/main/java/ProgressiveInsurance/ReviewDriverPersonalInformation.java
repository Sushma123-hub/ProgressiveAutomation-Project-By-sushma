package ProgressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewDriverPersonalInformation {
   WebDriver driver;
	
	//
	By continueclick = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
	
	  
	public ReviewDriverPersonalInformation(WebDriver driver) {
		this.driver = driver;
	}
	
	// 
	public void ContinueOption() {
		 WebElement element = driver.findElement(continueclick);
			element.click();
	}
}



