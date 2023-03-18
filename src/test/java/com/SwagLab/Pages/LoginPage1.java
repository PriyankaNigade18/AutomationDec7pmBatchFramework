package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage1 
{ 
	private WebDriver driver;
	
	//To initialize driver
	public LoginPage1(WebDriver driver)//BAse class
	{
		this.driver=driver;
	}
	
	
	
	//Identification+Action=Encapsulation
	
	//By locator
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By button=By.name("login-button");
	
	
	//Public Action 
	
	public void getAppTitle()
	{
		String act=driver.getTitle();
		Assert.assertTrue(act.contains("Labs"));
		System.out.println("Title is matched!..."+act);
		
	}
	
	
	
	
	public void doLogin(String un,String psw)
	{
		System.out.println("User enters username and password");
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(button).click();
		System.out.println("User Login process is completed!");
		
	}

}
