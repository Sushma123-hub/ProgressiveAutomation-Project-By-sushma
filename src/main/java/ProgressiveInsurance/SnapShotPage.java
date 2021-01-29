package ProgressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SnapShotPage {
	
	WebDriver driver;
	
	By enrollSnapShot = By.xpath("//input[@analytics-id='SnapshotEnrollment40Edit_SnapshotPolicyEnrollment_N']");
	By Tocontinue = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
	
	//Default
	
	public  SnapShotPage() {
		
	}
	
	public SnapShotPage (WebDriver driver) {
		this.driver = driver;
	}

	
	public void SnapShotEnroll () {
		WebElement element = driver.findElement(enrollSnapShot);
		element.click();
	}
	public void PageContinue() {
    	WebElement element = driver.findElement(Tocontinue);
    	element.click();
	}
}
