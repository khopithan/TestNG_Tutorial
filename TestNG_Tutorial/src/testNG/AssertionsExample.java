package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	
	String name = "Khopi";
	boolean value = false;
	
	@Test
	public void checkEqual() {
		
		/*
		 * if(name.equals("Khopi")) { System.out.println("Name is equal"); }else {
		 * System.out.println("Nmae is not equal"); }
		 */
		
		
		// for Unit testing - for the self review of the code for developers to their own code 
		
//------------------------------------------------------------------------------------------------------------------
		
		// Assert.assertEquals(name, "Agni");  //for String -------- Assertion error
		// Assert.assertNotEquals(name, "Agni"); //for String -------- Success
		
		// Assert.assertTrue(value, "Hi"); // for boolean ----------- Assertion error 
		 Assert.assertFalse(value, "Hi"); // for boolean -----------  Success
		
		
	}

}
