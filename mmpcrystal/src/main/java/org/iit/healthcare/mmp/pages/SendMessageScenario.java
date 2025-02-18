package org.iit.healthcare.mmp.pages;

import java.time.Duration;
import java.util.HashMap;

import org.h2k.util.AppLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendMessageScenario {
	
	
	protected WebDriver driver ;
	private By contactReasonXpath = By.xpath("//input[@id='subject']");
	private By subjectXpath = By.xpath("(//textarea[@id='message'])[1]");
	private By nameXpath = By.xpath("//input[@id='fname']");
	//private By subjectXpath = By.xpath("(//textarea[@id='message'])[1]");
	
	
	public SendMessageScenario(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public HashMap<String, String> sendMessage(String expectedReason, String expectedSubject)
	{
		HashMap<String,String> expectedHMap = new HashMap<String,String>();
		
		
		WebElement contactReasonWE = driver.findElement(contactReasonXpath);
        //String expectedCReason=AppLibrary.generateRandString("QAAUT");
		contactReasonWE.sendKeys(expectedReason);
		expectedHMap.put("conreason",contactReasonWE.getAttribute("value"));
		
		
		WebElement subjectWE = driver.findElement(subjectXpath);
        //String expectedSubject=AppLibrary.generateRandString("QAAUT");
        subjectWE.sendKeys(expectedSubject);
        expectedHMap.put("subject",subjectWE.getAttribute("value"));
	    
        WebElement nameWE = driver.findElement(nameXpath);
        //String expectedCReason=AppLibrary.generateRandString("QAAUT");
		nameWE.getText();
		expectedHMap.put("name",nameWE.getAttribute("value"));
		
		
		expectedHMap.put("date",AppLibrary.getFutureDate("dd-MM-MY", 0));
		driver.findElement(By.xpath("(//input[@value='Send'])")).click();
		driver.switchTo().alert().accept();
		System.out.println("expectedHMap ::" + expectedHMap);
		
		return expectedHMap;
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
