package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTesting {

	@Test
	public void testDemo() {
		System.out.println("hi");
		
		Reporter.log("Welcome to Testing",true);
		Reporter.log("bye",false);
		Reporter.log("abcd");
	}
}
