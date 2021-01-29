package ProgressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZipCodePage  {
	
	WebDriver driver;
	
	// locating elements using by objects
	
	
	
	By ZipCode = By.xpath("//input[@id='zipCode_overlay']");
	By GetQuote = By.xpath("//input[@id='qsButton_overlay']");
	


		
	// OverLoaded
		
	public ZipCodePage (WebDriver driver) {
		this.driver = driver;
	}
	

 
 // ZipCOde
//public void ZipCodeElement (String zipcodenumber) {
	//driver.findElement(ZipCode).sendKeys(zipcodenumber);
//}
// GetQuote
//public void GetQuoteOption () {
	//WebElement element = driver.findElement(GetQuote);
		//element.click();
//}


/*public void ZipCodeElement(String zipcodenumber) {
	driver.findElement(ZipCode).sendKeys(zipcodenumber);
	
}*/
 public void ZipCodeElement() {
	driver.findElement(ZipCode).sendKeys("75038");
	
}

public void GetQuoteOption() {
	WebElement element = driver.findElement(GetQuote);
	element.click();
}
	
	
}

