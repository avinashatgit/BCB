package com.hcentive.automation.assessment.tests;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.hcentive.automation.assessment.screens.ScrBcbGetAQuote;
import com.hcentive.automation.assessment.screens.ScrBcbHomePage;
import com.hcentive.automation.assessment.tests.TestBase;

public class RegressionSuite extends TestBase{
	
	final static Logger logger = Logger.getLogger(RegressionSuite.class);

	
	@Test(description = "Enter the names, and verify that they are appearing correctly )")
	public void AutTC01() throws Exception{
		
		logger.debug("This is debug : " );
		
		//login to bcb home page		
		ScrBcbHomePage bcbHome = new ScrBcbHomePage();
		
		//click on get Quote
		ScrBcbGetAQuote getQuote = bcbHome.clickGetQuotes();
		
		//click no
		getQuote.clickNo();

		//click to tab
		getQuote.switchToNewTab();
		
		//click get a quote
		getQuote.clickGetAQuote();
		
		//getQuote.selectYear("2016");
		
		getQuote.enterAdditionalInfolrmation("49749","No","No","12121985", "M", "N");
		
		//getQuote.enterAdditionalInfolrmation(zip, onlyChild, medicare, dob, gender, tobaco);
		
		getQuote.clickDisplayPlans();
		
		
	}

}
