package GooglePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	
		public WebDriver driver ;
		
		// Constructor to create an object of this class
		
		public GoogleHomePage(WebDriver driver) {
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath=" //input[@name='q']")
		WebElement searchField;
			
		public void search(String search) {
			searchField.sendKeys(search);
			searchField.sendKeys(Keys.RETURN);
		}
			
			public boolean isPageOpened() {
				return driver.getTitle().contains("Google");
				
				
			
			
			
		}

		
		}
		


