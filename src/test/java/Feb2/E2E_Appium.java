package Feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class E2E_Appium {
	AndroidDriver driver;
  @Test(dataProvider = "dp")
  public void f(String name) throws Exception {
	  driver.findElement(By.id("at.markushi.reveal:id/btn_1")).click();
  /*
	  if(isdisplayed)
	  
	  {
		  System.out.println("Passed");
	  }
	  else
	  {
		System.out.println("Error");  
	  }*/
  }
  @BeforeMethod
  public void beforeMethod() {
	  DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "12");
		dc.setCapability("deviceName", "Pixel 4 API 31");
		dc.setCapability("udid", "emulator-5554");
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ABC" },
    
    };
  }
}
