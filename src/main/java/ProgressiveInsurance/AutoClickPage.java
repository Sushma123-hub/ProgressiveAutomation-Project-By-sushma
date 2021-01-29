package ProgressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoClickPage {
WebDriver driver;


By AutoClick = By.xpath("//p[@class='txt'][1]");
//By AutoClick = By.cssSelector("p.txt");
//By AutoClick = By.xpath("//a[@data-tracking-label='auto_section']");
	


public  AutoClickPage (WebDriver driver) {
	this.driver = driver;
}



//Creating a method that lets us interact with elements

//Auto Insurance
//public void AutoClickOption () {
	 
	//WebElement element = driver.findElement(AutoClick);
	//element.click();
	 
//}


public void AutoClickOption() {
	WebElement element = driver.findElement(AutoClick);
	element.click();
	
	
}
}