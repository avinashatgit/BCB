package com.hcentive.automation.assessment.screenobjects;

import org.openqa.selenium.By;

public class ObjBcbHomePage {
	
	private By lnkGetQuote=By.xpath("//*[@id='contentNav']//a[text()=' Get a Quote']" );

	public  By getLnkGetQuote( ) {
		return lnkGetQuote;
	}

	

}
