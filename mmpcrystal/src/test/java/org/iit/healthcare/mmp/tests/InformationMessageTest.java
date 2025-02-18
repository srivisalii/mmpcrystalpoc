package org.iit.healthcare.mmp.tests;
import java.util.HashMap;
import org.h2k.util.BaseClass;
import org.h2k.util.MMPLibrary;
import org.iit.healthcare.mmp.pages.InformationMessagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InformationMessageTest extends BaseClass{

	@Test
	public void validateInformationMsg() 
	{
		MMPLibrary mmpLib = new MMPLibrary(driver);

		mmpLib.launchBrowser(prop.getProperty("patientURL"));
		mmpLib.login(prop.getProperty("patientUsername"),prop.getProperty("patientPassword"));
		mmpLib.navigateToASearchModule("Information");
		InformationMessagePage informationMsgObj = new InformationMessagePage(driver);
		HashMap<String, String> expectedHMap = informationMsgObj.informationPage();
		HashMap<String, String> actualHMap = informationMsgObj.fetchInformationPageData();
		Assert.assertEquals(expectedHMap,actualHMap);
	}



}















