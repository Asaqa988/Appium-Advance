import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyClass {
	
	DesiredCapabilities caps = new DesiredCapabilities(); 
	
	AndroidDriver driver ; 
	
	@BeforeTest
	public void mySetup() {
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "qa");
		
		
		
		// this is only when we need to use mobile browser 
//		caps.setCapability("chromedriverExecutable", "D:\\chromeWebDriver\\chromedriver.exe");
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
		
		// this is only when we need to use mobile App
		
		File CalculatorApp = new File("src/MyApplications/calculator.apk"); 
		caps.setCapability(MobileCapabilityType.APP, CalculatorApp.getAbsolutePath());
	}
	
	
//	@Test()
//	public void OpenoneBrowserAndUseGoogle() throws MalformedURLException {
//		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps); 
//		
//		driver.get("https://www.google.com"); 
//		
//		driver.findElement(By.id("XSqSsc")).sendKeys("linkedin"+Keys.ENTER);
//		
//	}
	
	
	@Test()
	
	public void TestTheCalculatorApp() throws MalformedURLException {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps); 

		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click(); 
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click(); 
		driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();


	}
	
	@AfterTest
	public void postTesting(){}

}
