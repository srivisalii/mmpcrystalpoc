package org.iit.healthcare.mmp.tests;

import java.io.FileNotFoundException;
import java.util.HashMap;
import org.h2k.util.BaseClass;
import org.h2k.util.MMPLibrary;
import org.iit.healthcare.mmp.pages.SearchSymptomsPage;
import org.testng.Assert;
import org.testng.annotations.Test;



	public class SearchSymptomsTest extends BaseClass{

		@Test
		public void validateSearchSymptoms() throws FileNotFoundException, InterruptedException
		{
			MMPLibrary mmpLib = new MMPLibrary(driver);

			mmpLib.launchBrowser(prop.getProperty("patientURL"));
			mmpLib.login(prop.getProperty("patientUsername"),prop.getProperty("patientPassword"));
			mmpLib.navigateToASearchModule("Search Symptoms");
			SearchSymptomsPage searchSymObj = new SearchSymptomsPage (driver);
			HashMap<String, String> expectedHMap = searchSymObj.symptomsPage();
			HashMap<String, String> actualHMap = searchSymObj.fetchsymptomsPageData();
			Assert.assertEquals(expectedHMap,actualHMap);
		}



	}




