package org.iit.healthcare.mmp.tests;



	import java.time.Duration;
import java.util.HashMap;

import org.h2k.util.AppLibrary;
import org.h2k.util.BaseClass;
	import org.h2k.util.MMPLibrary;
import org.iit.healthcare.mmp.pages.AdminMessagesPage;
import org.iit.healthcare.mmp.pages.EditProfilePage;
import org.iit.healthcare.mmp.pages.SendMessageScenario;
	import org.testng.Assert;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
	
		
	public class SendMessageTest extends BaseClass{

		@Parameters({"contactreason","subject"})
		@Test
		public void validateSendMessage() throws InterruptedException
		{
			MMPLibrary mmpLib = new MMPLibrary(driver);
			mmpLib.launchBrowser(prop.getProperty("patientURL"));
			mmpLib. login(prop.getProperty("patientUserName"), prop.getProperty("patientPassword"));
			mmpLib. navigateToAPatientModule("Profile");
			EditProfilePage profilePage = new EditProfilePage(driver);
			String expectedpatientName= profilePage.editAllFields(); 
			mmpLib. navigateToAMessageModule("Messages");
			SendMessageScenario messagePage = new SendMessageScenario(driver);
			String expectedReason= "Monthly Visit";
			String expectedSubject="Having cold and headache";
			String expectedDate= AppLibrary.getFutureDate("dd-MM-MY",0);
			HashMap<String, String> actualMsg = messagePage.sendMessage(expectedReason, expectedSubject);
			System.out.println("success Msg:::"+ actualMsg);
			mmpLib.launchBrowser(prop.getProperty("adminURL"));
			mmpLib.login(prop.getProperty ("adminUserName"), prop.getProperty ("adminPassword")) ;
			mmpLib. navigateToAMessageModule("Messages");
			AdminMessagesPage messagesPage = new AdminMessagesPage(driver);
			String outputMsg = messagesPage.readMessages;
	     	String outputMsg1 = patientName+"$"+reason+"$"+date+"$"+subject;
			String actualpatientName= outputMsg1.split("//$")[0];
			String actualReason=outputMsg1-split("//$")[1];
			String actualDate= outputMsg1.split("//$")[2];
			String actualSubject=outputMsg1-split("//$")[3];
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(actualpatientName, expectedpatientName); 
			sa.assertEquals(actualReason, expectedReason); 
			sa.assertEquals(actualDate, expectedDate) ; sa.assertEquals(actualSubject,expectedSubject);
			
			sa.assertAll();
			
			
			//Assert.assertTrue(expectedHMap.equals(actualHMap));
		}
		 
		 
		 

	}
	
	
	