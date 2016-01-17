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
		
		ScrBcbHomePage bcbHome = new ScrBcbHomePage();
		ScrBcbGetAQuote getQuote = bcbHome.clickGetQuotes();
		
		getQuote.clickNo();

		getQuote.switchToNewTab();
		
		getQuote.clickGetAQuote();
		
		getQuote.selectYear("2016");
		
		getQuote.enterAdditionalInfolrmation("49749","No","No","12121985", "M", "N");
		
		//getQuote.enterAdditionalInfolrmation(zip, onlyChild, medicare, dob, gender, tobaco);
		
		getQuote.clickDisplayPlans();
		
		
	}

}
