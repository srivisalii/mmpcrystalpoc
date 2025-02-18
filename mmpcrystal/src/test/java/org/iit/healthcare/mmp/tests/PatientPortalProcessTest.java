package org.iit.healthcare.mmp.tests;

import java.util.HashMap;

import org.h2k.util.BaseClass;
import org.h2k.util.MMPLibrary;
import org.iit.healthcare.mmp.pages.PatientPortalProcessPage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test

public class PatientPortalProcessTest extends BaseClass{

	public void validateRegisterDetails() 
	{
		MMPLibrary mmpLib = new MMPLibrary(driver);

		mmpLib.launchBrowser(prop.getProperty("patientURL"));
		mmpLib.navigateToARegister();
		
		PatientPortalProcessPage  registerObj = new PatientPortalProcessPage(driver);
	    registerObj.registerPage();
		
		
		//HashMap<String, String> actualHMap = payfeeObj.fetchPayFeePageData();
		//Assert.assertEquals(expectedHMap,actualHMap);
	}

}
