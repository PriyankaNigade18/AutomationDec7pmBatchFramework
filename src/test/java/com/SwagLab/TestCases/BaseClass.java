package com.SwagLab.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.SwagLab.Pages.*;
import com.SwagLab.Utility.ReadFile;

public class BaseClass
{
	//Annotations
	
	
	public WebDriver driver;
	public LoginPage1 lp;
	public InventoryPage2 ip;
	public AddToCartPage3  ap;
	public CheckOutPage4 cp;
	public OverViewPage5 op;
	public ReadFile rf;
	
	@BeforeTest
	public void projectSetUp()
	{
		rf=new ReadFile();
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		lp=new LoginPage1(driver);
		ip=new InventoryPage2(driver);
		ap=new AddToCartPage3(driver);
		cp=new CheckOutPage4(driver);
		op=new OverViewPage5(driver);
		
		
		
	}
	
	
	
	@BeforeClass
	public void pageSetUp()
	{
		System.out.println("Application Launch ......");
		waitTest();
		lp.getAppTitle();
		lp.doLogin(ReadFile.getData("un"),ReadFile.getData("psw"));
		waitTest();
		System.out.println("***********Inventory Page Open************");
		waitTest();
		ip.getProductCount();
		ip.getProductList();
		ip.selectProductforCart(ReadFile.getData("pname"));
		waitTest();
		System.out.println("***********Add To cart Page Open************");
		waitTest();
		ap.getDescriptionOfProduct();
		ap.selectCheckout();
		waitTest();
		System.out.println("***********Checkout Page Open************");
		cp.doCheckout(ReadFile.getData("fname"),ReadFile.getData("lname"),ReadFile.getData("zcode"));
		waitTest();
		System.out.println("***********OverView Page Open************");

		
		
		
	}
	
	
	public void waitTest()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void teardown()
	{
		
	}

}
