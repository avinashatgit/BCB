package com.hcentive.automation.assessment.tests;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.hcentive.automation.assessment.screens.BasePage;
import com.hcentive.automation.assessment.screens.ScrBcbHomePage;
import com.hcentive.automation.commonutils.GenericUtils;


public class TestBase {
	

	protected String baseUrl = "";
	

	//String browser
	@BeforeSuite
	public void setUpTestSuite() throws Exception {
	   
		

	 }
	
	@BeforeTest
	@Parameters({"browser"})
	public void setupTest(String browser) throws MalformedURLException{
		
		
		
		//setup driver instance
		
		BasePage.initSauceLabBrowser();
		
		
//		BasePage.initBrowser(browser);
		
		//BasePage.initLocalBrowser(browser);
		
		
		
		//launch application
		BasePage.openApplication();
		
	}
	 
	@AfterTest
	public void tearDownTest()
	{
		BasePage.closeDriver();
	}
	
	@AfterSuite
	public void tearDownTestSuite(){
		BasePage.quitDriver();
	}
	
	@DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[1][1];
	
	ArrayList<HashMap<String, String>> arrMap = new ArrayList<HashMap<String, String>>();
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("zip", "49749");
	map.put("onlychild", "No");
	map.put("mediclaim", "No");
	map.put("dob", "01/01/1985");
	map.put("gender", "M");
	map.put("tobaco", "N");

	// 1st row
	data[0][0] =arrMap;


	return data;
	}

}
