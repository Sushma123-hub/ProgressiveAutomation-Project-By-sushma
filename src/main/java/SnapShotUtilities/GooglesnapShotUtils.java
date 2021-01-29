package SnapShotUtilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GooglesnapShotUtils {
public void takeSnapShot(WebDriver driver, String screenShotName) {
		
		try {
			
			// Creating a file object to take a screensshot
			 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			 
			 // Store source file in a new file "Screenshot"
			 
			 FileUtils.copyFile(src, new File(".\\SnapShot\\" + screenShotName + ".Jpeg"));
			
			 
			 Thread.sleep(2000);
			 
			 System.out.println("Google TestNg ScreenShot was taken!");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}



