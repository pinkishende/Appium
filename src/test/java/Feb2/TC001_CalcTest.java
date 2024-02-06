package Feb2;

import org.openqa.selenium.remote.DesiredCapabilities;

public class TC001_CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "12");
		dc.setCapability("deviceName", "Pixel 4 API 31");
		dc.setCapability("udid", "emulator-5554");
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
	}

}
