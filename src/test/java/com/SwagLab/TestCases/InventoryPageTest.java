package com.SwagLab.TestCases;

import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifProductCount() 
  {
	  ip.getProductCount();
  }
  
  @Test(priority=2)
  public void verifProductList() 
  {
	  ip.getProductList();
  }
  
  

  @Test(priority=3)
  public void verifProductSelected() 
  {
	  ip.selectProductforCart("Sauce Labs Bolt T-Shirt");
  }
}
