package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage4
{
	private WebDriver driver;
	//Initialize Driver
	
	public CheckOutPage4(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	private By firstname=By.name("firstName");
	private By lastname=By.name("lastName");
	private By zipcode=By.id("postal-code");	
	private By conbtn=By.id("continue");
	
	
	
	
	//Methods
	public void doCheckout(String fname,String lname,String zcode)
	{
		System.out.println("User Enters details.....");
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zcode);
		System.out.println("User details are Proceed....");
		driver.findElement(conbtn).click();
	}
	

}
