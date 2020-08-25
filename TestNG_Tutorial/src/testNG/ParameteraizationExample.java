package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameteraizationExample {
	
	//to give some data from XML file to the program - we use parameteraization
	// Scenario - to update the testcases to the ALM(like a local testcase repo)
	
	@Test
	@Parameters("Name")
	public void printName(String name) {
		System.out.println("My name is " + name);
		
	}

}
