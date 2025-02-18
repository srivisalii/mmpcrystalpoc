package org.iit.healthcare.mmp.pages;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationMessagePage {

	protected WebDriver driver ;
	private By informationMsgXpath = By.xpath("//div[@class='panel-title']");
	
	
	public InformationMessagePage(WebDriver driver) {
		this.driver = driver;
		
	}
	public HashMap<String, String> informationPage()
	{
		HashMap<String,String> expectedHMap = new HashMap<String,String>();
		WebElement messageWE = driver.findElement(informationMsgXpath);
		messageWE.getText();
		expectedHMap.put("message",messageWE.getText());
		System.out.println("expectedHMap ::" + expectedHMap);
		return expectedHMap;
	}
	public HashMap<String,String> fetchInformationPageData() 
	{
			HashMap<String,String> actualHMap = new HashMap<String,String>();
			
			
			actualHMap.put("message",driver.findElement(By.xpath("//div[@class='panel-title']")).getText());
		    System.out.println("actualHMap ::::" + actualHMap);
		    return actualHMap;
			
			
			 
	}
	
	
}





