package com.hcentive.automation.assessment.screens;

import java.util.ArrayList;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hcentive.automation.assessment.screenobjects.ObjBcbGetAQuote;
import com.hcentive.automation.assessment.screenobjects.ObjBcbHomePage;
import com.hcentive.automation.commonutils.WaitUtils;

public class ScrBcbGetAQuote extends BasePage {
	ObjBcbGetAQuote scrBcbGetAQuote = new ObjBcbGetAQuote();

	public ScrBcbGetAQuote() {
		super();

	}

	
	public ScrBcbGetAQuote clickNo(){
		
		WebElement feedbackPopup = WaitUtils.waitForElement(
										driver, scrBcbGetAQuote.getLnkFsrFloatingContainer(), 10);
		
		
		if (feedbackPopup != null)
		{
			
			driver.findElement(By.cssSelector("a.fsrCloseBtn")).click();
			
			super.validateAndClickByLocator("Link Get Quote", scrBcbGetAQuote.getlnkNo());
		}
		else{
			
			super.validateAndClickByLocator("Link Get Quote", scrBcbGetAQuote.getlnkNo());
		}
		
		return this;
		
	}

	public void switchToNewTab() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		//driver.switchTo().window(tabs2.get(0));
		
		System.out.println("Switched to Window" + driver.getTitle());
		driver.switchTo().window(tabs2.get(1));
	}
	
	public void  clickGetAQuote(){
		super.validateAndClickByLocator("Link Gets Quote", scrBcbGetAQuote.getLnkGetAQuote());
	}



	public void selectYear(String string) {
		
		super.validateAndClickByLocator("Year", scrBcbGetAQuote.getRdoYear());
		super.validateAndClickByLocator("Continue ", scrBcbGetAQuote.getLnkNext());
		
	}


	public void enterAdditionalInfolrmation(String enterZip, String onlychild,
			String eligibleForMedicare, String dob, String gender, String tobaccouser) throws Exception {
		
		enterZip(enterZip);
		selectOnlyChlid(onlychild);
		selectEligibleForMedicare(eligibleForMedicare);
		selectDob(dob);
		selectGender(gender);
		selectTobaccouser(tobaccouser);
		
		
	}
	
	private void selectTobaccouser(String tobaccouser) {
		WebElement element=driver.findElement(scrBcbGetAQuote.getRdopopprimarysmoker());
		
		Select se=new Select(element);
		
		se.selectByValue(tobaccouser);
		
	}


	private void selectGender(String gender) {
		
		WebElement element=driver.findElement(scrBcbGetAQuote.getRdopopprimarygender());
		
		Select se=new Select(element);
		
		se.selectByValue(gender);
	}


	private void selectDob(String dob) throws Exception {
		
		super.validateAndSendKeys("DOB",scrBcbGetAQuote.getRdopopprimarydob() , dob);
	}


	private void selectEligibleForMedicare(String eligibleForMedicare) {
		if (eligibleForMedicare.equalsIgnoreCase("No")){
			super.validateAndClickByLocator("Medicar",scrBcbGetAQuote.getRdomedicareNo() );
		}
		else
		{
			
		}
		
	}


	private void selectOnlyChlid(String onlychild) {
		
		if (onlychild.equalsIgnoreCase("No")){
			super.validateAndClickByLocator("onlychild",scrBcbGetAQuote.getRdochildOnlyNo() );
		}
		else
		{
			
		}
		
	}


	private void enterZip(String zip) throws Exception{
		super.validateAndSendKeys("Zip",scrBcbGetAQuote.getEdtZip() , zip);
	}


	public void clickDisplayPlans() {
		// TODO Auto-generated method stub
		super.validateAndClickByLocator("onlychild",scrBcbGetAQuote.getRdodisPlayPlans() );
		
		
	}
	

}
