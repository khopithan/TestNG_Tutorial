package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	
	// Prob1 - you have to admit a student to Engineering
	// Prob2 - you have to admit a student to higher secondary
	
	@Test(enabled = true)
	public void highSchool() {
		System.out.println("HighSchool");
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void higherSecSchool() {
		System.out.println("HigherSecSchool");
	}
	
	@Test(dependsOnMethods = "higherSecSchool")
	public void engineering() {
		System.out.println("Engineering");
	}

}
