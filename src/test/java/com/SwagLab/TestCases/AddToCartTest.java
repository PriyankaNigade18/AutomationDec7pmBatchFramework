package com.SwagLab.TestCases;

import org.testng.annotations.Test;

public class AddToCartTest extends BaseClass
{
  @Test(priority=1)
  public void verifyDescription()
  {
	  ap.getDescriptionOfProduct();
  }
  
  
  
  @Test(priority=2)
  public void proceedWithCheckout()
  {
	  ap.selectCheckout();
  }
}
