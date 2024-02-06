package Feb1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Appium {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//public static void main(String[] args) throws MalformedURLException {
			
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platforName", "Android");
		dc.setCapability("deviceName", "Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation", "true");
		dc.setCapability("appium:noReset", "true");
		dc.setCapability("appium:platformVersion", "12.0");
		dc.setCapability("app", "C:\\Users\\pinki.shende\\Downloads\\example (1).apk");

		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);

	}
}


