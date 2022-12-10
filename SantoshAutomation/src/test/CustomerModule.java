package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule extends BaseClass
{

	@Test(priority = 1, invocationCount = 3)
	public void createCustomer() {
		Reporter.log("Create customer",true);
	}
	@Test(priority =2, dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Reporter.log("Modify Customer",true);
	}
	@Test(priority =3, dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("Delete Customer",true);
	}
}
//@Test(invocationCount = 2)
//public void createCustomer() {
//	Reporter.log("CreateCustomer",true);
//}
//@Test(dependsOnMethods = "createCustomer")
//public void editCustomer() {
//	Reporter.log("editCustomer",true);
//}
//@Test(priority = 1, dependsOnMethods = "createCustomer")
//public void deleteCustomer() {
//	Reporter.log("deleteCustomer",true);
//}