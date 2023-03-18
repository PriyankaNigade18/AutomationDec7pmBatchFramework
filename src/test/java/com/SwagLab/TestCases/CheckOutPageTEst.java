package com.SwagLab.TestCases;

import org.testng.annotations.Test;

public class CheckOutPageTEst extends BaseClass
{
  @Test
  public void verifyCheckout() 
  {
	  cp.doCheckout("Priyanka", "Nigade", "411047");
  }
}
