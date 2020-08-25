package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	
	/*
	 * Scenario : A big basket having different kinds of mobiles. Let's say there
	 * are apple, mottoG, vivo and mottoG. I want to run tests only for vivo and
	 * lenova. Write a program for that...
	 */
	
	@Test(groups = {"Apple"}) 
	public void apple1() {
		System.out.println("Apple1 testing");
	}
	
	@Test(groups = {"Apple"})  
	public void apple2() {
		System.out.println("Apple2 testing");
	}
	
	@Test(groups = {"Lenova"}) 
	public void lenova1() {
		System.out.println("lenova1 testing");
	}
	
	@Test(groups = {"Lenova"})  
	public void lenova2() {
		System.out.println("lenova2 testing");
	}
	
	@Test(groups = {"MottoG"})  
	public void mottoG1() {
		System.out.println("mottoG1 testing");
	}
	
	@Test(groups = {"MottoG"})   
	public void mottoG2() {
		System.out.println("mottoG2 testing");
	}
	
	
	@Test(groups = {"Vivo"})   
	public void vivo1() {
		System.out.println("vivo1 testing");
	}
	
	
	@Test(groups = {"Vivo"})  
	public void vivo2() {
		System.out.println("vivo2 testing");
	}
	

}
