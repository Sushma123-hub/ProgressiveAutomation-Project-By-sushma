package ProgressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContinueWithAuto {
 WebDriver driver ;
 
 
 
 
 By continuewithAuto = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");// no thanks just Auto
 
  
 public ContinueWithAuto(WebDriver driver) {
	 this.driver= driver;
 }
 
 public void JustAutoContinue () {
	 WebElement element = driver.findElement(continuewithAuto);
	 element.click();
 }
}

