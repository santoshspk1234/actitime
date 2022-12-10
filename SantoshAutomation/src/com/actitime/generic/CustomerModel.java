package com.actitime.generic;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModel extends BaseClass{

	@Test
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	//	Assert.fail();
	}
}
