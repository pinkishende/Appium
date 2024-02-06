package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_File {
	

	WebDriver driver;
	By radiobutton1 = By.id("com.bitbar.testdroid:id/radio0");
	By radiobutton2 = By.id("com.bitbar.testdroid:id/radio1");
	By Entername = By.id("com.bitbar.testdroid:id/editText1");
	By button = By.id("com.bitbar.testdroid:id/button1");
	

	public POM_File (WebDriver driver2) {
		this.driver=driver2;
	}
//1
	public void radiobutton1st() {
		driver.findElement(radiobutton1).click();
	}
//2
	public void radiobutton2nd() 
	{
		WebElement we =	driver.findElement(radiobutton2);
		we.click();
		boolean isenable = we.isEnabled();
		if(isenable)
		{
			System.out.println("It is Enabled properly");
		}else
		{
			System.out.println("It is not Enabled ");
		}
	}

public void enterfirstname(String firstname)
{
		driver.findElement(Entername).sendKeys(firstname);
}
	
//button
	public void clickonbutton() 
	{
		driver.findElement(button).click();
	}	
}

