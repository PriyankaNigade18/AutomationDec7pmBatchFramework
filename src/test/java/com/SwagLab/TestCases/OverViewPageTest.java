package com.SwagLab.TestCases;

import org.testng.annotations.Test;

public class OverViewPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyDescription() 
  {
	  op.getOverviewOfProduct();
  }
  
  @Test(priority=2)
  public void verifyFinishProcess() 
  {
	  op.doFinish();
  }
}

