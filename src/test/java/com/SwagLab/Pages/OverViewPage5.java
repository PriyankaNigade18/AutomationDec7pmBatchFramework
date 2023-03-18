package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OverViewPage5
{
	private WebDriver driver;
	
	//Initialize Driver
	public  OverViewPage5(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	private By desc=By.xpath("//div[@id='checkout_summary_container']");
	private By finishbtn=By.id("finish");
	private By msg=By.xpath("//h2");		
	
	///Methods
	public void getOverviewOfProduct()
	{
		System.out.println("***********Overview of Product is:***********");
		System.out.println(driver.findElement(desc).getText());
	}
	
	public void doFinish()
	{
		driver.findElement(finishbtn).click();
		System.out.println(driver.findElement(msg).getText());
		Assert.assertTrue(driver.findElement(msg).getText().contains("Thank"));
		
		System.out.println("Process is Completed!");
	}
	
	

}
