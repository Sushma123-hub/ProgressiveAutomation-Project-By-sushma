package ProgressiveInsurance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TellAboutVehiclePage {
	
	WebDriver driver;
	
	// locating elements using by objects
	By vehicleyear = By.xpath("//li[@tabindex='-2'][3]");
	////list-input[@id="VehiclesNew_embedded_questions_list_Year"]/ul/li[3]   	
	//By vehicleyear = By.xpath("//li[@class='ng-star-inserted']");
	//By vehicleyear = By.xpath("*[@id=\"VehiclesNew_embedded_questions_list_Year\"]/ul/li[4]']");
	//By vehiclemake = By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Make']");
	By vehiclemake = By.xpath("//*[@id=\"VehiclesNew_embedded_questions_list_Make\"]/ul/li[3]']");
	By vehiclemodel = By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Model']");
	By bodytype = By.xpath("//select[@name='VehiclesNew_embedded_questions_list_BodyStyle']");
	By primaryusebutton = By.xpath("//select[@analytics-id='VehiclesNew_VehicleUse']");
	By usingforVehicleclick = By.xpath("//question[@property='VehicleTransportNetworkCompanyIndicator']");
	By ownOrleasebutton = By.xpath("//select[@analytics-id='VehiclesNew_OwnOrLease']");
	By owningTime = By.xpath("//select[@analytics-id='VehiclesNew_LengthOfOwnership']");
	By doneclick = By.xpath("(//loading-button[@data-automation-id='forwardNavigation'])[1]");
	By continueclick=By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
			
				
		// OverLoaded
			
		public TellAboutVehiclePage (WebDriver driver) {
			this.driver = driver;
		}

		//Creating a method that lets us interact  elements
		//VehicleYear
		
		public void SelectVehicleYear (String madeyear) {
			 WebElement vehicleyear = driver.findElement(By.xpath("//li[@tabindex='-2'][3]"));
			 vehicleyear.click();
				vehicleyear.sendKeys(Keys.RETURN);
				vehicleyear.sendKeys(madeyear);
				
				vehicleyear.sendKeys(Keys.TAB);
			 
			 //public void SelectVehicleYear(int index) {
			
			//List<WebElement>yearlist=driver.findElements(vehicleyear);
			//for(int); i=0;i<yearlist.size();i++
	
		
			
		
			
			
		}
		
		public void SelectVehicleMake(String VehicleMake) {
			WebElement vehiclemake = driver.findElement(By.xpath("//*[@id=\"VehiclesNew_embedded_questions_list_Make\"]/ul/li[3]"));
			 vehiclemake.click();
				vehiclemake.sendKeys(Keys.RETURN);
				vehiclemake.sendKeys(VehicleMake);
				
				vehiclemake.sendKeys(Keys.TAB);	
			
			
			//WebElement element = driver.findElement(vehiclemake);
			//Select choosevehiclemake = new Select (element);
			//choosevehiclemake.selectByIndex(index);
						
		}
		
		
		public void SelectVehicleModel(String modelvehicle) {
			WebElement vehiclemodel = driver.findElement(By.xpath("//*[@id=\"VehiclesNew_embedded_questions_list_Model\"]/ul/li[3]"));
			 vehiclemodel.click();
				vehiclemodel.sendKeys(Keys.RETURN);
				vehiclemodel.sendKeys(modelvehicle);
				
				vehiclemodel.sendKeys(Keys.TAB);
		}

		public void SelectPrimaryUse(int index) {
			WebElement element = driver.findElement(primaryusebutton);
			Select chooseprimaryuse = new Select (element);
			chooseprimaryuse.selectByIndex(index);
				
		}

		public void SelectbodyType(int index) {
			WebElement element = driver.findElement(bodytype);
			Select choosebodytype = new Select (element);
			choosebodytype.selectByIndex(index);
				}
		
		public void UseOfVehicle() {
			WebElement element = driver.findElement(usingforVehicleclick);
			   element.click();
				}
		
		public void SelectOwnOrLease (int index) {
			WebElement element = driver.findElement(ownOrleasebutton);
			Select chooseownorlease = new Select (element);
			chooseownorlease.selectByIndex(index);
				
			
		}
		
		public void SelectOwningTime(int index) {
			WebElement element = driver.findElement(owningTime);
			Select chooseowningtime = new Select (element);
			chooseowningtime.selectByIndex(index);
					
		}
      
		public void Done() {
		WebElement element = driver.findElement(doneclick);
		  element.click();
				}
		public void Continue() {
			WebElement element = driver.findElement(continueclick);
			  element.click();
		}
}

		
		

