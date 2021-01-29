package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesConfiguration {
	
	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		
		// 1: Get Current properties
		 getProperties();
		 
		 
		 //2: Set Current properties
		 setproperties();
		 
		 //3: GEt Updated Properties
		 getProperties();
		
	}

	 
		

	public static void getProperties() {
		try {
			
			// create an object for Inputstream retrieve value from config.properties file
			InputStream input = new FileInputStream(projectpath + "/src/main/java/Properties/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
				
			//String name = prop.getProperty("name");
						
			System.out.println(browser + " Is invoked");
			PropertiesConfigTestNgDemo.browserName=browser;
			//System.out.println("My name is " + name);
			
			}catch(Exception e) {
				e.printStackTrace();
				e.getCause();
				e.getMessage();
		}
	}
	public static void setproperties() {
		try {
			// create an object for Outputstream to write to the config file
			OutputStream output = new FileOutputStream(projectpath + "/src/main/java/Properties/config.properties");
			prop.setProperty("browser", "FireFox");
			prop.setProperty("Result", "Pass");
			prop.setProperty("FirstName","Rosu");
			prop.setProperty("MiddleName","S");
			prop.setProperty("LastName","Jacobs");
			prop.setProperty("DateOfBirth", "02/05/1994");
			prop.setProperty("MailingAddress", "3456 Crosby Street");
			prop.setProperty("Unitnumber", "1005");
		
			prop.setProperty("SelectVehicleYear","2019");
			prop.setProperty("SelectVehicleMake","Audi");
			prop.setProperty("SelectVehicleModel","A5");
			prop.setProperty("SelectVehicleModel","A5");
			prop.setProperty("SelectBodyType","2");
			prop.setProperty("SelectPrimaryUse","2");
			prop.setProperty("SelectOwnorLease","2");
			prop.setProperty("SelectOwningTimee","3");
			
			prop.setProperty("SelectGender","female");
			prop.setProperty("MaritialStatus","1");
			prop.setProperty("MaritialStatus","1");
			prop.setProperty("Educationlevel","3");
			prop.setProperty("EmploymentStatus","2");
			prop.setProperty("SocialSecurity","456-456-4567");
			prop.setProperty("PrimaryResidence","1");
			prop.setProperty("MoveClickOption","1");
			prop.setProperty("LicencedYears","3 years or more");
			
			prop.setProperty("InsuranceToday","No");
			prop.setProperty("PreviousInsurance","No");
			prop.setProperty("ProgressiveInsuarnceHistory","No");
			prop.setProperty("EmailAddress","RS@gmail.com");
			prop.setProperty("TotalResidents","5");
			prop.setProperty("CurrentResidence","1");
			prop.setProperty("InjuryClaims","1");
							
			
			
			prop.store(output, "storing to config.properties file");
		
			
			
			
			
						
			
			
			
			
		}catch(Exception e) {
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
	}

}
