package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class InventoryPage2
{
	private WebDriver driver;
	
	//Initialize driver
	public InventoryPage2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	
	private By productList=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']");
	private By addtocartbtn=By.xpath("//button[text()='Add to cart']");
	private By cartOption=By.xpath("//a[@class='shopping_cart_link']");
	//Methods
	public void getProductCount()
	{
		int count=driver.findElements(productList).size();
		System.out.println("Total Product are: "+count);
		
		Assert.assertEquals(count,6);
		System.out.println("Count is valid count of Product!");
	}
	
	public void getProductList()
	{
		System.out.println("**********Product list is below:************");
		List<WebElement> list1=driver.findElements(productList);
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
	}
	
	
	public void selectProductforCart(String pname)
	{
		List<WebElement> list1=driver.findElements(productList);
		
		for(WebElement i:list1)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(addtocartbtn).click();
		driver.findElement(cartOption).click();
		
	}
	
	
	
	
	
	
}
