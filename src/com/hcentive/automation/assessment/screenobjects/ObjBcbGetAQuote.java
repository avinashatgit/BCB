package com.hcentive.automation.assessment.screenobjects;

import org.openqa.selenium.By;

public class ObjBcbGetAQuote {
	
	
	private By lnkNo =By.cssSelector("a[class='gq2_col gq2_no internal']") ;
	
	private By lnkFsrFloatingContainer	=By.cssSelector("p.fsrHeading") ;
	
	private By lnkGetAQuote	= By.cssSelector("#optionButtons>div>a>img");
	
	private By lnkNext	= By.cssSelector("a.buttonNext");
	
	
	private By rdoYear	= By.cssSelector("input#PlanYearSelection_planYearTypeInsurancePlan2016");
	
	private By edtZip	= By.cssSelector("#popzipcode");
	
	private By rdochildOnlyNo	= By.cssSelector("#childOnlyNo");
	
	private By rdomedicareNo	= By.cssSelector("#medicareNo");
	
	private By rdopopprimarydob	= By.cssSelector("#popprimarydob");

	private By rdopopprimarygender	= By.cssSelector("#popprimarygender");
	
	private By rdopopprimarysmoker	= By.cssSelector("#popprimarysmoker");
	
	private By rdobtnDisplayPlans	= By.cssSelector("#btnPrimary");
	



	
	public  By getlnkNo() {
		return lnkNo;
	}


	public By getLnkFsrFloatingContainer() {
		return lnkFsrFloatingContainer;
	}


	public By getLnkGetAQuote() {
		return lnkGetAQuote;
	}


	public By getLnkNext() {
		return lnkNext;
	}



	public By getRdoYear() {
		return rdoYear;
	}




	public By getEdtZip() {
		return edtZip;
	}





	public By getRdochildOnlyNo() {
		return rdochildOnlyNo;
	}




	public By getRdomedicareNo() {
		return rdomedicareNo;
	}




	public By getRdopopprimarydob() {
		return rdopopprimarydob;
	}





	public By getRdopopprimarygender() {
		return rdopopprimarygender;
	}





	public By getRdopopprimarysmoker() {
		return rdopopprimarysmoker;
	}




	public By getRdodisPlayPlans() {
		return rdobtnDisplayPlans;
	}





	
	
	
	

}
