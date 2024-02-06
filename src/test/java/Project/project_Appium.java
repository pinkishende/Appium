package Project;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;

public class project_Appium {
	AndroidDriver driver;
	  @Test (dataProvider ="Test")
	  public void Test(String name) throws InterruptedException, IOException {
		  long timestamp=new Date().getTime();
		  System.out.println("Time is :"+timestamp);

		  POM_File  obj =new POM_File (driver);
		  
		  obj.radiobutton1st();
		  obj.radiobutton2nd();
		  obj.enterfirstname(name);
		  obj.clickonbutton();
		  
		  	String title= driver.getTitle();
			ExtentReports extent = new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter(timestamp+"ProjectAppium.html"); 
			extent.attachReporter(spark);
			ExtentTest test=extent.createTest("Verify the Title of opencart");
			if(title.equals("Register A"))
			{
				test.pass("bitbar title is displyed");
			}
		  else {
			  Thread.sleep(3000);
	          File sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          File dfile = new File("bitbidar.png");
	          FileUtils.copyFile(sfile, dfile);
	          String path = dfile.getAbsolutePath();
	          test.fail("Name Not Displayed"
	                  ,MediaEntityBuilder
	                  .createScreenCaptureFromPath(path)
	                  .build());
		  }
	  }
@BeforeMethod
	  public void beforeMethod() throws MalformedURLException {
		  DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("appium:deviceName", "Medium Phone API 32");
			dc.setCapability("appium:skipServerInstallation","true");
			dc.setCapability("appium:noReset", "true");
			dc.setCapability("appium:platformVersion","12.0");
			dc.setCapability("appium:app","‪‪C:\\Users\\pinki.shende\\Downloads\\bitbar-sample-app.apk");	
			
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");  // go to on appium server;
			driver= new AndroidDriver(url, dc);	
			
	  }

 @AfterMethod
 public void afterMethod() 
 {
	 System.out.println("This is after method");
 }

 @DataProvider
	 public Object[][] Test() {
	    return new Object[][] {
	     new Object[] {"Romali"},
	      
	    };
	  }
	}
