package org.iit.healthcare.mmp.tests;
import java.util.HashMap;
import org.h2k.util.BaseClass;
import org.h2k.util.MMPLibrary;
import org.iit.healthcare.mmp.pages.PayFeePages;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PayFeeTest extends BaseClass{

	@Test
	public void validatePayFeeDetails() 
	{
		MMPLibrary mmpLib = new MMPLibrary(driver);

		mmpLib.launchBrowser(prop.getProperty("adminURL"));
		mmpLib.login(prop.getProperty("adminUsername"),prop.getProperty("adminPassword"));
		mmpLib.navigateToAdminProfileModule("Patients");
		PayFeePages  payfeeObj = new PayFeePages (driver);
		HashMap<String, String> expectedHMap = payfeeObj.payPage();
		mmpLib.launchBrowser(prop.getProperty("patientURL"));
		mmpLib.login(prop.getProperty("patientUsername"),prop.getProperty("patientPassword"));
		mmpLib.navigateToAPayFeeModule("Fees");
		HashMap<String, String> actualHMap = payfeeObj.fetchPayFeePageData();
		Assert.assertEquals(expectedHMap,actualHMap);
	}


}
























