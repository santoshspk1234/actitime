package src.medibuddy.testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import src.medibuddy.generic.BaseClass;
import src.medibuddy.pom.HomePage;
import src.medibuddy.pom.TaskPage;

@Listeners(src.medibuddy.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	
	@Test
	public void testCreateCustomer() throws InterruptedException {
		Reporter.log("CreateCustomer",true);
		
		HomePage h=new HomePage(driver);
		h.setTasktab();
		
		TaskPage t=new TaskPage(driver);
		t.setAddNew();
		t.setNewCust();
		t.setCustDetails();
				
		Thread.sleep(5000);
		String actual = t.getCreatedCustomer().getText();
		String expected ="HDFC_0012";

		Assert.assertEquals(actual, expected);
	}

}
