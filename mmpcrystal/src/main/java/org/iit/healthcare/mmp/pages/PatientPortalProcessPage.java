package org.iit.healthcare.mmp.pages;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.h2k.util.AppLibrary;



public class PatientPortalProcessPage {

	protected WebDriver driver ;
	private By firstNameXpath = By.xpath("//input[@id='firstname']");
	private By lastNameXpath = By.xpath("//input[@id='lastname']");
	private By dateOfBirthXpath = By.xpath("//input[@id='datepicker']");
	private By licenseXpath = By.xpath("(//input[@id='license'])[1]");
	private By ssnXpath = By.xpath("//input[@id='ssn']");
	private By stateXpath = By.xpath("//input[@id='state']");
	private By cityXpath = By.xpath("//input[@id='city']");
	private By addressXpath = By.xpath("(//input[@id='address'])[1]");
	private By zipcodeXpath = By.xpath("(//input[@id='zipcode'])[1]");
    private By ageXpath = By.xpath("//input[@id='age']");
    private By heightXpath = By.xpath("(//input[@id='height'])[1]");
    private By weightXpath = By.xpath("(//input[@id='weight'])[1]");
    private By emailXpath = By.xpath("(//input[@id='email'])[1]");
    private By userNameXpath = By.xpath("(//input[@id='username'])[1]");
    private By passwordXpath = By.xpath("(//input[@id='password'])[1]");
    private By conformPWDXpath=By.xpath("(//input[@id='confirmpassword'])[1]");
    private By securityXpath=By.xpath("(//select[@id='security'])[1]");
    private By answerXpath=By.xpath("(//input[@id='answer'])[1]");
    private By submitXpath=By.xpath("(//input[@name='register'])[1]");
	
	
    public PatientPortalProcessPage(WebDriver driver) {
		this.driver = driver;
		
     }
	
	
	public void registerPage()
	{
		
		
		
		
		WebElement firstNameWE=driver.findElement(firstNameXpath);
	    String expectedFName=AppLibrary.generateRandString("QAAUT");
		firstNameWE.sendKeys(expectedFName);
		
		
		WebElement lastNameWE=driver.findElement(lastNameXpath);
		String lastName=AppLibrary.generateRandString("Sha");
		lastNameWE.sendKeys(lastName);
		
		
		WebElement dateWE=driver.findElement(dateOfBirthXpath);
		String date=AppLibrary.getFutureDate("MM/dd/yyyy",0) +"";
		dateWE.sendKeys(date);
		
		
		WebElement lisenceWE=driver.findElement(licenseXpath);
		String lisence=AppLibrary.generateRandInlicense();
		lisenceWE.sendKeys(lisence);
		
		
		WebElement ssnWE=driver.findElement(ssnXpath);
		String ssn=AppLibrary.generateRandInSsn();
		ssnWE.sendKeys(ssn);
		
		
		WebElement stateWE=driver.findElement(stateXpath);
		String state=AppLibrary.generateRandomCityState();
		String[] splitvalues=state.split("\\|");
		String citys = splitvalues[0];
		String states = splitvalues[1];
		stateWE.sendKeys(states);
		
		
		WebElement cityWE=driver.findElement(cityXpath);
		cityWE.sendKeys(citys);
		
		
		WebElement addressWE=driver.findElement(addressXpath);
		String address=AppLibrary.generateRandInaddress("abcde");
		addressWE.sendKeys(address);
		
		
		WebElement zipcodeWE=driver.findElement(zipcodeXpath);
		String zipcode=AppLibrary.generateRandIntZip()+"";
		zipcodeWE.sendKeys(zipcode);
		
		
		WebElement ageWE=driver.findElement(ageXpath);
		String age=AppLibrary.generateRandInteger()+"";
		ageWE.sendKeys(age);
		
		
		WebElement heightWE=driver.findElement(heightXpath);
		String height=AppLibrary.generateRandInheight()+"";
		heightWE.sendKeys(height);
		
		
		WebElement weightWE=driver.findElement(weightXpath);
		String weight=AppLibrary.generateRandInweight()+"";
		weightWE.sendKeys(weight);
		
		WebElement emailWE=driver.findElement(emailXpath);
		String email=AppLibrary.generateRandInEmail("abc");
		emailWE.sendKeys(email);
		
		
		WebElement userWE=driver.findElement(userNameXpath);
		String user=AppLibrary.generateRandString("au");
		userWE.sendKeys(user);
		
		
		WebElement pwdWE=driver.findElement(passwordXpath);
		String pwd=AppLibrary.generateRandPwd("ABcd");
		pwdWE.sendKeys(pwd);
		
		
		WebElement conformpwdWE=driver.findElement(conformPWDXpath);
		
		conformpwdWE.sendKeys(pwd);
		
		WebElement answerWE=driver.findElement(answerXpath);
		String answer=AppLibrary.generateRandString("Dog");
		answerWE.sendKeys(answer);
		
        Select securitySelect = new Select(driver.findElement(securityXpath));
		securitySelect.selectByVisibleText("what is your pet name");
		//expectedHMap.put("security",securitySelect.getFirstSelectedOption().getText());
		WebElement buttonWE = driver.findElement(submitXpath);
		buttonWE.click();
		
		WebDriverWait waitSwitch = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitSwitch.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
	
		
	}
	
	
}






