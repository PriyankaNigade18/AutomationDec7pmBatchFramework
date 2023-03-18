package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage3 
{
	
	private WebDriver driver;
	
	//Initialize driver
	public AddToCartPage3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	private By desc=By.xpath("//div[@class='cart_item_label']");
	private By checkbtn=By.xpath("//button[text()='Checkout']");
	
	
	//methods
	public void getDescriptionOfProduct()
	{
		String des=driver.findElement(desc).getText();
		System.out.println("********product Description is:********");
		
		System.out.println(des);
	}
	
	
	public void selectCheckout()
	{
	driver.findElement(checkbtn).click();	
	}
			
	
	
	
	
	
	
	
	

}
