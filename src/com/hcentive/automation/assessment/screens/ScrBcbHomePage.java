package com.hcentive.automation.assessment.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hcentive.automation.assessment.screenobjects.ObjBcbHomePage;
import com.hcentive.automation.commonutils.WaitUtils;

public class ScrBcbHomePage extends BasePage {
	ObjBcbHomePage scrBcbHomePage = new ObjBcbHomePage();

	public ScrBcbHomePage() {
		super();

	}

	public ScrBcbGetAQuote clickGetQuotes() {

		super.validateAndClickByLocator("Link Get Quote", scrBcbHomePage.getLnkGetQuote());
		return new ScrBcbGetAQuote();

	}
	
	

	public void switchToNewTab() {
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		driver.switchTo().window(window1);
		System.out.println("Switched to Window");
		

		
	}
}
