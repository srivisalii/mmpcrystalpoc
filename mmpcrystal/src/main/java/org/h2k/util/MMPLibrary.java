package org.h2k.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MMPLibrary {
	
	WebDriver driver ;
	public MMPLibrary(WebDriver driver) {
		this.driver = driver;
	}
	public void navigateToAPatientModule(String moduleName)
	{
		driver.findElement(By.xpath("//span[normalize-space() = '"+moduleName+"']")).click();
	}
	public void navigateToAMessageModule(String moduleName)
	{
		driver.findElement(By.xpath("//span[normalize-space() = '"+moduleName+"']")).click();
	}
	public void navigateToAMessagesModule()
	{
		driver.findElement(By.xpath("//a[@href='messages.php']")).click();
	}
	public void navigateToASearchModule(String moduleName)
	{
		driver.findElement(By.xpath("//span[normalize-space() = '"+moduleName+"']")).click();
	}
	public void navigateToAInformationModule(String moduleName)
	{
		driver.findElement(By.xpath("//span[normalize-space() = '"+moduleName+"']")).click();
	}
	public void navigateToAPayFeeModule(String moduleName)
	{
		driver.findElement(By.xpath("//span[normalize-space() = '"+moduleName+"']")).click();
	}
	
	public void navigateToAdminProfileModule(String moduleName)
	{
		driver.findElement(By.xpath("//span[normalize-space() = '"+moduleName+"']")).click();
	}
	public void navigateToARegister() {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}
	
	
	public void login(String username,String password)
	{
		
		driver.findElement(By.id("username")).sendKeys(username+"");
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();

	}
	public void launchBrowser(String url )
	{
		driver.manage().window().maximize();
		driver.get(url);

	}
	
	//span[normalize-space()='Search Symptoms']
}

