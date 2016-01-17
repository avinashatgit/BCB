package com.hcentive.automation.assessment.screens;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.hcentive.automation.commonutils.GenericUtils;
import com.hcentive.automation.commonutils.WaitUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BasePage {
	
	//private int timeOutInSeconds = 30;
	protected static WebDriver driver;
	
	
	public static void initBrowser(String param) throws MalformedURLException{
		
		//driver = new FirefoxDriver();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		caps.setBrowserName("Firefox");
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/ed/hub"),caps);	
		
		
		
//		if (param.equalsIgnoreCase("chrome"))
//		{		
//		// Optional, if not specified, WebDriver will search your path for chromedriver.
//		  System.setProperty("webdriver.chrome.driver", "C:/Users/test3/Desktop/jars/chromedriver.exe");
//		  driver = new ChromeDriver();
//		}
//		else if(param.equalsIgnoreCase("firefox")){
//			
//			 driver = new FirefoxDriver();
//			
//		}
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	
	public static void initLocalBrowser(String param) throws MalformedURLException{
		

		
		
		if (param.equalsIgnoreCase("chrome"))
		{		
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if(param.equalsIgnoreCase("firefox")){
			
			 driver = new FirefoxDriver();
			
		}
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	public static void openApplication(){
		driver.get(GenericUtils.getPropertyValue("appURL"));
	}

	public void validateAndClickByLocator(String elementIdentifier, By locator) {
		int timeOutInSeconds = 30 ;
		WebElement element = WaitUtils.waitForElement(driver, locator, timeOutInSeconds);
		
		if (element != null){
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
			 wait.until(ExpectedConditions.elementToBeClickable(locator));
			
			 element.click();
			 Reporter.log("clicked on " + elementIdentifier + " by locator " + locator );
		}
		else
		{
			Reporter.log("unable to find " + elementIdentifier + " by locator " + locator );
		}
		
	}
	
	public void validateAndSendKeys(String elementIdentifier, By locator, String value) throws Exception {
		int timeOutInSeconds = 30 ;
		WebElement element = WaitUtils.waitForElement(driver, locator, timeOutInSeconds);
		
		if (element != null){
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
			 wait.until(ExpectedConditions.elementToBeClickable(locator));
			
			 element.sendKeys(value);
			 Reporter.log("entered "+ value +" on " + elementIdentifier + " by locator " + locator );
		}
		else
		{
			 Reporter.log("entered "+ value +" on " + elementIdentifier + " by locator " + locator );
			 throw new Exception( "unable to find element ");
		}
		
	}

}
